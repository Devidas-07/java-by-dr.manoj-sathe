package randomAccess;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class RandomAccessExample {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		File f = new File(s);
		
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		raf.seek(0);
		raf.writeBytes("hello");

	}

}
