public class TwoTest {
	
	public static void main(String[] args) {
		System.out.println("Start test.");
		
		Two test = new Two();
		
		long start = System.currentTimeMillis();
		
		System.out.println(test.fib(50));
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken:" + (end - start));
		System.out.println("End test.");
	}
}