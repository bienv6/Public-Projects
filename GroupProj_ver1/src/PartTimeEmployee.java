
public class PartTimeEmployee extends Employee {
	private double weeklyHousWorked;
	private double hourlyRate;
	
	
	public PartTimeEmployee(){
		super();
		weeklyHousWorked = 0;
		hourlyRate = 0;
	}
	
	public void setHoursWorked(double hw){
		weeklyHousWorked = hw;
	}	
	
	public void setHourlyRate(double hr){
		hourlyRate = hr;
	}

	public double getHoursWorked(){
		return weeklyHousWorked;
	}
	
	public double gethourlyRate(){
		return hourlyRate;
	}	
	public double calculateWeeklyPay(){
		if(weeklyHousWorked > 40){
		
		return ( weeklyHousWorked - 40) * (hourlyRate * 1.5) + (40 * hourlyRate);
	}
		
		else{
			   return weeklyHousWorked * hourlyRate;
			}
	}
	
	
}
