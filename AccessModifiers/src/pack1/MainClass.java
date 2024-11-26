package pack1;
import pack2.*;
public class MainClass extends B
{

	public static void main(String[] args) {
	//new MainClass().m1(); 
	//when your method and variables are protected then by only using object of child class you can access(inheritance)
	
		MainClass mainObj1 = new MainClass();
		mainObj1.m1();
		
		B b = new B();
		//b.m1();
		//here we have not access of m1 method of B class because m1 method is protected
		
		B mainObj2 = new MainClass();
		

	
	}

}

