public class OneTest {
	
	public static void main(String[] args) {
		System.out.println("Test start.");
		
		One test      = new One();
		// String result = test.doggyMethod(1);
		
		String result = test.doggyMethodImproved(1);
		
		System.out.println(result);
		System.out.println("Test end.");
	}
}