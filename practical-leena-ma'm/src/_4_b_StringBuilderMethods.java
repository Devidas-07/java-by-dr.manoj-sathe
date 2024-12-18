
public class _4_b_StringBuilderMethods {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		System.out.println("capacity of sb "+sb.capacity());
		
		//apend method
		sb.append("stringBuilder");
		System.out.println("sb after append method: "+sb);
		
		//charsequence constructor
		StringBuilder sb1 = new StringBuilder("PPPQQQRRR");
		System.out.println("charsequence constructor: "+sb1.toString());
		
		//StringBuilder(String) constructor
		StringBuilder sb3 = new StringBuilder(sb.toString());
		System.out.println("StringBuilder(String) constructor: "+sb3);
		
	}

}
