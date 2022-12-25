
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
		System.out.println("Result "+pow(2, 3));
		System.out.println("Result "+factorail(5));
		revString("fatma",4);
		System.out.println();
		pattrenIn(4);
		System.out.println();
		System.out.println("Result "+fabonacci(8));
		

	}
	


	public static int pow(int base, int exponant) {
		// TODO Auto-generated method stub
		if(exponant==0)
			return 1;
		else
		   return base* pow(base, exponant-1);
	}
	
	public static int factorail(int num) {
		
		if (num == 1)
			return 1;
		else {
			return num * factorail(num-1);
		}	
		
	}
	
	public static String revString(String str, int size) {
		if ( size < 0)
			//System.out.print("is Empty");
			return str;
		else 
			System.out.print(str.charAt(size));
			return revString(str,size-1);	
	}
	
	
	public static void pattrenIn(int number) {
		
		if (number==1)
			System.out.print(1);
		else {
			System.out.print(number);
		    pattrenIn(number-1);
			System.out.print(number);		
		}	
	}
	
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


