import java.util.*;

public class ModifiedEChecker {

	public static void main(String[] args) {
		System.out.println("Test start");
		System.out.println("----------------");

		String[] strings = {"hello", "world", "foo", "earth", "bar"};

		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return StringUtils.eChecker(a, b);
			}
		});

		System.out.println(Arrays.asList(strings));

		System.out.println("----------------");
		System.out.println("Test end");
	}
}