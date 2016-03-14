import java.util.List;
import java.util.stream.*;

public class StreamUtils {
	
	public static List<Integer> orderedNumberList(int start, int gap, int numOfItems) {

		List<Integer> stream = Stream.iterate(start, i -> i + gap).limit(numOfItems).collect(Collectors.toList());
		return stream;
	}
}