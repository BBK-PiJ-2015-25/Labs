public class OneTest {
	
	public static void main(String[] args) {
		System.out.println("Test start.");
		
		One myClass = new One();
		
		myClass.launch(0);
		myClass.launch(2);
		myClass.launch(4);
		myClass.launch(6);
		
		System.out.println("Test end.");
	}
}