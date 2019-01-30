package Tickets;
public class WalkUpTicket extends Tickets{

	public WalkUpTicket(int num) {
		super(num);
		this.price = setPrice();
	}

	@Override
	public double setPrice() {
		return 50.00;
	}
	
	

}
