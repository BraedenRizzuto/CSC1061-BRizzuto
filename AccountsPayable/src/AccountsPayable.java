//Braeden Rizzuto

import java.util.Scanner;

public class AccountsPayable {

	static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		Employee payableEmployees[] = new Employee[6];

		int i = 0;
		while (i < 6) {
			System.out.println("what is the employee first name?");
			String firstName = input.nextLine();

			System.out.println("what is the employee last name? ");
			String lastName = input.nextLine();

			System.out.println("what is the employee ssn?");
			String ssn = input.nextLine();

			System.out.println("enter employee type");
			String empType = input.nextLine();

			if (empType.equals("salary")) {
				System.out.println("enter employees weekley salary?");
				double weekSal = input.nextDouble();
				SalariedEmployee myEmployeeSalary = new SalariedEmployee(firstName, lastName, ssn, weekSal);
				// System.out.println(myEmployeeSalary.toString());
				payableEmployees[i] = myEmployeeSalary;

			} else if (empType.equals("hourly")) {
				System.out.println("enter employees hourly wage");
				double hourWage = input.nextDouble();

				System.out.println("enter employees number of hours");
				double hrs = input.nextDouble();
				HourlyEmployee myEmployeeHourly = new HourlyEmployee(firstName, lastName, ssn, hourWage, hrs);
				// System.out.println(myEmployeeHourly.toString());
				payableEmployees[i] = myEmployeeHourly;
			} else if (empType.equals("commission")) {
				System.out.println("enter employees gross sales");
				double grossSale = input.nextDouble();

				System.out.println("enter employees commission rate");
				double comRate = input.nextDouble();

				CommissionEmployee myEmployeeCommission = new CommissionEmployee(firstName, lastName, ssn, grossSale,
						comRate);
				// System.out.println(myEmployeeCommission.toString());
				payableEmployees[i] = myEmployeeCommission;
			} else if (empType.equals("base plus commission")) {
				System.out.println("enter employees gross sales");
				double grossSale = input.nextDouble();
				System.out.println("enter employees commission rate");
				double comRate = input.nextDouble();
				System.out.println("enter employees base pay");
				double basePay = input.nextDouble();

				BasePlusCommisionEmployee myEmployeeBPC = new BasePlusCommisionEmployee(firstName, lastName, ssn,
						grossSale, comRate, basePay);
				payableEmployees[i] = myEmployeeBPC;
			}
			i++;
			input.nextLine();

		}
		i = 0;
		while (i < 6) {
			System.out.println(payableEmployees[i].toString());
			i++;

		}
		System.out.println("get statments");
		for (Employee emp : payableEmployees) {
			typeEmp(emp);
		}

		System.out.println("name and payment amount plus payment amount *10 if employee is bpc");
		int k = 0;
		while (k < 6) {
			System.out.println(payableEmployees[k].getFirstName());
			System.out.println(payableEmployees[k].getLastName());
			if (payableEmployees[k] instanceof BasePlusCommisionEmployee) {
				System.out.println(payableEmployees[k].getPaymentAmount() * 1.1);
			} else {
				System.out.println(payableEmployees[k].getPaymentAmount());
			}
			k++;
		}

	}

	public static void typeEmp(Employee myEmployee) {

		if (myEmployee instanceof SalariedEmployee) {
			System.out.println(((Employee) myEmployee).getFirstName());
			System.out.println(((Employee) myEmployee).getLastName());
			System.out.println(((Employee) myEmployee).getSsn());
			System.out.println(((SalariedEmployee) myEmployee).getPaymentAmount());
		} else if (myEmployee instanceof HourlyEmployee) {
			System.out.println(((Employee) myEmployee).getFirstName());
			System.out.println(((Employee) myEmployee).getLastName());
			System.out.println(((Employee) myEmployee).getSsn());
			System.out.println(((HourlyEmployee) myEmployee).getHrs());
			System.out.println(((HourlyEmployee) myEmployee).getHourWage());
			System.out.println(((HourlyEmployee) myEmployee).getPaymentAmount());
		} else if (myEmployee instanceof CommissionEmployee) {
			System.out.println(((Employee) myEmployee).getFirstName());
			System.out.println(((Employee) myEmployee).getLastName());
			System.out.println(((Employee) myEmployee).getSsn());
			System.out.println(((CommissionEmployee) myEmployee).getGrossSale());
			System.out.println(((CommissionEmployee) myEmployee).getComRate());
			System.out.println(((CommissionEmployee) myEmployee).getPaymentAmount());
		} else if (myEmployee instanceof BasePlusCommisionEmployee) {
			System.out.println(((Employee) myEmployee).getFirstName());
			System.out.println(((Employee) myEmployee).getLastName());
			System.out.println(((Employee) myEmployee).getSsn());
			System.out.println(((Employee) myEmployee).getPaymentAmount());

		}

	}
}
