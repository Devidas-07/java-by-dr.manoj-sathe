package encapsulation;

class Account {
	private double balance; 
	public double getBalance() {
		//validation
		
		return balance;
	}
	public void deposite(double amount) {
		this.balance=this.balance+amount;
	}
}
