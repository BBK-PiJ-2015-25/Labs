import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class Fourteen {

	public static void main(String[] args) {
		System.out.println("Start.");
		System.out.println("-------------");

		List<Double> myInts = Arrays.asList(1.11, 5.55, 8.88, 4.44, 6.66, 2.22);

		Optional<Double> summedDouble = myInts.stream().reduce((a, b) -> a + b);

		if (summedDouble.isPresent()) {
			System.out.println("Sum of doubles: " + summedDouble.get());
		} else {
			System.out.println("Something went wrong.");
		}

		Optional<Double> summedDoubleParallel = myInts.stream().parallel().reduce((a, b) -> a + b);

		if (summedDoubleParallel.isPresent()) {
			System.out.println("Sum of doubles in parallel: " + summedDoubleParallel.get());
		} else {
			System.out.println("Something went wrong.");
		}
		
		System.out.println("-------------");
		System.out.println("End.");
	}
}