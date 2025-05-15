
public class practical {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("In Internal Practical");
		StringBuilder sb1 = new StringBuilder("MIBS nigdi pune");
		System.out.println(sb1.capacity());
		System.out.println(sb);
		sb.append(" in mibs");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		String newString =sb.toString();
		sb1.delete(3, 6);
		System.out.println(sb1);
		
		System.out.println(sb1.indexOf("i"));
		System.out.println(sb1.reverse());
		sb1.replace(4, 6, "bb");
		System.out.println(sb1);
		sb1.append(true);
		System.out.println(sb1);
	}

}
