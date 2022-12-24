import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * This program will create array list of array that the submission of the two
 * element equil to the target
 *
 */
public class MatchPair {

	/**
	 * The main will call the function Matchpair using the array and the turet and
	 * will return the arrey list of array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 6, 7, 4, 3, 4, 5, 6 };
		int [] arr1= {6,6,6,4,4,4};
		int target = 10;

		System.out.println("The Array with match pair is : " + Matchpair(arr, target));
		System.out.println();

		System.out.println("The Array with match pair is : ");
		unigCharHm(arr1, target);

	}

	// //method to display match pair using Arraylist
	private static ArrayList<String> Matchpair(int[] array, int target) {

		ArrayList<String> new_arrlist = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {
			// TODO Auto-generated method stub
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == target) {
					int x = array[i];
					int y = array[j];
					if (!new_arrlist.contains(array[i]) || !new_arrlist.contains(array[j])) {
						new_arrlist.add("{" + x + "," + y + "}");
					}

				}
			}
		}
		return new_arrlist;
	}

	// method to display match pair using hashmap
	public static void unigCharHm(int[] arr, int target) {

		HashMap<Integer, Boolean> Newhm = new HashMap<Integer, Boolean>();
		// TODO Auto-generated method stub
		for (int j = 0; j < arr.length; j++) {
			int x = target - arr[j];
			int y = arr[j];

			if (Newhm.containsKey(x) && Newhm.get(x) == false) {

				System.out.println("{" + y + "," + x + "}");

				Newhm.put(y, true);
				Newhm.put(x, true);
			}

			else {
			  	Newhm.put(y, false);
			}

		}

	}

}
