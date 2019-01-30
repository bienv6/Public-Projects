import java.text.DecimalFormat;
import java.text.Format;

public class BankAccount {
	private double balance; 
	private double interestRate; 
	
	public BankAccount() {};
	
	public BankAccount(double bal, double ir) {
			balance = bal;
			interestRate = ir;
		}
	
	public void SetInterestRate(double rate) {
			interestRate = rate;
		}
	
	public double GetInterestRate() {
			return interestRate;
		}
	
	public double GetBalance() {
			return balance;
		}
	
	public void MakeDeposit(double depositAmount) {
			balance += depositAmount;
	}
	
	public void MakeWithdrwal(double withdrawAmount) {
			balance = balance - withdrawAmount;
	}
	
	public void Compound() {
			balance = balance * (1 + interestRate);
	}
	
	public String toString() {
		return "Account Balance: $"+ this.balance  + "\n Interest Rate: " + this.interestRate;
	}

}



