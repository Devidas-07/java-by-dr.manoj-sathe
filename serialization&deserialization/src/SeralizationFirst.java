
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SeralizationFirst {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Animal cat = new Animal();
		
		
		FileOutputStream fos = new FileOutputStream("cat.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cat);
		oos.close();
		
		
		FileInputStream fis = new FileInputStream("cat.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Animal cat2 =(Animal)ois.readObject();
		System.out.println(cat2.nickName);
		ois.close();

	}

}
class Animal implements Serializable{
	String name = "cat";
	String nickName = "mau";
	
}