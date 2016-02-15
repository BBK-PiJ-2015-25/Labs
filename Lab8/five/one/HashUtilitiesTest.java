public class HashUtilitiesTest {
	public static void main(String[] args) {
		System.out.println("HashUtilitiesTest main method");
		
		System.out.println("Enter a string to get the hashcode: ");
		String input = System.console().readLine();
		int hash = input.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		
		System.out.println("0 < " + smallHash + " < 1000");
		
		System.out.println("End.");
	}
}