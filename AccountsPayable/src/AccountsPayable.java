//Braeden Rizzuto

import java.util.Scanner;

public class AccountsPayable
{
	
	static Scanner input;

	public static void main(String[] args)
	{
		 
		input = new Scanner ( System.in );
		String employee;
		Employee payableEmployees []= new Employee [6];
		
		
		System.out.println("what is the employee first name?");
		String firstName= input.nextLine();
		
		System.out.println(firstName);
		
		System.out.println("what is the employee last name? ");
		String lastName= input.nextLine();
		System.out.println(lastName);
		
		System.out.println("what is the employee ssn?");
		String ssn= input.nextLine();
		System.out.print(ssn);
		
		Employee myEmployee = new Employee ( firstName,lastName,ssn);
		
		System.out.println("enter employees weekley salary?");
		double weekSal=input.nextDouble();
		
		 SalariedEmployee myEmployee1= new SalariedEmployee(firstName, lastName, ssn, weekSal);
		 
		 System.out.println("enter employees gross salary");
		 double grossSal=input.nextDouble();
		 System.out.println("enter employees commission rate");
		 double comRate=input.nextDouble();
		 
		 CommissionEmployee myEmployee2= new CommissionEmployee( firstName, lastName,  ssn,  grossSal,  comRate);
		
		 System.out.println("enter employees hourly wage");
		 double hourWage = input.nextDouble();
		 System.out.println("enter employees number of hours");
		 double hrs=input.nextDouble();
		 
		 HourlyEmployee myEmployee3= new HourlyEmployee( firstName, lastName, ssn, hourWage, hrs);
		 
		 System.out.println("enter employees base pay");
		 basePay=input.nextDouble();
		 
		 BasePlusCommissionEmployee myEmployee4= new BasePlusCommissionEmployee(firstName,lastName,ssn,grossSal, comRate,
					 basePay) 
		 
		
		System.out.println("what type of employee are you?");
		employee = input.nextLine();
		System.out.print(employee);
		
		if (employee.equals("commission"))
		{
			//System.out.println("what is your commission rate?");
			//double commissionRate=input.nextDouble();
			
			//System.out.println("what is your gross salary?");
			//double grossSalary=input.nextDouble();
			//this()commissionEmployee(  );
			System.out.println(myEmployee.toString());
		}
		//printDetails(myEmployee,employee);
		
		// TODO Auto-generated method stub
	}
		
	
		
	

}
