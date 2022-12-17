import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class Firstutility {

	/**
	 * this is the main method to find the smallest and largest element in an array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the largest element in an array
		
	System.out.println("------------------------ Max/min number---------------------------------"); 
		int [] arr = {5,6,10,1};
		int max=0;
		for (int i=0; i<arr.length;i++) 
		{
			if (arr[i] > max)
			{
				max=arr[i];
			}
			
		}
		System.out.println("The largest element is " + max);
		
		//find the smallest element in an array
				
				int min = max;
				for (int i=0; i<arr.length;i++) 
				{
					if (arr[i] < min)
					{
						min=arr[i];
					}
					
				}
				System.out.println("The smallest element is " + min);
				System.out.println("--------------------------------------------------------------");
				System.out.println(); 
				
	 System.out.println("------------------------ Vawel charachter---------------------------------"); 
	 
				
				int sum=0;
				char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
				Scanner input = new Scanner(System.in);
				System.out.println("Please Enter A String: ");
				System.out.println("-------------------");
				String word = input.nextLine();
				
				for (int i =0; i<word.length();i++) {
					if (word.charAt(i)=='a'|| word.charAt(i)=='o'|| word.charAt(i)=='e'||
							word.charAt(i)=='i'|| word.charAt(i)=='u') 
					{
						sum++;
						
					}
					
				}
				System.out.println("This word contain " +sum+"  vawel letter which are");
				System.out.println("--------------------------------------------------------------");
				
				System.out.println("-------HashMap------"); 
				System.out.println(); 
				
				
//				int vol=0;
//				char [] ch1 = word.toCharArray();
//			    HashMap<Character,Character> hMap = new HashMap();
//			      for(char ch : ch1) {
//			         hMap.put(ch,'g');
//				     
//			      }
//			      
//			      if(hMap.keySet().contains(vowels)) {
//			    	  vol++;
//			          System.out.println("This word contain " +vol+"  vawel letter");
//			       } else {
//			          System.out.println("This word contain no voul");
//			       }
				
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
                         int element = number[i];
					      if (doub.containsKey(element))
					    	  doub.put(element, doub.get(element) + 1);
					      else
					    	  doub.put(element, 1);
					  }

					 
					  StringBuilder sb = new StringBuilder();

					  for (Map.Entry<Integer, Integer> new_arr : doub.entrySet()) {
					      if (new_arr.getValue() > 1) {
					          count += 1;

					          sb.append("\n");
					          sb.append(new_arr.getKey());
					          sb.append("The number : ");
					          sb.append(new_arr.getValue());
					          sb.append(" times");
					      }
					  }

					  if (count > 0) {
					      sb.insert(0, " repeated numbers:");
					      sb.insert(0, count);
					      sb.insert(0, " There are ");
					  }
					  System.out.print(sb.toString());
					
					
				

	}

}
