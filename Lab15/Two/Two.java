import java.util.List;
import java.util.ArrayList;

/**
 * We want to catch the more specific exception first
 * as the compiler will return an error saying, in this
 * case, the NullPointerException has already been caught.
 */
public class Two {
	public static void main(String[] args) {
		System.out.println("Start test");
		
		int newElement = 5;
		
		try {
			List<Integer> list = new ArrayList<Integer>();
			
			list.add(newElement);
			
			// more code here
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}

		
		System.out.println("End test");
	}
}