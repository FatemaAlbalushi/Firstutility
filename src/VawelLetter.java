import java.util.HashMap;
import java.util.Scanner;

/**
 * This program well return the number of vowel letter in specific sentence
 */
public class VawelLetter {

	/**
	 * The main function well call the two method to display the total number of
	 * vowel letter using countVawel and VawelHash
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------------------------ Vawel charachter---------------------------------");

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter A sentence: ");
		System.out.println("-------------------");
		String sentence = input.nextLine();

		// printing the number of vowel letter using CountVawel method
		System.out.println("This sentence contain " + CountVawel(sentence) + "  vawel letter");
		System.out.println("--------------------------------------------------------------");

		System.out.println("-------HashMap------");
		System.out.println();

		// printing the number of vowel letter with the help of HashMap using VawelHash
		// method
		System.out.println("This sentence contain " + VawelHash(sentence) + " vawel letter ");

	}

	// Method to return the sum of vowel letter
	public static int CountVawel(String input) {
		int sum = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'A' || input.charAt(i) == 'o' || input.charAt(i) == 'O'
					|| input.charAt(i) == 'e' || input.charAt(i) == 'E' || input.charAt(i) == 'i'
					|| input.charAt(i) == 'I' || input.charAt(i) == 'u' || input.charAt(i) == 'U') {
				sum++;

			}

		}

		return sum;

	}

	// Method to return the sum of vowel letter using HashMap
	public static int VawelHash(String userinput) {

		HashMap<Character, Integer> vawelletter = new HashMap<Character, Integer>();
		vawelletter.put('i', 0);
		vawelletter.put('o', 0);
		vawelletter.put('u', 0);
		vawelletter.put('a', 0);
		vawelletter.put('e', 0);
		int count = 0;

		for (int i = 0; i < userinput.length(); i++) {
			if (userinput.charAt(i) == 'i' || userinput.charAt(i) == 'I') {
				vawelletter.put('i', vawelletter.get('i') + 1);
				count++;
			}
			if (userinput.charAt(i) == 'o' || userinput.charAt(i) == 'O') {
				vawelletter.put('o', vawelletter.get('o') + 1);
				count++;
			}
			if (userinput.charAt(i) == 'u' || userinput.charAt(i) == 'U') {
				vawelletter.put('u', vawelletter.get('u') + 1);
				count++;
			}
			if (userinput.charAt(i) == 'a' || userinput.charAt(i) == 'A') {
				vawelletter.put('a', vawelletter.get('a') + 1);
				count++;
			}
			if (userinput.charAt(i) == 'e' || userinput.charAt(i) == 'E') {
				vawelletter.put('e', vawelletter.get('e') + 1);
				count++;
			}
		}

		return count;

	}

}
