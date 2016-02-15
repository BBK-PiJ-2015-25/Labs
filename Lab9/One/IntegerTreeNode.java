public class IntegerTreeNode {
	
	private int value;
	private IntegerTreeNode left = null;
	private IntegerTreeNode right = null;
	
	IntegerTreeNode (int number) {
		this.value = number;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) { 
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	
	public int getMax() {
		if (this.right == null) {
			return this.value;
		} else {
			return this.right.getMax();
		}
	}
	
	public int getMin() {
		if (this.left == null) {
			return this.value;
		} else {
			return this.left.getMin();
		}
	}
	
	public String toString() {
		
		String str = "["+this.value+" L";
		
		if (this.left != null) {
			str += this.left.toString();
		} else {
			str += "[]";
		}
		
		str += "R";
	
		if (this.right != null) {
			str += this.right.toString();
		} else {
			str += "[]";
		}
		
		str += "]";
		
		return str;
	}
	
	public String toStringSimple() {
		
		String str = "["+this.value+"";
		
		if (this.left != null) {
			str += this.left.toStringSimple();
		}
		
		if (this.right != null) {
			str += this.right.toStringSimple();
		}
		
		return str + "]";
	}
	
	public int getDepth() {
		int leftDepth = 0;
		if (left != null) {
			leftDepth = this.left.getDepth();
		}
		
		int rightDepth = 0;
		if (right != null) {
			rightDepth = this.right.getDepth();
		}
		
		if (leftDepth > rightDepth) {
			return 1 + leftDepth;
		} else {
			return 1 + rightDepth;
		}
	}
}