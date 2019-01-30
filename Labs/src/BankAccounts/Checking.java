
public  class Checking extends BankAccount{
	
	private int numChecksWritten;

	public Checking() 
		{
			super.GetAccountNumber();
		}
		
	/* A public method void WriteCheck() 
	 * that adds one to the number of
	 checks written.*/
	
	public void WriteCheck()
		{
			numChecksWritten++;
		}

 	/*A public method void NewMonth() 
	 *that resets the number of checks
	 written to zero.*/
	
	public void NewMonth()
		{
			numChecksWritten = 0;
		}

	/* Override the method MonthlyFees().
	This method should return a monthly fee of $10.00 plus a fee of $.10
	for every check written.*/
	
	public double MonthlyFees() 
		{
			return 10.00 + (numChecksWritten * .10);
		}
		
	/*  Override the DisplayFees() method from the super class to display
	the following info: account number, number of checks written, and
	monthly fees.*/
	public void DisplayFees()
		{
			 System.out.println("Account Number: "+ super.GetAccountNumber() + "\n Number of Checks Written this month: " + numChecksWritten + "\n Monthly Fee: " + this.MonthlyFees());
		}
		
	/*Note: Make calls to the super class methods whenever possible.
	c) (4 pts) Create a UML diagram to represent the BankAccount Hierarchy.*/
}
