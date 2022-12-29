import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class CsvFile3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		     BufferedReader br = new BufferedReader(new FileReader("data/inpit.txt"));
		     
		     
		     br.getToUpper();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
