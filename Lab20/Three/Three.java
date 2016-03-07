import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class Three {

	public static void main(String[] args) {
		System.out.println("Starting...");

		List<String> words = Arrays.asList("hi", "hello", "world", "foo", "bar", "hi five");

		Stream<String> addExclamationMark = words.stream().map(w -> w + "!");
		Three:printResults(addExclamationMark);

		Stream<String> iReplacedWithEye = words.stream().map(w -> w.replace("i", "eye"));
		Three:printResults(iReplacedWithEye);

		Stream<String> upperCasedWords = words.stream().map(String::toUpperCase);
		Three:printResults(upperCasedWords);

		System.out.println("Finished.");
	}

	public static void printResults(Stream<String> wordsStream) {
		wordsStream.forEach(System.out::println);
	}
}