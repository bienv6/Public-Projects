package Tickets;
public class StudentAdvanceTicket extends AdvanceTicket {

	public StudentAdvanceTicket(int num, int dIA) {
		super(num, dIA);
		this.price = setPrice();
	}
	
	
	@Override
	public double setPrice() {
		 double cost = 0.0;
		if(daysInAdvance > 0 && daysInAdvance <10) {
			cost = 40.00;
		}
		else if(daysInAdvance >= 10) {
			cost = 30.00;
		}
		else {
			cost = 50.00;
		}
		return cost;
	}

	
	public String toString() {
		return "\nTicket Number: "+this.number  + ", Price:  $" + this.price + " (ID required)\n";
	}

}
