import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class StringReverser {
static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		ArrayList<Character> aList = new ArrayList<Character>();
		//char alph[]= {'a','b','c','d','e','f'};
		String alph1 = "abcd";
		char chStr1;
		char chStr2;
		String nAlph1 = "";
		String nAlph2="";
		System.out.println("orginal string is "+ alph1);
		
	
		for(int i=0;i< alph1.length();i++)
		{
			chStr1=alph1.charAt(i);
			nAlph1= chStr1+nAlph1;
			
		}
		System.out.println("reversed string is "+nAlph1);
		for(int e=0;e< nAlph1.length();e++)
		{
			chStr2=nAlph1.charAt(e);
			aList.add(chStr2);
			//nAlph2= chStr2+nAlph2;
		}
		System.out.println(aList.toString());
		
		
			
			
		
		//String cTos= String.valueOf(alph);
		//System.out.println(cTos);
		//Collections.reverseOrder(cTos);
		
	}
}