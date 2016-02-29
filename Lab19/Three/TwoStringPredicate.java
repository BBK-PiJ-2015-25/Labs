public interface TwoStringPredicate {

	public static boolean betterStringTest(String a, String b) {
		if (a.length() > b.length()) {
			return true;
		}

		return false;
	}
}