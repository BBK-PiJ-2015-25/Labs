import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class Five {

	public static void main(String[] args) {
		System.out.println("Starting...");
		System.out.println("------------");

		List<String> words = Arrays.asList("hi", "four", "hello", "world", "foo", "bar", "hi five", "as", "elephant", "house", "ear", "bee", "");

		/**
		 * The questions says search for a lower case 'e' but the
		 * stream will always be empty because we lowercased everything.
		 */
		Stream<String> modifiedWords = words.stream().map(String::toUpperCase)
													 .filter(w -> w.length() < 4)
													 .filter(w -> w.contains("E"));

		modifiedWords.forEach(System.out::println);

		System.out.println("------------");

		Stream<String> modifiedWords2 = words.stream().map(String::toUpperCase)
													 .filter(w -> w.length() < 4)
													 .filter(w -> w.contains("q"));

		modifiedWords2.forEach(System.out::println);

		System.out.println("------------");
		System.out.println("Finished");
	}
}