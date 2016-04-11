import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class Thirteen {

	public static void main(String[] args) {
		System.out.println("Start.");
		System.out.println("-------------");

		List<Integer> myInts = Arrays.asList(1, 5, 8, 4, 6, 2);

		Optional<Integer> summedInt = myInts.stream().parallel().reduce((a, b) -> a + b);

		if (summedInt.isPresent()) {
			System.out.println("Sum of ints: " + summedInt.get());
		} else {
			System.out.println("Something went wrong.");
		}
		
		System.out.println("-------------");
		System.out.println("End.");
	}
}