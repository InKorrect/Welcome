package ilu2;

public class Welcome {
	public static String welcome(String input) {
		input = input.substring(0, 1).toUpperCase() + input.substring(1);
		StringBuilder str = new StringBuilder("Hello, ");
		str.append(input);
		return str.toString();
	}
}
