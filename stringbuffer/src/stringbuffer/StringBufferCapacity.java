package stringbuffer;

public class StringBufferCapacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();// default constructor. default capacity is 16
		sb.append("abcdefghijklmnop");
		sb.append("re");
		System.out.println(sb.capacity());
		
		
		//2nd constructor
		StringBuffer sb1 = new StringBuffer(2);
		
		//3rd constructor
		//StringBuffer sb2 = new StringBuffer(String s);
		StringBuffer sb3 = new StringBuffer("MIBS");
		
		

	}

}


