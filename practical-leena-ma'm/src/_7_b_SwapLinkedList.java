
import java.util.Collections;
import java.util.LinkedList;

public class _7_b_SwapLinkedList {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("monday");
		l.add("tuesday");
		l.add("wednesday");
		l.add("friday");
		l.add("saturday");
		l.add("sunday");
		
		System.out.println("before swapping");
		System.out.println(l);
		System.out.println("after swapping");
		Collections.swap(l, 3, 0);
		System.out.println(l);
	}

}
