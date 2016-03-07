public class BetterElementTest<T> {

	public static void main(String[] args) {

		System.out.println("Test start");
		System.out.println("---------------");

		System.out.println(BetterElementTest.betterElement(1, 2, TwoElementPredicate.betterEntry(1, 2)));
		System.out.println(BetterElementTest.betterElement("Long", "Short", TwoElementPredicate.betterEntry("Long", "Short")));

		System.out.println("---------------");
		System.out.println("Test end");
	}

	public static String betterElement(T a, T b, boolean test) {
		return test ? a : b;
	}
}