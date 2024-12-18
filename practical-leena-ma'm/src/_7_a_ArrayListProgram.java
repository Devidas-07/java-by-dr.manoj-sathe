import java.util.ArrayList;
import java.util.Scanner;

public class _7_a_ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.println("add color in list");
			String color = s.nextLine();
			list.add(color);
			System.out.println("do you want to add more? true/false");
			boolean ans = s.nextBoolean();
			if(!ans) {
				break;
			}
		}
		System.out.println("your colors");
		for(String s: list) {
			System.out.println(s);
		}
	}

}

