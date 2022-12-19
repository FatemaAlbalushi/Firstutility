import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
 * This program finds the duplicated number in an array 
 * and return how many time this number has been repeted
 */
public class IntegerDuplicate {

	/**
	 * the main well callulate the number of duplicate integer in an array using countDupli method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------------------Repitition---------------------------------"); 
		
		
		int [] number= {1,2,3,4,2,4,4,4};
		int count=0;
		
        int[] repetition = new int[number.length];
        int counter = 0; 
        for (int i = 0; i < number.length; i++) {
            boolean different = false;
            for (int j = 0; j < i; j++) {
                if (number[i] == number[j]) {
                	different = true;
                    break;
                }
            }
            if (!different) {
            	repetition[counter++] = number[i];
            }
        }
        for (int i = 0; i < counter; i++) {
            count = 0;
            for (int j = 0; j < number.length; j++) {
                if (repetition[i] == number[j]) {
                    count++;
                }

            }
            System.out.println( "The number "+ repetition[i] + " is repeted  " + count + " times");
            
        }
        
        System.out.println("-------HashMap------");  

		HashMap<Integer, Integer> doub = new HashMap<Integer, Integer>();
		
		for(int i=0; i< number.length;i++) {
             
			      if (doub.containsKey(number[i]))
			    	  doub.put(number[i], doub.get(number[i]) + 1);
			      else
			    	  doub.put(number[i], 1);
			  }
		
//		for( Entry<Integer, Integer> entry : doub.entrySet() ){
//			if(entry.getValue()>1) {
//			    System.out.println( "The number "+entry.getKey() + " is repeted  " + entry.getValue() + " times" );
//
//			}
//		}
       
	  for (int occer:doub.keySet()) {
		  if (doub.get(occer)>1) {
			  System.out.println( "The number "+doub.get(occer) + " is repeted  " + occer + " times" );
			  
			  
		  }
	  }
	}
	

}
