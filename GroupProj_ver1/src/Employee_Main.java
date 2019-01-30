import java.sql.Date;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PartTimeEmployee emp1 = new PartTimeEmployee();
		emp1.setHourlyRate(10.00);
		emp1.setHoursWorked(50.0);
		System.out.print(emp1.calculateWeeklyPay());
		
		FullTimeEmployee emp2 = new FullTimeEmployee();
		System.out.print(emp2);
		
		
		 

	}

}
