import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class CSVFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner input =new Scanner(System.in);
		String line =  null;
		
		
	    // Adding to the csv file 
		HashMap<String,String[]> map = new HashMap<String, String[]>();
		try {
			br = new BufferedReader(new FileReader("data/data.csv"));
			while((line=br.readLine())!=null){
		        String str[] = line.split(",");
		             map.put(str[0], str);  
		             
		        }
		        
			//br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String Lid="";
		for(String key: map.keySet()) {
	    	System.out.println(Arrays.toString(map.get(key)));
	    	key = Lid;
	    }
		  int newId = Integer.parseInt(Lid) + 1;
		
		System.out.println("Enter your Name");
	    String Name = input.nextLine();
	    
	    System.out.println("Enter your Email");
	    String Email = input.nextLine();
	    
	    try {
	    	bw = new BufferedWriter(new FileWriter("data/data.csv"));
	    	bw.write(String.format("%03d,%s,%s,true/n",newId,Name,Email));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	    }  
	}
