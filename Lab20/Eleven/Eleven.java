import java.util.List;
import java.util.stream.*;

public class Eleven {

	public static void main(String[] args) {
		System.out.println("Starting...");
		System.out.println("------------");

		List<Integer> myList = StreamUtils.orderedNumberList(50, 5, 10);

		myList.stream().forEach(System.out::println);

		System.out.println("------------");
		System.out.println("Finish");
	}
}