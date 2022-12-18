import java.util.HashMap;
import java.util.LinkedList;


/**
 * This program is for practicing hashmap and linkedlist
 */
public class Hashmap {

	/**
	 * the main shows how we can initialize and work with hashmap and linkedlist
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("working with hashmap");
		HashMap<String, String> developerinfo = new HashMap<String, String>(); 
		
		developerinfo.put("name", "fatema");
		developerinfo.put("age", "25");
		developerinfo.put("id", "12322");
		
		String name= developerinfo.get("name");
		System.out.println(name);
		System.out.println();
		
		System.out.println("working with LinkedList");
		
		
		LinkedList<String> listofNameLinkedList = new LinkedList<String>();
		listofNameLinkedList.add("Fatma");
		listofNameLinkedList.add("Anwar");
		listofNameLinkedList.add("Barrah");
		
		for(String curName: listofNameLinkedList) {
			System.out.println(curName);
		}
	}

}
