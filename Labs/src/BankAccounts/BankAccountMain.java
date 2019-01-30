
public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Savings lexiSav = new Savings();
		lexiSav.setInterestRate(0.04);
		lexiSav.SetAccountNumber("987-25-7798");
		lexiSav.DisplayFees();
		
		System.out.println("------------------------");
		
		Checking lexiChk = new Checking();
		lexiChk.SetAccountNumber("789-25-9877");
		lexiChk.WriteCheck();
		lexiChk.WriteCheck();
		lexiChk.WriteCheck();
		lexiChk.DisplayFees();


		
		
	}

}
