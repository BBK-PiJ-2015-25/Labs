import java.util.*;

public class ModifiedECheckerLambda {

	public static void main(String[] args) {
		System.out.println("Test start");
		System.out.println("----------------");

		String[] strings = {"hello", "world", "foo", "earth", "bar"};

		Arrays.sort(strings, (String a, String b) -> StringUtils.eChecker(a, b));

		System.out.println(Arrays.asList(strings));

		System.out.println("----------------");
		System.out.println("Test end");
	}
}