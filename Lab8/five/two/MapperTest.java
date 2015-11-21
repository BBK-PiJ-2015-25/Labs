public class MapperTest {
	public static void main(String[] args) {
		System.out.println("MapperTest start");
		
		SimpleMapper sm = new SimpleMapper();
		
		sm.put(100, "Hello");
		sm.put(11, "Foo");
		sm.put(67, "Bar");
		sm.put(345, "Hi");
		sm.put(872, "World");
		sm.put(702, "FooBar");
		sm.put(1, "Fizz");
		sm.put(89, "Buzz");
		sm.put(123, "Hello Dave!");
		sm.put(81, "Word");
		sm.put(999, "dfsgdfgdfg");
		
		sm.printPairs();
		
		System.out.println("End.");
	}
}