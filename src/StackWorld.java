import java.util.Stack;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class StackWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> mystack = new Stack<String>();
		
		mystack.add("plate 1 ");
		mystack.add("plate 2 ");
		mystack.add("plate 3 ");
		mystack.add("plate 4 ");
		
		while (!mystack.empty()) {
			System.out.println(mystack.pop());
			System.out.println(mystack);
			
			
		}
		
		
		

	}

}
