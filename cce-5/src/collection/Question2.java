package collection;

import java.util.Vector;

public class Question2 {

	public static void main(String[] args) {
		Vector v = new Vector(5, 8);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add("ram");
		v.add(4);
		v.add(null);
		v.add("mibs");
		
		v.add(true);
		System.out.println(v);
		System.out.println("size of vector "+v.size());
		System.out.println("capacity of vector "+v.capacity());
		
		v.add(89);
		System.out.println("size of vector "+v.size());
		System.out.println(v);
		System.out.println(v.capacity());
		v.add("78");
		v.add("89");
		v.add("89");
		v.add("89");
		System.out.println(v.capacity());
		v.add(8);
		v.add(8);
		v.add("78");
		v.add("89");
		v.add("89");
		v.add("89");
		System.out.println(v.capacity());
		System.out.println(v);
		

	}

}
