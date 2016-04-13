import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class StringUtils {
	
	public static List<String> transformedList(List<String> words, Function<String, String> lambda) {

		List<String> matched = new ArrayList<String>();

		for (String word : words) {
			matched.add(lambda.apply(word));
		}

		return matched;
	}
}