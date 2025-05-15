
public class CustomException {

	public static void main(String[] args) {
		
		int age=1;
		if(age<10) {
			try {
			throw new ManualException("you are british");
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

	}

}
class ManualException extends Exception{

	
	public ManualException(String msg) {
		super(msg);
	}
	
}
