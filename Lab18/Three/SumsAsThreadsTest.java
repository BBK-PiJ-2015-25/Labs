import java.util.concurrent.*;

public class SumsAsThreadsTest implements Executor {
	
	public static void main(String[] args) {
		
		SumsAsThreadsTest tester = new SumsAsThreadsTest();
		
		for (int i = 0; i < 100; i++) {
			int x = i;
			int y = (int) (Math.random() * 50 + 1);
			
			tester.execute(new SumsAsThreads(x, y));
		}
	}
	
	public void execute(Runnable r) {
		new Thread(r).start();
	}
}