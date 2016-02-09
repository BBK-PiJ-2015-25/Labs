import java.io.*;
import java.util.Scanner;

public class AverageTemperature {

	private File file = null;

	AverageTemperature(String filename) throws Exception {
		File file = new File(filename);

		if (!file.exists()) {
			throw new Exception("The file '" + filename + "' does not exist.");
		}

		if (!file.isFile()) {
			throw new Exception("The item named '" + filename + "' is not a file.");
		}

		this.file = file;
	}

	public void lineAverages() throws Exception {

		if (this.file != null) {
			BufferedReader in = new BufferedReader(new FileReader(this.file));

			String line;
			while ((line = in.readLine()) != null) {
				Scanner scanner = new Scanner(line).useDelimiter(", ");
				int total 		= 0;
				int totalItems  = 0;

				while (scanner.hasNextInt()) {
					total += scanner.nextInt();
					totalItems++;
				}

				System.out.println(total / totalItems);
			}

		} else {
			throw new Exception("A file is needed for the lineAverages method.");
		}
	}

	public void fileAverage() throws Exception {
		if (this.file != null) {
			BufferedReader in = new BufferedReader(new FileReader(this.file));

			String line;
			int total 		= 0;
			int totalItems  = 0;
			while ((line = in.readLine()) != null) {
				Scanner scanner = new Scanner(line).useDelimiter(", ");
				
				while (scanner.hasNextInt()) {
					total += scanner.nextInt();
					totalItems++;
				}
			}

			System.out.println(total / totalItems);

		} else {
			throw new Exception("A file is needed for the lineAverages method.");
		}
	}
}