import java.util.*;

public class StringSortByFirstCharacter {

	public static void main(String[] args) {
		System.out.println("Test start");
		System.out.println("------------");

		String[] strings = {"zebra", "dog", "cat", "mouse", "ant"};

		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				Character aChar = a.charAt(0);
				return aChar.compareTo(b.charAt(0));
			}
		});

		System.out.println(Arrays.asList(strings));

		System.out.println("------------");
		System.out.println("Test end");
	}
}