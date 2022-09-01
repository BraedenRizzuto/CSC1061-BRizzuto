
import java.util.Scanner;
public class UserInterface {

	
	static Scanner input;
		
	public static void main( String[ ] args )
	{
		boolean isTrue;
		CreditCardValidator classObj;
		classObj= new CreditCardValidator();
		
		
		input = new Scanner ( System.in );
				int sumEven;
		

		System.out.println ( "Enter your credit card number" );
		long cNum = input.nextLong ( );
		
		isTrue = classObj.isValid ( cNum);
		System.out.println ( "this card number is " + isTrue );

}

	

	
}
