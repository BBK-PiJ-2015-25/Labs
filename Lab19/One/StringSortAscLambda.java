import java.util.*;

public class StringSortAscLambda {

	public static void main(String[] args) {
		System.out.println("String sort asc lambda start");
		System.out.println("------------------");

		String[] strings = {"this", "is", "not", "in", "alphabetical", "order"};

		Arrays.sort(strings, (String a, String b) -> a.compareTo(b));

		System.out.println(Arrays.asList(strings));

		System.out.println("------------------");
		System.out.println("String sort asc lambda end");
	}
}