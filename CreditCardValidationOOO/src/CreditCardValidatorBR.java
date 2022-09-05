//Braeden Rizzuto
//CreditCard Validator
//Series of methods called from main class
public class CreditCardValidatorBR {
	static final int SIZE = 16;

//method is the hub for the calling of other methods	
	public boolean isValid(long cNum) {
		char[] numArray;
		numArray = new char[SIZE];
		int sumEven;
		int sumOdd;
		int evenOddSum;

		numArray = Long.toString(cNum).toCharArray();//changes num array into a char array
		System.out.println("your credit card number is " + cNum);
		sumOdd = sumOfOddPlace(cNum, numArray);
		System.out.println("sum of odd numbers is" + sumOdd);
		sumEven = sumOfDoubleEvenPlace(cNum, numArray);
		System.out.println("sum of even numbers is" + sumEven);
		evenOddSum = sumEven + sumOdd;
		System.out.println("sum of cNum is " + evenOddSum);
		evenOddSum = evenOddSum % 10;
		if (evenOddSum == 0)//checks the validity of the card based on mod
		{
			return true;
		} else {
			return false;
		}
	}

	//this method adds all the odd placed numbers
	public static int sumOfOddPlace(long cNum, char numArray[]) {
		int sumOdd = 0;
		int i = 15;
		while (i >= 0) {
			sumOdd = Character.getNumericValue(numArray[i]) + sumOdd;
			i = i - 2;
		}
		return sumOdd;
	}

	//if the sum of two of the even digits is >9 it gets sent here
	public static int getDigit(int sumEven, int i, int digit) {
		sumEven = sumEven + ((digit * 2) % 10) + 1;
		i = i - 2;
		return sumEven;
	}

	//gets the sum of the even laced numbers times two
	public static int sumOfDoubleEvenPlace(Long cNum, char numArray[]) {
		int sumEven = 0;
		int i = 14;
		while (i >= 0) {
			int digit = Character.getNumericValue(numArray[i]);
			if (digit * 2 < 10) {
				sumEven = digit * 2 + sumEven;
			} else {
				sumEven = getDigit(sumEven, i, digit);
			}
			i = i - 2;
		}
		return sumEven;
	}

	// public static boolean prefixMatched(long cNum,int i)
	// {
	// }

	// public static int getSize(long d)
	// {
	// }

	// public static long getPrefix( long cNum, int k)
	// {
	// }

}
