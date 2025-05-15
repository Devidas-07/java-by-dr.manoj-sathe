package collection;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("teacher");
		al.add(4);
		al.add(null);
		al.add(false);
		al.add(89.8);
		al.add(new Student());
		
		System.out.println(al);
	}

}
class Student{
	
}