import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class Four {

	public static void main(String[] args) {
		System.out.println("Starting...");
		
		System.out.println("------------");

		List<String> words = Arrays.asList("hi", "four", "hello", "world", "foo", "bar", "hi five", "as", "elephant", "house");

		Stream<String> lessThanFourChars = words.stream().filter(w -> w.length() < 4);
		Four:printResults(lessThanFourChars);

		System.out.println("------------");

		Stream<String> wordsWithB = words.stream().filter(w -> w.contains("b"));
		Four:printResults(wordsWithB);

		System.out.println("------------");

		Stream<String> evenLengthWords = words.stream().filter(w -> w.length() % 2 == 0);
		Four:printResults(evenLengthWords);

		System.out.println("------------");

		System.out.println("Finished");
	}

	public static void printResults(Stream<String> wordsStream) {
		wordsStream.forEach(System.out::println);
	}
}