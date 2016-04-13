import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class Six {

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

		List<Integer> numbers = Arrays.asList(2, 4, 5, 7, 8, 10);

		List<Integer> evenNumbers = StringUtils.allMatches(numbers, s -> (s % 2) == 0);
		evenNumbers.stream().forEach(System.out::println);
		System.out.println("----------------");

		System.out.println("End.");
	}	
}