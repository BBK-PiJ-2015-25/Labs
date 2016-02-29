public class StringUtils {

	public static int eChecker(String a, String b) {
		if (a.contains("e") && !b.contains("e")) {
			return -1;
		} else if (!a.contains("e") && b.contains("e")) {
			return 1;
		} else {
			return 0;
		}
	}
}