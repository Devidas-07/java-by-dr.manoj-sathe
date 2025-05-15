package cce4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Question1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		Teacher t1 = new Teacher("abc", 4);
		FileOutputStream fos = new FileOutputStream("cce4.deva");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);
		System.out.println("serialization done");
		
		FileInputStream fis = new FileInputStream("cce4.deva");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Teacher t2 = (Teacher) ois.readObject();
		System.out.println("deserialization done");
		System.out.println("teacher name "+ t2.name);
		System.out.println("teacher experience "+ t2.experience);
	}

}
class Teacher implements Serializable{
	String name;
	float experience;
	
	public Teacher(String name, float ex) {
		this.name= name;
		this.experience= ex;
	}
	
}