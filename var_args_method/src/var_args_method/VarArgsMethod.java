package var_args_method;

public class VarArgsMethod {

	public static void main(String... args) {
		System.out.println(args.length);
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6));

	}
	public static int sum(int ...x) {
		int result =0;
		
		for(int num: x) {
			result = result+num;
		}
		
		return result;
	}

}
