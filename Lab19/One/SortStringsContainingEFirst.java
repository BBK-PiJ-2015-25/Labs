import java.util.*;

public class SortStringsContainingEFirst {

	public static void main(String[] args) {

		System.out.println("Test start");
		System.out.println("------------");

		String[] strings = {"hello", "world", "foo", "earth", "bar"};

		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if (a.contains("e") && !b.contains("e")) {
					return -1;
				} else if (!a.contains("e") && b.contains("e")) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		System.out.println(Arrays.asList(strings));

		System.out.println("------------");
		System.out.println("Test end");
	}
}