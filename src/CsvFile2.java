import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class CsvFile2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedWriter bw = null;
		 Scanner input =new Scanner(System.in);
			
			System.out.println("Enter your Name");
		    String Name = input.nextLine();
		    
		    System.out.println("Enter your Email");
		    String Email = input.nextLine();
		 try {
			 FileWriter newfile = new FileWriter("data/data2.csv",true);
		      bw = new BufferedWriter(newfile);
		     
		      	bw.write(Name);
		    	bw.append(",");
		    	bw.write(Email);
		    	bw.append(",");
		    	bw.write("true");
		    	
		    	

		      System.out.println("Successfully wrote to the file.");
		    } 
		 catch (IOException e) {
		      System.out.println("An error occurred.");
		      
		    }
		 finally {
			try {
				bw.close();
				System.out.println("Close the file successfully.");
				
			} catch (Exception e) {
				// TODO: handle exception
				
			}
		}
	}

}
