public class Matrix {
	
	private int[][] z;
	private int x;
	private int y;
	
	public Matrix(int x, int y) {
		this.x = x;
		this.y = y;
		
		int[][] myArray = new int[x][y];
		
		for (int i = 0; i < x; i++) {
			for (int b = 0; b < y; b++) {
				myArray[i][b] = 1;
			}
		}
		
		this.z = myArray;
	}
	
	public void setElement(int x, int y, int value) {
		if (x < this.x && y < this.y) {
			this.z[x-1][y-1] = value;
		}
	}
	
	public void setRow(int x, String row) {
		String[] items = row.split(",");
		int itemsL = items.length;
		
		if (x < this.x && itemsL <= this.y) {
			for (int i = 0; i < this.x; i++) {
				if (i+1 == x) {
					for (int y = 0; y < this.y; y++) {
						this.z[x][y] = Integer.parseInt(items[y]);
					}
					break;
				}
			}				
		}
	}

	public void setColumn(int y, String column) {
		String[] items = column.split(",");
		int itemsL = items.length;

		if (y < this.y && itemsL <= this.x) {
			for (int i = 0; i < this.x; i++) {
				this.z[i][0] = Integer.parseInt(items[i]);
			}
		}
	}

	public String toString() {
		String output = "[";

		int x = 0;
		int y = 0;

		while (x < this.x) {
			y = 0;
			while (y < this.y) {
				output += "'" + this.z[x][y] + "',";
				y++;
			}
			x++;
		}

		//Remove the extra comma
		output = output.substring(0, output.length()-1);
		output += "]";

		return output;
	}

	public void prettyPrint() {

		int length = this.z.length;
		int l;
		
		for (int i = 0; i < this.x; i++) {
			for (int h = 0; h < this.y; h++) {
				System.out.print(this.z[i][h] + "\t");
			}
			
			System.out.println(" ");
		}
	}
}