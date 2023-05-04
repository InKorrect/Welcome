package ilu2;

public class Welcome {
	public static String welcome(String input) {
		String reponse = null;
		if(" ".equals(input)||input==null||"".equals(input)) {
			reponse=vide(input);
		}else {
			reponse=maj1(input);
		}
		return reponse;
		
	}
	private static String maj1(String input) {
		input = input.substring(0, 1).toUpperCase() + input.substring(1);
		StringBuilder str = new StringBuilder("Hello, ");
		str.append(input);
		return str.toString();
	}
	private static String vide(String input) {
		StringBuilder str2 = new StringBuilder("Hello, my friend");
		return str2.toString();
	}
}
