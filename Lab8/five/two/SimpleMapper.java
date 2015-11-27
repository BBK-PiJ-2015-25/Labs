public class SimpleMapper implements SimpleMap {
	
	private String[] items;
	private int[] keys;
	private int size;

	SimpleMapper(int mapSize) {
		this.items = new String[mapSize];
		this.keys = new int[mapSize];
		this.size = mapSize;
	}
		
	public void put(int key, String name) {
		for (int i = 0; i < this.size; i++) {
			if (this.keys[i] == 0 && this.items[i] == null) {
				this.keys[i] = key;
				this.items[i] = name;
				break;
			}
		}
	}
	
	public String get(int key) {
		for (int i = 0; i < this.size; i++) {
			if (this.keys[i] == key) {
				return this.items[i];
			}
		}

		return null;
	}
	
	public void remove(int key) {
		for (int i = 0; i < this.size; i++) {
			if (this.keys[i] == key) {
				this.items[i] = null;
				this.keys[i] = 0;
			}
		}
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