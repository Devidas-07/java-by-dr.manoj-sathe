
public class Palindrom {

	public static void main(String[] args) {
		/*
		StringBuffer s1 = new StringBuffer("jhggfddd");
		StringBuffer news1 = new StringBuffer();
		for (int i = s1.length() - 1; i >= 0; i--) {

			news1.append(s1.charAt(i));

		}
		System.out.println(news1);
		if (s1.toString().equals(news1.toString())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		*/
		
		String name="dkjf;djfoi";
		
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
