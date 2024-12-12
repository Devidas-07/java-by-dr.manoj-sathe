
public class _3AbstractQue {

	public static void main(String[] args) {
		Employee m = new Manager();
		m.calculateSalary();
		m.displayEmployeeDetails();

	}

}
abstract class Employee{
	public abstract void calculateSalary();
	public abstract void displayEmployeeDetails();
} 

class Manager extends Employee{
	String name;
	int days;

	@Override
	public void calculateSalary() {
		System.out.println("salary of manager is "+days*1000);
		
	}

	@Override
	public void displayEmployeeDetails() {
		System.out.println("name of manager is "+name);
		
	}
	
}
class Worker extends Employee{
	String name;
	int days;

	@Override
	public void calculateSalary() {
		System.out.println("salary of worker is "+days*500);
		
	}

	@Override
	public void displayEmployeeDetails() {
		System.out.println("name of worker is "+name);
		
	}
	
}
