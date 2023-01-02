import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.sound.sampled.Line;

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
		//creating the file
		 try {
		      File dataFile = new File("data/output.txt");
		      if (dataFile.createNewFile()) {
		        System.out.println("File created: " + dataFile.getName());
		      } 
		 
		     BufferedReader br = new BufferedReader(new FileReader("data/input.txt"));
		     BufferedWriter bw = new BufferedWriter(new FileWriter("data/output.txt"));
		     
		    String line;
			while ((line= br.readLine())!= null) {
		    		String uppercaseLine = line.toUpperCase();
		    		bw.write (uppercaseLine);
		    		bw.newLine();
		 }
			
		    bw.close();
		    br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
