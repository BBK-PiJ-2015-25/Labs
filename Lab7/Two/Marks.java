public class Marks {

	public static void main(String[] args) {
	
		int mark = 0;
		int distinctions = 0;
		int pass = 0;
		int fail = 0;
		int invalid = 0;
	
		do {
			
			System.out.println("Enter a mark: ");
			mark = Integer.parseInt(System.console().readLine());
			
			if (mark >= 70 && mark <= 100) {
				distinctions++;
			} else if (mark < 70 && mark >= 50) {
				pass++;
			} else if (mark < 50 && mark >= 0) {
				fail++;
			} else if (mark != -1) {
				invalid++;
			}

		} while (mark != -1);
		
		int numOfStudents = distinctions + pass + fail;
		
		System.out.println("There are " + numOfStudents + ": " + distinctions + " distinctions, " + pass + " passes, " + fail + " fails (plus " + invalid + " invalid)");
	}
}