import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class StringUtils {
	
	public static <T> List<T> allMatches(List<T> words, Predicate<T> lambda) {

		List<T> matched = new ArrayList<T>();

		for (T word : words) {
			if (lambda.test(word)) {
				matched.add(word);
			}
		}

		return matched;
	}
}