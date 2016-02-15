/**
 * 14.1.b - McCarthy’s 91 function
 */
public class McCarthys {
	
	/**
	 * 
	 *
	 */
	public int mcCarthy91(int n) {
		System.out.println(n);
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n+11));
		}
	}
	
}