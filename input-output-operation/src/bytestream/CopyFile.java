package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("copy.txt");
			
			FileOutputStream fos = new FileOutputStream("file1.txt");
			int c;
			while((c= fis.read())!=-1) {
				System.out.println("c is "+(char)c +" "+c);
				fos.write(c);
			}
			System.out.println("file copies successfully");
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
