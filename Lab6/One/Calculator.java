public class Calculator {

    public void add(int x, int y) {
		int total = x + y;
		System.out.println(x + " + " + y + " = " + total);
    }
    
    public void subtract(int x, int y) {
		int total = x - y;
		System.out.println(x + " - " + y + " = " + total);
    }

    public void multiply(int x, int y) {
		int total = x * y;
		System.out.println(x + " x " + y + " = " + total);
    }

    public void divide(int x, int y) {
		double total = (double) x / (double) y;
		System.out.println(x + " / " + y + " = " + total);
    }

    public void modulus(int x, int y) {
		int total = x % y;
		System.out.println(x + " % " + y + " = " + total);
    }
}
