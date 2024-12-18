import java.util.Scanner;

public class _4a_Palindrom {

	public static void main(String[] args) {
		
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String name = s.nextLine();
		s.close();
		
		int start=0;
		int end=name.length()-1;
		boolean result=false;
		while(start<end) {
			if(name.charAt(start)==name.charAt(end)) {
				start++;
				end--;
				result=true;
			}
			else {
				break;
			}
		}
		if(result) {
			System.out.println("palindrom");
		}
		else if(!result) {
			System.out.println("Not palindrom");
		}
	}
	
}
