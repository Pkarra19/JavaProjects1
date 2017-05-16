/**
 * Pranav Karra Lab 3 Question 6 The following program will refer to the Payroll class and then ask the
 * user to enter the data for an employee. The program should display amount of gross pay earned.
 */

import java.util.Scanner; //Import Scanner class

public class PayrollDemo { //begin class

	public static void main(String[] args) { //begin method
	

		String employeeName;
		int idNumber;
		double payRate;
		double hoursWorked;

		Scanner keyboard = new Scanner(System.in);
		//Ask user name of the employee
		System.out.println("Enter Employees's name: ");
		employeeName = keyboard.nextLine();
		//Ask user employee's ID
		System.out.println("Enter Employees's ID: ");
		idNumber = keyboard.nextInt();
		
		//Constructor accepts argument for employeeName and idNumber
		Payroll pay = new Payroll(employeeName, idNumber);
		

		System.out.println("Enter the hourly pay rate of this employee");
		payRate = keyboard.nextDouble();

		System.out.println("Enter the number of hours worked by this employee: ");
		hoursWorked = keyboard.nextDouble();
		
		pay.setHoursWorked(hoursWorked);
		pay.setHourlyPayRate(payRate);
		System.out.println("The gross pay of " + employeeName + " is: $" + pay.getGrossPay());

		keyboard.close(); //Closes Scanner input

	} //end method

} //end class
