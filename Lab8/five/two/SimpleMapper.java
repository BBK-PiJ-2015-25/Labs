public class SimpleMapper implements SimpleMap {
	
	private String[] items = new String[10];
	private int[] keys = new int[10];
		
	public void put(int key, String name) {
		for (int i = 0; i < 10; i++) {
			if (this.keys[i] == 0 && this.items[i] == null) {
				this.keys[i] = key;
				this.items[i] = name;
				break;
			}
		}
	}
	
	public String get(int key) {
		return "Hello";
	}
	
	public void remove(int key) {
		
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	// For debugging purposes
	public void printPairs() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.keys[i] + " - " + this.items[i]);
		}
	}
}