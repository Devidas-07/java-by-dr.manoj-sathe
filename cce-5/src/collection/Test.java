package collection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

public class Test {
  public static void main(String args[]) throws Exception {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter first num");
   int one = sc.nextInt();
    System.out.println("enter 2nd num");
   int two = sc.nextInt();
    System.out.println("enter 3rd num");
   int three = sc.nextInt();
    System.out.println("enter 4th num");
   int four = sc.nextInt();
    // Uncomment the following lines if you want to greet the user by name
    // String name = br.readLine();
    // System.out.println("Hi, " + name + ".");

   
    if (one > two && three > four) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}