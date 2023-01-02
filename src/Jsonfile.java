import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class Jsonfile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new Gson().fromJson("{}", HashMap.class);
		try (FileWriter writer = new FileWriter("Output1.json", true)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(new HashMap<>(), writer);
            writer.write("\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           
        }
		
	}

}
