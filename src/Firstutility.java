import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class Firstutility {

	/**
	 * this is the main method to find the smallest and largest element in an array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the largest element in an array
		
	System.out.println("------------------------ Largest number---------------------------------"); 
		int [] arr = {50,12,8,10,1001,6,87,24};
		
		
		System.out.println("The largest element is " + Largest(arr));

	}
	
	// method to find the largest number in an array
	public static int Largest(int [] number) {
		
		int max=0;
		for (int i=0; i<number.length;i++) 
		{
			if (number[i] > max)
			{
				max=number[i];
			}
			
		}
		return max;
		
	}

}
