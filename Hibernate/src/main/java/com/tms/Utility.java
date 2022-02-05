package com.tms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Satyaa
 * @see Basic utilities function like String input, Integer Input....
 * @since January, 2022
 */
public class Utility {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static String strInput() throws IOException {
		String str = reader.readLine();
		return str;
	}

	public static Integer intInput() throws IOException {
		int input = Integer.parseInt(reader.readLine());
		return input;
	}

	public static double doubleInput() throws NumberFormatException, IOException {
		double input = Double.parseDouble(reader.readLine());
		return input;
	}

	public static void terminateReader() throws IOException {
		reader.close();
	}

	/**
	 * @see Exit application shortcut
	 */
	public static void exitApplication() {
		System.out.println("\n\nThanks for using our application!");
		System.exit(-1);
	}
	
	public static String editDetailsConfirmation(String validation) {
		if ("*".equals(validation)) {
			return null;
		} else {
			return validation;
		}
	}

}
