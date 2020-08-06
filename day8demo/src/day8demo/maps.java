package day8demo;
import java.util.HashMap;

public class maps {

	public static void main(String[] args) {
		demoMap();

	}

	private static void demoMap() {
		HashMap<String, Integer> chapters = new HashMap<>();
		chapters.put("Lizard", 7);
		chapters.put("Wallaby", 18);
		chapters.put("Tucan", 40);

		chapters.remove("Tucan");
		System.out.println(chapters.get("Lizard"));

		System.out.println(chapters);

	}
}