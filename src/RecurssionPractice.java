
import java.util.HashMap;

import javax.print.DocFlavor.INPUT_STREAM;

/**
 * 
 */

/**
 * this program is for practicing reursive function
 *
 */
public class RecurssionPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		System.out.println("---------------------------------------Print the the power result ---------------------------------------------------");
		System.out.println("Result "+pow(2, 3));
		System.out.println("---------------------------------------Print the factorial result ---------------------------------------------------");
		System.out.println("Result "+factorail(5));
		System.out.println("---------------------------------------Print the reverse string -----------------------------------------------------");
		revString("fatma",4);
		System.out.println();
		System.out.println("---------------------------------------Print the increment nd decrement array ---------------------------------------");
		pattren(0,5);
		System.out.println();
		System.out.println("---------------------------------------Print the fibonacci of "+ n+"------------------------------------------------------");
		for (int i=0; i<n;i++) {
			System.out.print(" "+fabonacci(i));
		}
		System.out.println();
		System.out.println("---------------------------------------check if the string is plaindrom ------------------------------------------------------");
		System.out.println("Result "+plaindrom("madam", 0));
		

	}
	
 /**
  * 
  * @param base
  * @param exponant
  * @return the power result using recurssive function
  */
	public static int pow(int base, int exponant) {
		// TODO Auto-generated method stub
		if(exponant==0)
			return 1;
		else
		   return base* pow(base, exponant-1);
	}
	
	/**
	 * 
	 * @param num: the number we went to find the factorial
	 * @return : the factorial of an integer(num)
	 */
	public static int factorail(int num) {
		
		if (num == 1)
			return 1;
		else {
			return num * factorail(num-1);
		}	
		
	}
	
	/**
	 * 
	 * @param str : the string to find it reverse
	 * @param size : the string size _ 1
	 * @return the reverse function 
	 */
	
	public static String revString(String str, int size) {
		if ( size < 0)
			return str;
		else 
			System.out.print(str.charAt(size));
			return revString(str,size-1);	
	}
	
	/**
	 * @param number:the start and end number.
	 *  to print the numbers starting from number till 0 incrementing and decremention
	 * @return 
	 */
	public static int pattren(int number, int input) {
		
		if (number == input)
			return number;
		else {
			
			System.out.print(number);
		    pattren(number+1, input);
			System.out.print(number);
			return number;
		}	
		
	}
	
	
	
	/**
	 * 
	 * @param n: to find the number fibonacci
	 * @return the fibonacci of an integer n 
	 */
	public static int fabonacci(int n) {
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else {
			//System.out.println();
			return fabonacci(n-1)+fabonacci(n-2);
		}
		
	}
	
	
	/**
	 * 
	 * @param str: the using input string to check if it's palindrom or not.
	 * @param index to go throgh the index of the str.
	 * @return true if the str is palindrom otherwise return false.
	 */
	public static boolean plaindrom(String str, int index) {
		if (index> str.length()/2) {
			return true;
		}
		return (str.charAt(index)==str.charAt(str.length()-(1+index))) && plaindrom(str, index+1);
		
		
	}
}


