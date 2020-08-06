package day8demo;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		colorList();

	}

	private static void colorList() {

		ArrayList<String> color = new ArrayList<>();
		color.add("red");
		color.add("white");
		color.add("blue");
		color.add("green");

		System.out.println(color);

		color.remove(3);

		System.out.println(color);

		for (int i = 0; i < color.size(); i++) {
			System.out.println(i + " " + color.get(i));
		}

		for (String colors : color) {
			System.out.println(colors);
		}
		
	}

}
