/**
 * Employee Class
 *
 * @since 2017-09-19
 * @version 1.0
 */

import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Employee {

	private String f_name;
	private String l_name;
	private String id_number;
	private String so_security;
	private int start_year;
	private String department;
	private int dept_code;

    /**
     * Employee Constructor
     */
	public Employee() {
		
		f_name = "John";
		l_name = "Doe";
		start_year = 2017;
		id_number = createIDNumber();
		department = "IT";
		dept_code = 1000;
	}

    /**
     * Employee Constructor
     * @param firstName Employee first name
     * @param lastName Employee last name
     * @param ssiNumber Employee Social Security Number
     * @param startYr Year employee started on the job
     * @param dept Department
     * @param deptCode Department Code
     */
	public Employee( String firstName, String lastName, String ssiNumber, int startYr, String dept, int deptCode ) {
		
		f_name = firstName;
		l_name = lastName;
		so_security = ssiNumber;
		start_year = startYr;
		department = dept;
		dept_code = deptCode;
		id_number = createIDNumber();
	}

    /**
     * Setter for first name
     * @param name Employee first name
     */
	public void setFirstName(String name) {
		f_name = name;
	}

    /**
     * Setter for last Name
     * @param name employee last name
     */
	public void setLastName(String name) {
		l_name = name;
        id_number = createIDNumber();
	}

    /**
     * Setter for Social Security Number
     * @param ssiNumber Employee Social Security Number
     * @return valid social security
     */
	public boolean setSSI(String ssiNumber) {

		boolean isValid = true;

//		String ssnRegex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
//		Pattern pattern = Pattern.compile(ssnRegex);
//		Matcher matcher = pattern.matcher(ssiNumber);
//		isValid = matcher.matches();

		if(ssiNumber.length() != 11) {

			isValid = false;

		} else {

			for(int i = 0; i <= 10; i++) {

				if( (i == 3) || (i == 6) ) {
					if(ssiNumber.charAt(i) != '-') {
						isValid = false;
					}
				} else {
					if(!Character.isDigit(ssiNumber.charAt(i))) {
						isValid = false;
					}
				}
			}
		}

		if(!isValid) {
			System.out.println("Social Security Number is not Valid");
			return false;
		}

		so_security = ssiNumber;
		return true;
	}

    /**
     * Setter for start year
     * @param year Year employee started working
     */
	public void setStartYr(int year) {
		
		start_year = year;
	}

    /**
     * Setter department
     * @param deptName Department name
     */
	public void setDepartment(String deptName) {
		department = deptName;
	}

    /**
     * Setter Department code
     * @param deptCode Department code
     */
	public void setDeptCode(int deptCode) {
         dept_code = deptCode;	
    }

    /**
     * Create Random ID Number Util Method
     * @return random id number AA-XXXX
     */
	private String createIDNumber() {
		DecimalFormat df= new DecimalFormat("####");
		double num = 1 + Math.random() * 10000;
		String a1 = f_name.substring(0, 1) + l_name.substring(0,1);
		return a1 + "-"+ df.format(num);
	}

	/**
	 * Get First Name
	 * @return string
	 */
	public String getFirstName() {
		return f_name;
	}

	/**
	 * Get Last Name
	 * @return string
	 */
	public String getLastName() {
		return l_name;
	}

	/**
	 * Get Id Number
	 * @return string
	 */
	public String getIdNumber() {
		return id_number;
	}

	/**
	 * Get Social Security Number
	 * @return string
	 */
	public String getSSN() {
		return so_security;
	}

	/**
	 * Get Start Year
	 * @return string
	 */
	public int getStartYear() {
		return start_year;
	}

	/**
	 * Get Department
	 * @return string
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Get Department Code
	 * @return string
	 */
	public int getDeptCode() {
		return dept_code;
	}

	/**
     * Override toString method
     * @return stringify class
     */
	public String toString() {
		
		String b,c,f,j,k;
		j = "\nName   : " + f_name+" "+l_name+"\nEmp-ID : "+id_number+"\nSSN    : " + so_security;
		f = "\n-------------------------";
		c = "\n--- -- -- -- -- -- -- ---\n";
		k = "_________________________";
		b = department +"\tDept-"+dept_code+"\nYear Hired\t" +start_year; 

		return k+f+j+c+b;
	}

}

