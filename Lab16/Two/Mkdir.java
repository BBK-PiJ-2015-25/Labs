import java.io.*;

public class Mkdir {
	public static void main(String[] args) {

		try {
			String name = args[0];
			
			File file = new File(name);

			if (!file.exists()) {
				if (file.mkdir()) {
					System.out.println("The directory was created successfully.");
				}
			} else {
				System.out.println("The directory already exists.");
			}

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("An exception was thrown.");
			System.out.println("Seems you did not enter a directory name.");
		} catch (Exception ex) {
			System.out.println("An exception was thrown.");
			System.out.println(ex.getMessage());
		}
		
	}
}