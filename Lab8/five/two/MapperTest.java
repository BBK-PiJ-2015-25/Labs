public class MapperTest {
	public static void main(String[] args) {
		System.out.println("Lab 9.5.2 - Simple map");
		System.out.println("----------------");
		
		SimpleMapper sm = new SimpleMapper(10);
		
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
		// This should not be added as our array has reached its limit
		sm.put(999, "dfsgdfgdfg");
		
		sm.printPairs();

		System.out.println("----------------");
		System.out.println(sm.get(89));


		System.out.println("----------------");
		sm.remove(11);
		sm.remove(123);

		sm.printPairs();

		System.out.println("----------------");
		System.out.println("End.");
	}
}