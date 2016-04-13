import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class Seven {

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

		System.out.println("End.");
	}
}