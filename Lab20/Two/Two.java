import java.util.List;
import java.util.Arrays;

public class Two {

	public static void main(String[] args) {
		System.out.println("Starting...");

		List<String> words = Arrays.asList("hi", "hello", "world", "foo", "bar");

		words.stream().forEach(System.out::println);

		System.out.println("Finished.");
	}
}