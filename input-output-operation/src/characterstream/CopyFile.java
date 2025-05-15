package characterstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("file1.txt");
		
		FileWriter fw = new FileWriter("file2.txt");
		int c;
		while((c=fr.read())!=-1) {
			System.out.println((char)c);
			fw.write((char)c);
		}
		System.out.println("file copied successfully");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
