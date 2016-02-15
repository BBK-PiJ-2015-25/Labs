public class Tester {
	
	public static void main(String[] args) {
		System.out.println("Lab 9 - Integer Binary Tree");
		IntegerTreeNode start = new IntegerTreeNode(6);
		
		start.add(5);
		start.add(9);
		start.add(3);
		
		//System.out.println("Max: " + start.getMax());
		//System.out.println("Min: " + start.getMin());
		
		//start.add(8);
		
		//System.out.println("Max: " + start.getMax());
		//System.out.println("Min: " + start.getMin());
		
		//start.add(19);
		
		//System.out.println("Max: " + start.getMax());
		//System.out.println("Min: " + start.getMin());
		
		//start.add(3);
		
		//System.out.println("Max: " + start.getMax());
		//System.out.println("Min: " + start.getMin());
		
		//start.add(5);
		
		//System.out.println("Max: " + start.getMax());
		//System.out.println("Min: " + start.getMin());
		
		//start.add(15);
		
		//System.out.println("Max: " + start.getMax());
		//System.out.println("Min: " + start.getMin());
		
		//start.add(2);
		//start.add(1);
		
		System.out.println(start.toString());
		System.out.println(start.toStringSimple());
		
		System.out.println(start.getDepth());
		
		System.out.println("Goodbye.");
	}
}