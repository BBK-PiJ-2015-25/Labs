public class ComparatorTest {
	public static void main(String[] args) {
		System.out.println("Comparator Test");
		
		Comparator<Integer> intTest = new Comparator<>();
		Comparator<Double> doubleTest = new Comparator<>();
		Comparator<String> stringTest = new Comparator<>();
		
		System.out.println(intTest.getMax(1, 2));
		System.out.println(doubleTest.getMax(1.1, 1.2));
		System.out.println(stringTest.getMax("1", "2"));
		
		System.out.println("End.");
	}
}