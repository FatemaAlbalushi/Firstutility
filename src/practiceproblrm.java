import java.util.ArrayList;
import java.util.HashMap;


/**
 * This program is about different function that we will practice recurssion using them.
 */
public class practiceproblrm {

	/**
	 * @param args
	 * the main will call 5 functions using the initilisation var.
	 * 1. Evenodd function which will take array of numvers and return the hashmap which contain two array list one for even number and other one for odd number.
	 * 2. power function which take the base and the exponantial and return the result.
	 * 3. reverseString function which take a string and return the reverse of it.
	 * 4. factorial function which takes an integer  and return the result of it's factorial.
	 * 5. palindrom function which takes a string as input and check if it can be read from two ways and return ture if yes otherwise return fales.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number= {2,3,7,6,9,4,5,7};
		String string ="This is the string";
		int n =5;
		String str="madam";
        String str1= "Something";
		
		System.out.println("Print Even and Odd number");
		EvenOdd(number);
		System.out.println();
		System.out.println("Print exponantial base");
		power(2,3);
		System.out.println();
		System.out.println("Print the Reverse string");
		reverseString(string);

		System.out.println();
		System.out.println("Print the factoraial of "+n);
		factorial(5);
		
		System.out.println();
		System.out.println("Check if the string is plaindrom");
         palindrom(str);;
		
	}
	
	/**
	 * @param arrayInput : the array that contain  even and odd number.
	 *  method to chech the even and odd number from the array
	 */
	
	public static void EvenOdd(int[] arrayInput) {
		// create 
		HashMap<String,ArrayList<Integer>> evenosshashmap=new HashMap<>();
		
		ArrayList<Integer>even=new ArrayList<>();
		ArrayList<Integer>odd=new ArrayList<>();
		for(int index=0; index<arrayInput.length;index++) {
			if ( arrayInput[index] %2 == 0) {
				even.add(arrayInput[index]);
				evenosshashmap.put("Even", even);
			}	
		}
		for(int j=0; j<arrayInput.length;j++) {
			if ( arrayInput[j] %2 != 0) {
				odd.add(arrayInput[j]);	
				evenosshashmap.put("Odd", odd);	
			}
		}
		System.out.println( evenosshashmap);	
	}
	
	/**
	 * 
	 * @param base
	 * @param exponrnt
	 *  method to return the power exponanial of an integer
	 */
	public static void power(int base ,int exponrnt) {
		HashMap<String,Integer> resultOutput=new HashMap<>();
		HashMap<Integer,Integer> input=new HashMap<>();
		input.put(base, exponrnt);
		
		int result=1;
		
		for (;exponrnt!=0;exponrnt--) {
			result *= base;
		}
		resultOutput.put("result", result);
		System.out.println(input);
		System.out.println(resultOutput);
	}
	
	
	/**
	 * 
	 * @param userstring: the input string which we went to find the reverse of it.
	 * method to return the reverse of a string
	 */
	public static void reverseString(String userstring) {
		
		for(int character = userstring.length()-1;character >=0 ; character--) {
			 
			System.out.print(userstring.charAt(character));
		}
		System.out.println();
			
	}
	
	/**
	 * 
	 * @param n : the number we passed to the function to find the 
	 *  method to return the factorail of an integer
	 */
	public static void factorial(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			
			result*=i;
			
		}
		System.out.println(result);	
	}
	
	/**
	 * 
	 * @param string: the string that we neeed to check if it's palindrom or not
	 * method to chech if the string is pailndrom or not
	 */
	public static void palindrom(String string) {
		
		String revString="";
		boolean palindrom=false;
		
		for(int index = string.length()-1;index >=0; index--) {
			
			revString+=string.charAt(index);
		}
		
		if (string.equals(revString)) {
			palindrom=true;
			
		}
		System.out.println(palindrom);
		
	}
	

}
