public class LsTest {
	public static void main(String[] args) {
		System.out.println("Test start.");

		try {
			Ls test = new Ls();
			test.listFiles("./");
		} catch (Exception ex) {
			System.out.println("An exception was thrown: ");
			System.out.println(ex.getMessage());
		}
		

		System.out.println("Test end.");
	}
}