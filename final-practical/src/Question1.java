
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) throws CheckMarksRange {
			checkScoreRange();
			checkEligibility();
		checkEmail();
	}

	public  static void checkScoreRange() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your cet score");
		
		double score = s.nextDouble();
		
		
		System.out.println("score is:"+score);
		try {
			if(score>100.00 || score<0.00) {
				System.out.println("in if block");
				throw new CheckMarksRange("please enter valid cet score");
			}
			else {
				System.out.println("good score");
			}
			
		}
		catch(CheckMarksRange e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(score<80 || score>100) {
				throw new CutOfOutOfBoundException("you are not eligible for MIBS");
			}
			else {
				System.out.println("you are eligible for mibs");
			}
		}
		catch(CutOfOutOfBoundException c) {
			System.out.println(c.getMessage());
		}
	}

	public static void checkEligibility() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your age");
		short age = s.nextShort();
		try {
			if(age<=0 || age>100) {
				throw new InvalidAge("enter valid age");
			}
			else {
				System.out.println("correct age");
			}
		}
		catch(InvalidAge i) {
			System.out.println(i.getMessage());
		}
		try {
			if(age<18) {
				throw new LowAge("first complete your graduation");
			}
			else {
				System.out.println("you are eligible for mca");
			}
		}
		catch(LowAge l) {
			System.out.println(l.getMessage());
		}
	}

	public static void checkEmail() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter email");
		String email = s.nextLine();
		
		try {
			if(!(email.contains("@"))) {
				throw new IncorrectEmail("enter valid email");
				
			}
			else {
				System.out.println("valid email");
			}
		}
		catch(IncorrectEmail e) {
			System.out.println(e.getMessage());
		}
	}
}

class CheckMarksRange extends Exception {
	public CheckMarksRange(String msg) {
		super(msg);
	}
}
class CutOfOutOfBoundException extends Exception{
	public CutOfOutOfBoundException(String msg) {
		super(msg);
	}
}
class InvalidAge extends Exception{
	public InvalidAge(String msg) {
		super(msg);
	}
}
class LowAge extends Exception{
	public LowAge(String msg) {
		super(msg);
	}
}
class IncorrectEmail extends Exception{
	public IncorrectEmail(String msg) {
		super(msg);
	}
}