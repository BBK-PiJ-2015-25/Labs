import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class Five {
	
	public static void main(String[] args) {
		System.out.println("Start.");

		List<String> words = Arrays.asList("Hello", "Hi", "Yo", "Greetings", "bye");

		List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
		shortWords.stream().forEach(System.out::println);
		System.out.println("----------------");

		List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
		wordsWithB.stream().forEach(System.out::println);
		System.out.println("----------------");

		List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
		evenLengthWords.stream().forEach(System.out::println);
		System.out.println("----------------");

		System.out.println("End.");
	}
}