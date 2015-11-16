public class Supermarket {
	
	public static void main(String[] args) {
		SupermarketQueue queue = new SupermarketQueue();
		
		queue.insert(new Person("billy"));
		queue.insert(new Person("jill"));
		queue.insert(new Person("bob"));
		queue.insert(new Person("jack"));
		queue.insert(new Person("fred"));
		
		queue.printQueue();
		
		System.out.println("------------------");
		
		queue.retrieve();
		queue.retrieve();
		queue.retrieve();
		queue.retrieve();
		queue.retrieve();
		
		queue.printQueue();
	}
}