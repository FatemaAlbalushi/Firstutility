import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class FileStoringCSV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = null;
		String[] person= null;
		HashMap<String, String[]> personInfo = new HashMap<>();
		try {
			sc = new Scanner(new File("data/data.csv"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		sc.useDelimiter(","); 
		while (sc.hasNext()) 
		{
			
			System.out.print(sc.next()); 
			
		}
		sc.close();
	}
	
	
	
	

}
