import java.io.*;

public class Cp {
	public static void main(String[] args) {

		String filename 	= args[0];
		String copyFilename = args[1];

		File existingFile = new File(filename);
		File copyFile     = new File(copyFilename);

		try {
			if (!existingFile.exists()) {
				throw new Exception("A file with the name '" + filename + "' does not exist.");
			}

			if (!existingFile.isFile()) {
				throw new Exception("The name '" + filename + "' does not relate to a file.");
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("An exception has been thrown.");
			System.out.println("You need to enter the name of an existing file and the name of a new file.");
		} catch (Exception ex) {
			System.out.println("An exception has been thrown.");
			System.out.println("MSG: " + ex.getMessage());
		}

		 try (BufferedReader in = new BufferedReader(new FileReader(existingFile));
		 	PrintWriter out = new PrintWriter(copyFile)) {

			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
				out.println();
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File " + filename + " does not exist.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}