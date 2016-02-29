public class BetterStringTest {

	public static void main(String[] args) {
		System.out.println("Test start");
		System.out.println("---------------");

		String a = "Long";
		String b = "Short";

		System.out.println(BetterStringTest.betterString(a, b, TwoStringPredicate.betterStringTest(a, b)));

		System.out.println("---------------");
		System.out.println("Test end");
	}

	public static String betterString(String a, String b, boolean test) {
		return test ? a : b;
	}
}