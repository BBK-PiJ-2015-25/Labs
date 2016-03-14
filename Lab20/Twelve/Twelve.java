import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Twelve {

	public static void main(String[] args) {
		System.out.println("Starting...");
		System.out.println("............");

		List<Integer> myInts = Arrays.asList(1, 5, 8, 4, 6, 2);

		Optional<Integer> summedInt = myInts.stream().reduce((a, b) -> a + b);

		System.out.println("Sum of ints: " + summedInt);

		System.out.println("............");
		System.out.println("End.");
	}
}