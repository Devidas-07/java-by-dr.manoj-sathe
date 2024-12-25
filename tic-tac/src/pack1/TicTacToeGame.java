package pack1;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    // MySQL database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/tictactoe?useSSL=false&serverTimezone=UTC"; // Ensure this is correct
    private static final String USER = "root";   // Change to your MySQL username
    private static final String PASS = "PFH#23kgrw9";  // Change to your MySQL password

    // Method to connect to the MySQL database
    private static Connection connect() {
        try {
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to insert a new player into the database
    private static void addPlayer(String name) {
        try (Connection conn = connect()) {
            String sql = "INSERT INTO players (name, score) VALUES (?, 0)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, name);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to update player score after winning
    private static void updatePlayerScore(String name) {
        try (Connection conn = connect()) {
            String sql = "UPDATE players SET score = score + 1 WHERE name = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, name);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get player score
    private static int getPlayerScore(String name) {
        try (Connection conn = connect()) {
            String sql = "SELECT score FROM players WHERE name = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, name);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return rs.getInt("score");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    // Game board
    private static char[][] board = new char[3][3];
    private static String player1, player2;

    // Initialize the board
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print the board
    private static void printBoard() {
        System.out.println("-----------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-----------");
        }
    }

    // Check for a winner
    private static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    // Check if the board is full
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Human player's move
    private static void humanMove(char symbol, String playerName) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        while (true) {
            System.out.println(playerName + ", enter your move (row and column [0-2]): ");
            row = sc.nextInt();
            col = sc.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = symbol;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // Computer's move
    private static void computerMove(char symbol) {
        Random rand = new Random();
        int row, col;
        while (true) {
            row = rand.nextInt(3);
            col = rand.nextInt(3);
            if (board[row][col] == ' ') {
                board[row][col] = symbol;
                break;
            }
        }
    }

    // Play the game
    private static void playGame(String player1Name, String player2Name, boolean isVsComputer) {
        player1 = player1Name;
        player2 = player2Name;
        char currentPlayer = 'X'; // 'X' starts the game
        while (true) {
            printBoard();
            if (currentPlayer == 'X') {
                if (isVsComputer) {
                    System.out.println(player1 + "'s turn (Human).");
                    humanMove(currentPlayer, player1);
                } else {
                    System.out.println(player1 + "'s turn (Human).");
                    humanMove(currentPlayer, player1);
                }
            } else {
                if (isVsComputer) {
                    System.out.println(player2 + "'s turn (Computer).");
                    computerMove(currentPlayer);
                } else {
                    System.out.println(player2 + "'s turn (Human).");
                    humanMove(currentPlayer, player2);
                }
            }
            if (checkWinner(currentPlayer)) {
                printBoard();
                if (currentPlayer == 'X') {
                    System.out.println(player1 + " wins!");
                    updatePlayerScore(player1);
                } else {
                    System.out.println(player2 + " wins!");
                    updatePlayerScore(player2);
                }
                break;
            }
            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch player
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for player names
        System.out.print("Enter Player 1's name: ");
        String player1Name = sc.nextLine();
        addPlayer(player1Name); // Add player to the database

        System.out.print("Enter Player 2's name: ");
        String player2Name = sc.nextLine();
        addPlayer(player2Name); // Add player to the database

        // Choose game mode
        System.out.println("Choose game mode:");
        System.out.println("1. Two human players");
        System.out.println("2. Human vs Computer");
        int choice = sc.nextInt();

        // Initialize the board
        initializeBoard();

        if (choice == 1) {
            playGame(player1Name, player2Name, false);
        } else if (choice == 2) {
            playGame(player1Name, player2Name, true);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
