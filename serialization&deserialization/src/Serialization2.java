import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization2 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// TODO Auto-generated method stub
		Gautam g1 = new Gautam();
		FileOutputStream fos = new FileOutputStream("gautam.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
	}

}
class Gautam implements Serializable{
	
	String name ="guatam";
	int age = 21;
	public void run() {
		System.out.println("gautam is running");
	}
}