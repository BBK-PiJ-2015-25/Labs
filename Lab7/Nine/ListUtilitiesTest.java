public class ListUtilitiesTest {
	public static void main(String[] args) {
		System.out.println("Lab 7.9 - From array to list");
		System.out.println("----------------");

		int[] items = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

		IntItem start = ListUtilities.convertArrayToLinkedList(items);


		// Print each item for a test
		IntItem item = start;
		System.out.println(start.getValue());
		while (item.getNext() != null) {
			item = item.getNext();
			System.out.println(item.getValue());
		}


		System.out.println("----------------");
		System.out.println("End.");
	}
}