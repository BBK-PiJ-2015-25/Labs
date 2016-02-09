import java.io.*;

public class Ls {
	public void listFiles(String path) {
		File file = new File(path);

		if (!file.isDirectory()) {
			throw new IllegalArgumentException("The path was not a directory.");
		}

		File[] list = file.listFiles();
		int l 		= list.length;

		for (int i = 0; i < l; i++) {
			System.out.println(list[i]);
		}
	}
}