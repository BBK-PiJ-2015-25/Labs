import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Tr {

	public static void main(String[] args) {
		System.out.println("Start.");

		System.out.println("Enter a file name: ");
		String filename = System.console().readLine();

		File file = new File(filename);

		if (!file.exists()) {
			System.out.println("The file '" + filename + "' does not exist.");
		} else {	

			System.out.println("Enter string to replace: ");
			String toReplace = System.console().readLine();

			System.out.println("Enter string to insert in place: ");
			String toInsert = System.console().readLine();

			if (toReplace.equals(toInsert)) {
				System.out.println("The replace and insert strings are the same");
			} else {
				
				try {
					File newFile = new File(filename + ".temp");
					FileWriter fileWriter = new FileWriter(filename + ".temp");
					FileReader filereader = new FileReader(file);
					BufferedReader in = new BufferedReader(filereader);

					while (in != null) {
						String word = in.readLine();

						if (word == null) {
							break;
						}

						fileWriter.write(word.replace(toReplace, toInsert));
						fileWriter.write(String.format("%n"));
					}

					fileWriter.close();

					// Remove old file
					file.delete();

					// Rename new file
					newFile.renameTo(file);
				} catch (IOException e) {
					System.out.println(e);
				}
			}
		}

		System.out.println("End.");
	}
}