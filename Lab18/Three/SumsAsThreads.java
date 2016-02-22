public class SumsAsThreads implements Runnable {
	
	private static int x;
	private static int y;
	
	SumsAsThreads(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void run() {
		int sum = this.x + this.y;
		System.out.println(this.x + " + " + this.y + " = " + sum);
	}
}