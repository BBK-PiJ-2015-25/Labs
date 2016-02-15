public class ThreeBTest {
	public static void main(String[] args) {
		System.out.println("Test start");
		
		ThreeB test = new ThreeB();
		
		int totalNumbers = 0;
		String totalNumbersInput;
		
		while (totalNumbers == 0) {
			System.out.println("Enter the total amount of numbers you want to calculate: ");
			totalNumbersInput = System.console().readLine();
			
			totalNumbers = test.tryToConvertStringToInteger(totalNumbersInput);	
		}
		
		System.out.println(totalNumbers);
		System.out.println("Test end.");
	}
}