import java.util.stream.*;
import java.util.List;
import java.util.Arrays;

public class Six {

	public static void main(String[] args) {
		System.out.println("Starting...");
		System.out.println("------------");

		List<String> words = Arrays.asList("hi", "four", "hello", "world", "foo", "bar", "hi five", "as", "elephant", "house", "ear", "bee");

		/**
		 * The questions says search for a lower case 'e' but the
		 * stream will always be empty because we uppercased everything.
		 */
		Stream<String> modifiedWords = words.stream().map(String::toUpperCase)
													 .filter(w -> {
													 	char[] chars = w.toCharArray();
													 	int l = chars.length;

													 	for (int i = 0; i < l; i++) {
													 		if (!chars.isUpperCase()) {
													 			return false;
													 		}
													 	}

													 	return true;
													 });

		modifiedWords.forEach(System.out::println);

		System.out.println("------------");
		System.out.println("Finished");
	}
}