import java.util.StringTokenizer;

public class _4_c_StringTokenizer {

	public static void main(String[] args) {
		StringTokenizer s1= new StringTokenizer("string tokenizer");
		
		while(s1.hasMoreTokens()) {
			System.out.println(s1.nextToken());
			
		}
				

	}

}
