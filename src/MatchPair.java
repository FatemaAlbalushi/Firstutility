import java.util.ArrayList;
import java.util.Arrays;

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

		int[] arr = { 2, 3, 1, 8, 6, 3, 4 };
		int target = 10;

		System.out.println("The Array with match pair is : " + Matchpair(arr, target));
		System.out.println();
	}

	private static ArrayList<String> Matchpair(int[] array, int target) {

		ArrayList<String> new_arrlist = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {
			// TODO Auto-generated method stub
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == target) {
					int x = array[i];
					int y = array[j];

					new_arrlist.add("{" + x + "," + y + "}");

				}
			}
		}
		return new_arrlist;
	}

}
