import java.util.HashMap;

/**
 * 14.2 - Memoized Fibonacci
 *
 */
public class Two {
	
	private static HashMap<Integer, Integer> myHash;
	
	Two() {
		Two.myHash = new <Integer, Integer>HashMap();
	}
	
	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			
			int firstNumber  = n-1;
			int secondNumber = n-2;
			
			Integer first  = Two.myHash.get(firstNumber);
			Integer second = Two.myHash.get(secondNumber);
			
			if (first == null) {
				first = fib(firstNumber);
				Two.myHash.put(firstNumber, first);
			}
			
			if (second == null) {
				second = fib(secondNumber);
				Two.myHash.put(secondNumber, second);
			}
			
			
			int result = first + second;
			return result;
		}
	}
}