import java.util.*;

public class StringSortLengthDescLambda {

	public static void main(String[] args) {
		System.out.println("String sort length ASC start");
		System.out.println("------------------");

		String[] strings = {"iiiii", "ii", "iii", "iiii", "i"};

		Arrays.sort(strings, (String a, String b) -> {
			if (a.length() > b.length()) {
				return -1;
			} else if (a.length() == b.length()) {
				return 0;
			} else {
				return 1;
			}
		});

		System.out.println(Arrays.asList(strings));

		System.out.println("------------------");
		System.out.println("String sort length ASC end");
	}
}