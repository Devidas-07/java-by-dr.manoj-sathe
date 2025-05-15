package bytestream;

import java.io.*;


public class FileInputStreamExample {

	public static void main(String[] args) throws FileNotFoundException , IOException{
		//FileOutputStream fos = new FileOutputStream("newFile.txt");
		
		FileInputStream fis = new FileInputStream("newFile.txt");
//		int result = fis.read();
		InputStreamReader isr = new InputStreamReader(fis);
		int result;
		while((result =isr.read())!=-1) {
			
			char character = (char) result;
			System.out.println(character);
		}
//		System.out.println("result is: "+result);
//		System.out.println("result in char is: "+(char)result);

	}

}
