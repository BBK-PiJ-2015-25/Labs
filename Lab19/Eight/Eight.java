import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class Eight {

	public static void main(String[] args) {
		System.out.println("Start.");

		List<String> words = Arrays.asList("Hello", "Hi", "Yo", "Greetings", "bye");

		List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
		excitingWords.stream().forEach(System.out::println);
		System.out.println("----------------");

		List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
		eyeWords.stream().forEach(System.out::println);
		System.out.println("----------------");

		List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
		upperCaseWords.stream().forEach(System.out::println);
		System.out.println("----------------");

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> doubledNumbers = StringUtils.transformedList(numbers, x -> x * 2);
		doubledNumbers.stream().forEach(System.out::println);
		System.out.println("----------------");

		System.out.println("End.");
	}
}