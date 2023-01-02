import java.util.Arrays;


/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class HashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1= {"Mr A","Mr B","Mr A","Mr C","Mr A","Mr B","Mr C"};
		String[] firstArray = {"Mr A", "Mr B", "Mr C", "Mr Y", "Mr E"};
	    String[] secondArray = {"Mr X", "Mr Z", "Mr B", "Mr A", "Mr Y", "Mr S", "Mr T"};
	    
	    RempveDup(arr1);
	    intersect(firstArray, secondArray);
		


	}

	public static void RempveDup(String[] arr) {
		
		HashSet <String> removeDupHSet = new HashSet();
		
		for(int index=0;index<arr.length;index++) {
			removeDupHSet.add(arr[index]);
			
		}
		
		
		  
	}
	
	public static void intersect (String[] fArray,String[] sArray) {
		
	      
	      HashSet <String> set1 = new HashSet <String>();
	      HashSet <String> set2 = new HashSet <String>();
	      
	      for(int index =0; index<fArray.length; index++) {
	    	  set1.add(fArray[index]);
	    	  
	      }
	      for(int index1 =0; index1<sArray.length; index1++) {
	    	  set2.add(sArray[index1]);
	    	  
	      }
	      set1.retainAll(set2);
	      System.out.println("Intersection = "+ set1);
		
	}
}
