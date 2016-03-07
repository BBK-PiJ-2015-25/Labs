import java.util.List;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Optional;

public class Seven {

	public static void main(String[] args) {
		System.out.println("Starting...");
		System.out.println("............");

		List<String> words = Arrays.asList("hi", "four", "hello", "world", "foo", "bar", "hi five", "as", "elephant", "house", "ear", "bee");

		Optional<String> concatWords = words.stream().map(String::toUpperCase)
												   .reduce((a, b) -> a + b);

		// concatWords.forEach(System.out::println);

		if (concatWords.isPresent()) {
			System.out.println(concatWords.get());
		}
		

		System.out.println("............");
		System.out.println("Finished.");
	}
}