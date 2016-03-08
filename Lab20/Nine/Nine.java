import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Optional;

public class Nine {

	public static void main(String[] args) {
		System.out.println("Starting...");
		System.out.println("------------");

		List<String> words = Arrays.asList("hi", "four", "hello", "world", "foo", "bar", "hi five", "as", "elephant", "house", "ear", "bee");

		Optional<String> result = words.stream().reduce((a, b) -> a + "," + b );

		if (result.isPresent()) {
			System.out.println(result.get());
		}

		System.out.println("------------");
		System.out.println("Finished");
	}
}