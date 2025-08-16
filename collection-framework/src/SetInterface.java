import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		//hashset store only unique values but not in sorted order
		//keep order as it is
		Collection<Integer> rollno = new HashSet <Integer>();
		rollno.add(1);
		rollno.add(2);
		rollno.add(3);
		rollno.add(1);
		rollno.add(2);
		rollno.add(3);
		rollno.add(12);
		rollno.add(22);
		rollno.add(37);
		
		System.out.println("hashset \n"+rollno);
		
		//treeset unique and sort the elements
		Collection<Integer> uniqueRollNo = new TreeSet<Integer>();
		uniqueRollNo.addAll(rollno);
		System.out.println("Tree set: unique and in sorted order \n"+uniqueRollNo);
		
		System.out.println("iterator");
		Iterator<Integer> obj = rollno.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}

	}

}
