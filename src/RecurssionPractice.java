
import java.util.HashMap;

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
		int n=7;
		
		System.out.println("---------------------------------------Print the the power result ---------------------------------------------------");
		System.out.println("Result "+pow(2, 3));
		System.out.println("---------------------------------------Print the factorial result ---------------------------------------------------");
		System.out.println("Result "+factorail(5));
		System.out.println("---------------------------------------Print the reverse string -----------------------------------------------------");
		revString("fatma",4);
		System.out.println();
		System.out.println("---------------------------------------Print the increment nd decrement array ---------------------------------------");
		pattrenIn(4);
		System.out.println();
		System.out.println("---------------------------------------Print the fibonacci of "+ n+"------------------------------------------------------");
		System.out.println("Result "+fabonacci(n));
		

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
	 */
	public static void pattrenIn(int number) {
		
		if (number==1)
			System.out.print(1);
		else {
			System.out.print(number);
		    pattrenIn(number-1);
			System.out.print(number);		
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
			return fabonacci(n-1)+fabonacci(n-2);
		}
		
	}
}


