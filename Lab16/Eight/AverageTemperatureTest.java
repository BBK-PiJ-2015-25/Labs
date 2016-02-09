public class AverageTemperatureTest {
	public static void main(String[] args) {

		System.out.println("Test start.");

		try {
			String filename 	  = "test.csv";
			AverageTemperature at = new AverageTemperature(filename);

			System.out.println("Average for each line: ");
			at.lineAverages();

			System.out.println("Average for file: ");
			at.fileAverage();

		} catch (Exception ex) {
			System.out.println("An exception was thrown: ");
			System.out.println(ex.getMessage());
		}

		System.out.println("Test end.");
	}
}