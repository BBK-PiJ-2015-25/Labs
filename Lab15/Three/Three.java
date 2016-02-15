public class Three {
	public static void main(String[] args) {
		int i = 0;
		int total = 0;
		int totalNumbers = 10;
		
		while (i < totalNumbers) {
			
			int myNum = 0;
			
			while (myNum == 0) {
				try {
				
					System.out.println("Enter a number: ");
					String myInput = System.console().readLine();
					myNum		   = Integer.parseInt(myInput);
					total 		   = total + myNum;
					i++;
					
				} catch(NumberFormatException ex) {
					System.out.println("Please enter a number");
				}
			}
		}
		
		System.out.println("Average: " + total / totalNumbers);
	}
}