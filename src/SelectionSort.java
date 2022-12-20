/**
 * 
 */

/**
 * This program is to practice variable sort
 *
 */
public class SelectionSort {

	/**
	 * the main is responisible to swap the first tow element of an array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2, 1 };
		int[] sort = { 50, 12, 8, 10, 1001, 6, 87, 24 };
		int[] sort1 = { 50, 12, 8, 10, 1001, 6, 87, 24 };
		int x;
		int y;
		x = arr[0];
		y = arr[1];
		int[] swap = { y, x, arr[2], arr[3] };

		System.out.println("printing the array before swapping");
		displaying(arr);

		System.out.println("printing the array after swapping");
		displaying(swap);

		System.out.println("printing the array with  Selection sort");
		Selectionsort(sort);

		System.out.println("printing the array with  Bubble sort");
		Bubblesort(sort1, sort1.length);

	}

	public static void displaying(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");

		}
		System.out.println();

	}

	public static void Selectionsort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int x;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					x = arr[i];
					arr[i] = arr[j];
					arr[j] = x;
				}
			}
			for (int element : arr) {
				System.out.print(" " + element);
			}
			System.out.println();
		}

	}

	public static void Bubblesort(int[] arr1, int n) {

		for (int i = 0; i < n; i++) {
			// int min = arr[i];
			int x;
			for (int j = 0; j < n-1; j++) {
				if (arr1[j] < arr1[j+1]) {
					x = arr1[j + 1];
					arr1[j + 1] = arr1[j];
					arr1[j] = x;
				}
				
			}
			for (int curent : arr1) {
				System.out.print(" " + curent);
			}
			
			System.out.println();	
			
		}
		
	}
}
