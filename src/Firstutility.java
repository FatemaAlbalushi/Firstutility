import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * This program have 2 method to find the largest number in an array as well
 * return an array with the largest , second largest and third largest number
 */
public class Firstutility {

	/**
	 * this is the main method to find the first three largest element in an array
	 * using Largest and SLargest method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the largest element in an array, second largest and third largest

		System.out.println("------------------------ Largest number---------------------------------");
		int[] arr = { 50, 12, -8, 10, 1001, -6, 87, 24 };
		int[] new_arr = new int[3];
		new_arr = SLargest(arr);

		System.out.println("The largest element is " + Largest(arr)); // printing the largest element
		// printing an array with both largest , second largest and third largest element
		System.out.println("The largest and Secound largest element is " + "[" + new_arr[0] + "," + new_arr[1]+ "," + new_arr[2] + "]");

	}

	// method to find the largest number in an array
	public static int Largest(int[] number) {

		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}

		}
		return max;

	}

	// method to find both largest , second largest and third largest number in an array
	public static int[] SLargest(int[] number) {

		int[] new_arr = new int[3];
		int max = number[0]; // The largest element
		int smax = number[0]; // The Second largest element
		int thmax = number[0]; // The Third largest element

		for (int j = 0; j < number.length; j++) {
			if (number[j] > max) {
				max = number[j];
			}
			if (number[j] > smax && number[j] < max ) {
				smax = number[j];
			}
			if (number[j] > thmax && number[j] < smax ) {
				thmax = number[j];
			}
		}

		new_arr[0] = max;
		new_arr[1] = smax;
		new_arr[2] = thmax;

		return new_arr;

	}

}
