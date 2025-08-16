import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface {

	public static void main(String[] args) {
		ArrayList c = new ArrayList();
		System.out.println(c);
		System.out.println(c.size());
		c.add("sham");
		c.add("ram");
		c.add("abc");
		System.out.println(c);
		System.out.println(c.contains(c.get(0)));
		System.out.println(c.get(0));
		c.add(null); //we can add null
		c.remove(0);
		System.out.println(c);
		
		ArrayList c1 = new ArrayList();
		System.out.println(c1);
		c1.addAll(c);
		System.out.println(c1);
		c1.removeAll(c);
		System.out.println(c1);
		System.out.println(c1.indexOf("abc"));
		
		Collection<Integer> c12 = new ArrayList<Integer>();
		for(int num: c12) {
			
		}
		//if you want to work with indexes then you can use list interface
		
		List<String> students = new ArrayList<String>(); //instead of ArrayList if you used List() then you need to give implementation to all methods of List (I)
		students.add("abc");
		students.add("pqr");
		System.out.println("student at index "+students.indexOf("abc")+" is "+students.get(0));
	}

}
