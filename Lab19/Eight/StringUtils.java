import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class StringUtils {
	
	public static <T> List<T> transformedList(List<T> words, Function<T, T> lambda) {

		List<T> matched = new ArrayList<T>();

		for (T word : words) {
			matched.add(lambda.apply(word));
		}

		return matched;
	}
}