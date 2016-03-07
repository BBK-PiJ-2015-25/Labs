import java.util.List;
import java.util.Arrays;

public class One {

	public static void main(String[] args) {
		System.out.println("Starting...");

		List<String> words = Arrays.asList("hi", "hello", "world", "foo", "bar");

		words.stream().forEach(w -> System.out.println("  " + w));

		System.out.println("Finished.");
	}
}