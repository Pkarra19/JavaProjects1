/**
 * Pranav Karra Lab 3 The following program will hold data about a
 * payroll class. The class will have the following fields: employee name, ID
 * number, hours worked, hourly pay rate, and grosspay. This will also use
 * constructors that accept employee name and ID number as arguments. It will
 * also have appropriate mutator and accessor methods.
 */
public class Payroll { // begin class
	private String employeeName;
	private int idNumber;
	private double hourlyPayRate;
	private double hoursWorked;

	/**
	 * The Constructor accepts arguments for employee name and ID number
	 * 
	 * @param EmployeeName
	 * @param IdNumber
	 */
	public Payroll(String Name, int ID) {
		employeeName = Name;
		idNumber = ID;
	}

	/**
	 * The get employeename method returns the value stored in the
	 * getEmployeeName field
	 * 
	 * @return employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * The get idnumber method returns the value stored in the getIdNumber field
	 * 
	 * @return idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * The setHourlyPayRate method accepts a argument that is stored in the
	 * hourlyPayRate field
	 * 
	 * @param hourlyPayRate
	 */
	public void setHourlyPayRate(double rate) {
		hourlyPayRate = rate;
	}

	/**
	 * The setHoursWorked method accepts a argument that is stored in the
	 * hoursWorked field
	 * 
	 * @param hoursWorked
	 */
	public void setHoursWorked(double work) {
		hoursWorked = work;
	}

	/**
	 * The getHourlyPayRate method returns the value stored in the hourlyPayRate
	 * field
	 * 
	 * @return hourlyPayRate
	 */
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	/**
	 * The getHoursWorked method returns the value stored in the hoursWorked
	 * field
	 * 
	 * @return hoursWorked
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * The getGrossPay method returns the value stored in the hourlyPayRate *
	 * hoursWorked field
	 * 
	 * @return hourlyPayRate * hoursWorked
	 */
	public double getGrossPay() {
		return hoursWorked * hourlyPayRate;
	}

} // end class
