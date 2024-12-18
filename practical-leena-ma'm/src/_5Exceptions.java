
public class _5Exceptions {

	public static void main(String[] args) {
		try {
			int result = 10/0;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		try {
			int [] arr = {1,2,3};
			int num = arr[5];
			System.out.println(num);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
		String s1 = "abc";
		try {
		System.out.println(s1.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
		int num = Integer.parseInt(s1);
		System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
