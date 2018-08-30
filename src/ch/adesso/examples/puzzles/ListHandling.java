package ch.adesso.examples.puzzles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListHandling {
	
	public static void mainA(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("blau");
		colors.add("rot");
		colors.add("rot");
		colors.add("gr�n");
		for (String color : colors) {
			if (color.equals("rot")) {
				colors.remove(color);
			}
		}
		for (String color : colors) {
			System.out.println(color);
		}
	}

	public static void mainB(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("blau");
		colors.add("rot");
		colors.add("rot");
		colors.add("gr�n");
		for (int i = 0; i < colors.size(); i++) {
			if (colors.get(i).equals("rot")) {
				colors.remove(i);
			}
		}
		for (String color : colors) {
			System.out.println(color);
		}
	}

	public static void mainC(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("blau");
		colors.add("rot");
		colors.add("rot");
		colors.add("gr�n");
		for (int i = colors.size() - 1; i >= 0; i--) {
			if (colors.get(i).equals("rot")) {
				colors.remove(i);
			}
		}
		for (String color : colors) {
			System.out.println(color);
		}
	}

	public static void mainD(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("blau");
		colors.add("rot");
		colors.add("rot");
		colors.add("gr�n");
		Iterator<String> iterator = colors.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().equals("rot")) {
				iterator.remove();
			}
		}
		for (String color : colors) {
			System.out.println(color);
		}
	}

}
