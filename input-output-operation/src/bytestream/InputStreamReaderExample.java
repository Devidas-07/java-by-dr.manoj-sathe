package bytestream;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExample {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("enter character");
		try {
			char c =(char)isr.read();
			System.out.println("character is : "+c);
		}
		catch(IOException e) {
			
		}
	}

}
