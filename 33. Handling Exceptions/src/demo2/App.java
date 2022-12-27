package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		File file = new File("test.txt");

		try {
			FileReader fr = new FileReader(file);

			// This will not be executed if exception is thrown.
			System.out.println("Continuting....");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		}

		System.out.println("Finished.");

	}

}
