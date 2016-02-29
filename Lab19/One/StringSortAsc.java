// import java.util.Arrays;
// import java.util.Comparator;

import java.util.*;

public class StringSortAsc {

	public static void main(String[] args) {

		System.out.println("String sort start");
		System.out.println("------------------");

		String[] strings = {"this", "is", "not", "in", "alphabetical", "order"};
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});

		System.out.println(Arrays.asList(strings));

		System.out.println("------------------");
		System.out.println("String sort end");
	}
}