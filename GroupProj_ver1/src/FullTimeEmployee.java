public class FullTimeEmployee extends Employee{
	
	private double annualSalary;

	public FullTimeEmployee(){
		super();
		annualSalary = 0;
	}	
	
	public FullTimeEmployee( double s){
		super();
		annualSalary = s;
	}	
	
	public void setSalary(double s){
		annualSalary = s;
	}
	
	public double getSalary(){
		return annualSalary;
	}
	
	public double calculateWeeklyPay(){
		return annualSalary/52;
	}
}
