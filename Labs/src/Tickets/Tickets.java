package Tickets;
import java.text.DecimalFormat;

public abstract class Tickets {
	protected double price;
	protected int number;
	
	public Tickets(int num) {
		number =  (int) (num + Math.random() * 100);
	};
	
	public abstract double setPrice();
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "\nTicket Number: "+ number  + ", Price:  $" + df.format(price) +"\n";
	}

}
