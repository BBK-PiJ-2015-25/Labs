import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class Ten {

	public static void main(String[] args) {
		System.out.println("Starting...");
		System.out.println("----------------");

		List<Double> myList = StreamUtils.getListOfNumbers(10);

		System.out.println(myList.toString());

		System.out.println("----------------");
		System.out.println("Finished");
	}
}