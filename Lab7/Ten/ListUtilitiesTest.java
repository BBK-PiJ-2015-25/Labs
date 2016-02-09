public class ListUtilitiesTest {
	public static void main(String[] args) {
		System.out.println("Lab 7.10 - A sorted list");
		System.out.println("-----------------");

		int[] items = {1, 6, 8, 9, 2, 3, 4, 5, 7, 10, 11, 12, 16, 13, 14, 15};
		IntItem start = ListUtilities.covertToLinkedListInOrder(items);

		// Print each item for a test
		IntItem item = start;
		System.out.println(start.getValue());
		while (item.getNext() != null) {
			item = item.getNext();
			System.out.println(item.getValue());
		}

		System.out.println("-----------------");
		System.out.println("End.");
	}
}