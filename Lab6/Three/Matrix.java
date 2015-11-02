public class Matrix {
	
	private int[][] z;
	private int x;
	private int y;
	
	public Matrix(int x, int y) {
		this.x = x;
		this.y = y;
		
		int[] yArray = new int[y];
		int[][] xArray = new int[x][y];
		
		for (int i = 0; i < y; i++) {
			yArray[i] = 1;
		}
		
		for (int b = 0; b < x; b++) {
			xArray[b] = yArray;
		}
		
		this.z = xArray;
	}
	
	public void setElement(int x, int y, int value) {
		if (x < this.x && y < this.y) {
			this.z[x][y] = value;
		}
		
		// Test
		this.printArray();
	}
	
	public void setRow(int x, String row) {
		String[] items = row.split(",");
		int itemsL = items.length;
		
		if (x < this.x && itemsL < this.y) {
			
			int[] itemsInt = new int[itemsL];
		
			for (int i = 0; i < itemsL; i++) {
				itemsInt[i] = Integer.parseInt(items[i]);
			}
				
			this.z[x] = itemsInt;
		}
		
		// Test
		this.printArray();
	}
	
	// Method to test my arrays
	public void printArray() {
		
		int length = this.z.length;
		int l;
		
		for (int i = 0; i < length; i++) {
			l = this.z[i].length;
			for (int h = 0; h < l; h++) {
				System.out.print(this.z[i][h] + " - ");
			}
			
			System.out.println(" ");
			System.out.println("-------");
		}
	}
}