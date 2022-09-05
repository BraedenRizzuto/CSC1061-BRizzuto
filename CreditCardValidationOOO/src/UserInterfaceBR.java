//Braeden Rizzuto
//UserInterface
//Project calls a method from another class and prints the result.
import java.util.Scanner;

public class UserInterfaceBR 
{
	static Scanner input;

	public static void main(String[] args)
	{
		boolean isTrue;
		CreditCardValidator classObj;
		classObj = new CreditCardValidator();
		input = new Scanner(System.in);
		System.out.println("Enter your credit card number");
		long cNum = input.nextLong();

		isTrue = classObj.isValid(cNum);
		System.out.println("this card number is " + isTrue);

	}

}
