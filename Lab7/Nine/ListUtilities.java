public class ListUtilities {
	public static IntItem convertArrayToLinkedList(int[] items) {
		int l = items.length;

		if (l > 0) {
			IntItem start = null;

			for (int i = 0; i < l; i++) {
				if (start == null) {
					start = new IntItem(items[i]);
				} else {
					IntItem item = start;
					while (item.getNext() != null) {
						item = item.getNext();
					}

					item.setNext(new IntItem(items[i]));
				}
			}

			return start;
		} else {
			return new IntItem();
		}
	}
}