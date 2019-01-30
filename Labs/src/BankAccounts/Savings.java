
public  class Savings extends BankAccount{
	
	/* A private data member called interestRate of type double.*/
	private double interestRate;
	
	/*A default constructor.*/
	public Savings() 
		{
			super.GetAccountNumber();
		}
		
	/* A public setter method, named SetInterestRate(), that makes it
	 possible to assign an interest rate to the private data member
	 interestRate of the class.*/
	public void setInterestRate(double ir) 
		{
			interestRate = ir;
		}
	
	
	/* A public getter method, named GetInterestRate(), that is used to
	get the value of the private data member interestRate*/
	public double GetInterestRate() 
		{
			return interestRate;
		}
		
	/*Override the method MonthlyFees().
	This method should return a monthly fee of $5.00.*/
	public double MonthlyFees() 
		{
			return 5.00;
		}
		
	/*Override the DisplayFees() method from the super class to display
	the following info: account number, interest rate, and monthly fees.
	Note: Make calls to the super class methods whenever possible.*/
	public void DisplayFees() {
		
	 System.out.println("Account Number: "+ GetAccountNumber()+ "\nInterest Rate: " + interestRate 
			 + "\n Monthly Fee: " + this.MonthlyFees());

	}

		
	
}

