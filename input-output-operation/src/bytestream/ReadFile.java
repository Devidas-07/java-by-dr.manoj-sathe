package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("shreya.txt");
			//InputStreamReader in = new InputStreamReader(fis);
			
			int t;
			while((t=fis.read())!=-1) {
				char r = (char) t;
				System.out.print(r);
			}
			
		}
		catch(FileNotFoundException f) {
			
		}
		catch(IOException i) {
			
		}

	}

}
