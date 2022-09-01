
//Braeden Rizzuto
//Credit Card Validation Project
//this project test whether a credit card number is valid using a series of algorithms 
//Due: 8/26/22

import java.util.Scanner;

public class CreditCardValidation
{
	static final int SIZE = 16;
	static Scanner input;

	public static void main( String[ ] args )
	{
		input = new Scanner ( System.in );
		char[ ] numArray;
		numArray = new char[ SIZE ];
		int sumEven;
		int sumOdd;
		int evenOddSum;
		boolean isTrue;

		System.out.println ( "Enter your credit card number" );
		long cNum = input.nextLong ( );
		numArray = Long.toString ( cNum ).toCharArray ( );
		System.out.println ( "your credit card number is " + cNum );

		sumOdd = sumOfOddPlace ( cNum, numArray );
		System.out.println ( "sum of odd numbers is" + sumOdd );
		sumEven = sumOfDoubleEvenPlace ( cNum, numArray );
		System.out.println ( "sum of even numbers is" + sumEven );
		evenOddSum = sumEven + sumOdd;
		System.out.println ( "sum of cNum is " + evenOddSum );
		isTrue = isValid ( cNum, evenOddSum );
		System.out.println ( "this card number is " + isTrue );
	}

	public static boolean isValid( long cNum, int evenOddSum )
	{
		evenOddSum = evenOddSum % 10;
		if ( evenOddSum == 0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static int sumOfOddPlace( long cNum, char numArray[] )
	{
		int sumOdd = 0;
		int i = 15;
		while ( i >= 0 )
		{
			sumOdd = Character.getNumericValue ( numArray[ i ] ) + sumOdd;
			i = i - 2;
		}
		return sumOdd;
	}

	public static int getDigit( int sumEven, int i, int digit )
	{
		sumEven = sumEven + ( ( digit * 2 ) % 10 ) + 1;
		i = i - 2;
		return sumEven;
	}

	public static int sumOfDoubleEvenPlace( Long cNum, char numArray[] )
	{
		int sumEven = 0;
		int i = 14;
		while ( i >= 0 )
		{
			int digit = Character.getNumericValue ( numArray[ i ] );
			if ( digit * 2 < 10 )
			{
				sumEven = digit * 2 + sumEven;
			}
			else
			{
				sumEven = getDigit ( sumEven, i, digit );
			}
			i = i - 2;
		}
		return sumEven;
	}

	//public static boolean prefixMatched(long cNum,int i)
	//{
	//}

	//public static int getSize(long d)
	//{
	//}

	//public static long getPrefix( long cNum, int k)
	//{
	//}

}

