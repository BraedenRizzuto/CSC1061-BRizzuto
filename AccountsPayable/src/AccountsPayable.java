//Braeden Rizzuto

import java.util.Scanner;

public class AccountsPayable {

	static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		String empType;
		Employee payableEmployees[] = new Employee[6];
		int i = 0;
		while (i < 6) {
			System.out.println("what is the employee first name?");
			String firstName = input.nextLine();
			System.out.println(firstName);

			System.out.println("what is the employee last name? ");
			String lastName = input.nextLine();
			System.out.println(lastName);

			System.out.println("what is the employee ssn?");
			String ssn = input.nextLine();
			System.out.println(ssn);
			
			System.out.println("enter employee type");
			empType = input.nextLine();

			if (empType.equals("salary")) {
				System.out.println("enter employees weekley salary?");
				double weekSal = input.nextDouble();
				System.out.println(weekSal);
				SalariedEmployee myEmployeeSalary = new SalariedEmployee(firstName, lastName, ssn, weekSal);
				System.out.println(myEmployeeSalary.toString());
				payableEmployees[i]= myEmployeeSalary;

			} else if (empType.equals("hourly")) {
				System.out.println("enter employees hourly wage");
				double hourWage = input.nextDouble();
				System.out.println(hourWage);

				System.out.println("enter employees number of hours");
				double hrs = input.nextDouble();
				System.out.println(hrs);
				HourlyEmployee myEmployeeHourly = new HourlyEmployee(firstName, lastName, ssn, hourWage, hrs);
				System.out.println(myEmployeeHourly.toString());
				payableEmployees[i]= myEmployeeHourly;
			} else if ((empType.equals("commission"))) {
				System.out.println("enter employees gross sales");
				double grossSale = input.nextDouble();
				System.out.println(grossSale);
				System.out.println("enter employees commission rate");
				double comRate = input.nextDouble();
				System.out.println(comRate);
				CommissionEmployee myEmployeeCommission = new CommissionEmployee(firstName, lastName, ssn, grossSale,
						comRate);
				System.out.println(myEmployeeCommission.toString());
				payableEmployees[i]= myEmployeeCommission;
			}
			i++;
			input.nextLine();
		
		}
		i=0;
		while(i<6 )
		{
			System.out.println(payableEmployees[i].toString());
			payableEmployees[i].getWeekSal();
		}
		// CommissionEmployee myCommissionEmployeeBasePlusCom = new
		// CommissionEmployee(firstName, lastName, ssn, grossSale,
		// comRate);
		// CommissionEmployee myCommissionEmployeeBasePlusCom.findBasePay();
		// System.out.println(myCommissionEmployeeBasePlusCom);

	}

}
