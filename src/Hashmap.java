import java.util.HashMap;
import java.util.LinkedList;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class Hashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("working of a hashmap");
		HashMap<String, String> developerinfo = new HashMap<String, String>(); 
		
		developerinfo.put("name", "fatema");
		developerinfo.put("age", "25");
		developerinfo.put("id", "12322");
		
		String name= developerinfo.get("name");
		System.out.println(name);
		System.out.println();
		
		System.out.println("working of a LinkedList");
		
		
		LinkedList<String> listofNameLinkedList = new LinkedList<String>();
		listofNameLinkedList.add("Fatma");
		listofNameLinkedList.add("Anwar");
		listofNameLinkedList.add("Barrah");
		
		for(String curName: listofNameLinkedList) {
			System.out.println(curName);
		}
	}

}
