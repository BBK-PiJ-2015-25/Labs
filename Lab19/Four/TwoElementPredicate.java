public interface TwoElementPredicate<T> {

	public static boolean betterEntry(T a, T b) {
		if (a.length() > b.length()) {
			return true;
		}

		return false;
	}
}