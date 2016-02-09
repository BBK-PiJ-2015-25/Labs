public class ListUtilities {
	public static IntItem covertToLinkedListInOrder(int[] items) {
		int l = items.length;
		IntItem start = null;

		if (l > 0) {
			for (int i = 0; i < l; i++) {
				if (start == null) {
					start = new IntItem(items[i]);
				} else {
					IntItem item = start;
					IntItem newItem = new IntItem(items[i]);

					while (item.getNext() != null) {
						if (newItem.getValue() > item.getValue() && item.getNext() == null) {
							item.setNext(newItem);
							break;
						} else if (newItem.getValue() > item.getValue() && newItem.getValue() < item.getNext().getValue()) {
							newItem.setNext(item.getNext());
							item.setNext(newItem);
							break;
						}

						item = item.getNext();
					}

					item.setNext(newItem);
				}
			}
		}
		
		return start;
	}
}