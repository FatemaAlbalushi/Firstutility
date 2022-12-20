import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.StyledEditorKit.ForegroundAction;


/**
 * This program will remove any dublication from the array and return new array
 */
public class UniqueChar {

	/**
	 * The main contains the array that we want to remove the dublication element form it.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = { 'c', 'a', 'c', 't', 'r', 'a', 't', 'z' }; //the array with the dublication
		
		System.out.println("Array with duplication");
		System.out.println(alpha);
		System.out.println();
		// Calling the unigCharHm function 
		System.out.println("Array without duplication using Arraylist "+ unigChar(alpha));
		System.out.println();
		
		// Calling the unigCharHm function 
		System.out.println("Array without duplication using hashMap");
		unigCharHm(alpha);
		System.out.println();
		
	

	}

	// Method to remove the dublication using ArrayList
	public static ArrayList<Character> unigChar(char[] charachter) {

		ArrayList<Character> new_arr = new ArrayList<Character>();

		for (char element : charachter) {
			if (!new_arr.contains(element)) {
				new_arr.add(element);

			}
		}

		return new_arr;
	}


	//Method to remove the dublication using HashMap
	public static void unigCharHm(char[] charachter) {

		HashMap<Character, Integer> Newhm = new HashMap<Character, Integer>();

		for (int i = 0; i < charachter.length; ++i) {

			if (Newhm.get(charachter[i]) == null) {
				System.out.print(charachter[i] + " ");
				Newhm.put(charachter[i], 0);
			}
		}

	}
}
