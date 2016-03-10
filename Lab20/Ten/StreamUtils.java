import java.util.List;
import java.util.stream.*;

public class StreamUtils {

	public static List<Double> getListOfNumbers(int size) {

		List<Double> list = Stream.generate(Math::random).limit(size).collect(Collectors.toList());

		return list;
	}
}