/*BankAccount abstract super class
 * October 19, 2017
 */


public abstract class BankAccount {
	
	private String acctNumber;
	
	
	public BankAccount()
	{
		
		acctNumber = "123-45-6789";
	}
	
	public void SetAccountNumber(String a)
	{
		acctNumber = a;
	}
	
	public String GetAccountNumber()
	{
		return acctNumber;
	}
	
	public abstract double MonthlyFees();
	
	public void DisplayFees()
	{
		System.out.println("Account Number " + acctNumber);
	}
		
}
