public class IntItem {
	private int value;
	private IntItem next;

	IntItem() {
		this.next = null;
	}

	IntItem(int value) {
		this.value = value;
		this.next = null;
	}

	public void setNext(IntItem next) {
		this.next = next;
	}

	public IntItem getNext() {
		return this.next;
	}

	public int getValue() {
		return this.value;
	}
}