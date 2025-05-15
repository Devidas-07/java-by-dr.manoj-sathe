package pack1;
import java.util.Observable;
import java.util.Observer;
public class ObsrvableDemo {
	public static void main(String[] args) {
		Apple apple = new Apple(4567.87);
		Rohit rohit = new Rohit();
		Shubham shubham = new Shubham();
		apple.addObserver(rohit);
		apple.addObserver(shubham);
		apple.setPrice(89905.78);
	}
}
class Rohit implements Observer{
	public void update(Observable o , Object arg) {
		System.out.println("rohit is notified. Price changed to "+arg);
	}
}
class Shubham implements Observer{
	public void update (Observable o, Object arg) {
		System.out.println("shubham is notified. Price changed to "+arg);
	}
}
class Apple extends Observable{
	public Apple(double price) {
		this.price= price;
	}
	double price;
	public void setPrice(double newPrice) {
		if(price!=newPrice) {
			setChanged();
			notifyObservers();
		}
	}
}
