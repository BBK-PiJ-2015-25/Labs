// Lab 11.1 Don’t Repeat Yourself

public class Comparator<T extends Comparable<T>> {
	
	public T getMax(T n, T m) {
		
		if (n.compareTo(m) > 0) {
			return n;
		} else {
			return m;
		}
	}
}