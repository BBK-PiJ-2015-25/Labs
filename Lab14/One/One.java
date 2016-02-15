/**
 * 14.1.a - Recursive code, line by line
 */
public class One {
	
	/**
	 * As the doggyMethod is called twice for both n-3 and n-2, it means
	 * that there is repeated computation whenever n is a multiple of 3
	 * and 2.
	 *
	 * The guard condition is below the recursive calls so the code
	 * will never end.
	 */
	public String doggyMethod(int n) {
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		
		if (n <= 0) {
			return "";
		}
		
		return result;
	}
	
	/**
	 * To improve this method we can store the computed value of 
	 * the doggyMethod in a hash map and move the guard condition
	 * to above the line where the recursive call is made.
	 */
	public String doggyMethodImproved(int n) {
		
		if (n <= 0) {
			return "";
		}
		
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		
		return result;
	}
}