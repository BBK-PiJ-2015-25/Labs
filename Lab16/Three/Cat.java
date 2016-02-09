import java.io.*;

public class Cat {
	public static void main(String[] args) {

		try {
			String filename = args[0];
			File file       = new File(filename);
			
			if (!file.exists()) {
				throw new Exception("The file '" + filename + "'' does not exist.");
			}

			// Could be a directory so check its a file
			if (!file.isFile()) {
				throw new Exception("The file '" + filename + "'' is not a file.");
			}

			BufferedReader in = new BufferedReader(new FileReader(file));

			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}

			System.out.println("----");
			System.out.println("End of file.");

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("An exception was thrown.");
			System.out.println("You did not enter a filename.");
		} catch (Exception ex) {
			System.out.println("An exception was thrown.");
			System.out.println(ex.getMessage());
		}
	}
}