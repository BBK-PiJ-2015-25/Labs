public class ResponsiveUi implements Runnable {
	
	public static void main(String[] args) {
		System.out.println("Response UI test");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the duration (in ms) of task " + i + ": ");
			int milli = Integer.parseInt(System.console().readLine());
			
			ResponsiveUi responsiveUi = new ResponsiveUi();
			Thread process = new Thread(responsiveUi);
			process.start();
			
			try {
				process.join(milli);
			} catch (Exception ex) {
				System.out.println("An exception has been thrown");
				System.out.println(ex.getMessage());
			}
		}
	}
	
	public void run() {
		System.out.println("Thread is running.");
	}
}