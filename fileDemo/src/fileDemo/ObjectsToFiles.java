package fileDemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ObjectsToFiles {

	private static Path filePath = Paths.get("countries.txt");

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please choose an option");
		System.out.println("1 to show list");
		System.out.println("2 to add to add to the list");
		System.out.println("3 to quit");
		while (true) {

			String command = scnr.nextLine();

			if (command.equals("3")) {
				break;
			} else if (command.equals("1")) {
				List<Country> things = readFile();
				int i = 1;
				for (Country thing : things) {
					System.out.println(i++ + ". " + thing);
				}
			} else if (command.equals("2")) {
				Country Country = getCountryFromUser(scnr);
				System.out.println("Adding " + Country);
				appendLineToFile(Country);
			} else {
				System.out.println("Invalid command.");
			}
		}
		System.out.println("Goodbye.");
		scnr.close();
	}

	private static Country getCountryFromUser(Scanner scnr) {
		String name = Validator.getString(scnr, "Enter name: ");
		int population = Validator.getInt(scnr, "Enter population: ");
		return new Country(name, population);
	}

	public static List<Country> readFile() {
		try {
			List<String> lines = Files.readAllLines(filePath);

			List<Country> country = new ArrayList<>();
			for (String line : lines) {

				String[] parts = line.split("~~~");

				String name = parts[0];
				int population = Integer.parseInt(parts[1]);

				country.add(new Country(name, population));

			}
			return country;
		} catch (IOException e) {
			System.out.println("Unable to read file.");
			return new ArrayList<>();
		}
	}

	public static Path getFilePath() {
		return filePath;
	}

	public static void setFilePath(Path filePath) {
		ObjectsToFiles.filePath = filePath;
	}

	public static void appendLineToFile(Country thing) {
		String line = String.format("%s~~~%d~~~%s",thing.getName() + "~~~" + thing.getPopulation());

		List<String> lines = Collections.singletonList(line);
		try {
			Files.write(filePath, lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.out.println("Unable to write to file.");
		}
	}

}