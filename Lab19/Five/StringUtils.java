import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class StringUtils {
	
	public static List<String> allMatches(List<String> words, Predicate<String> lambda) {

		List<String> matched = new ArrayList<String>();

		for (String word : words) {
			if (lambda.test(word)) {
				matched.add(word);
			}
		}

		return matched;
	}
}