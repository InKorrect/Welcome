package ilu2;

public class Welcome {
	public static String welcome(String input) {
		String reponse = null;
		if(" ".equals(input)||input==null||"".equals(input)) {
			reponse=vide(input);
		}else {
			String[] part=input.split(",");
			if(!part[0].equals(input)) {
				reponse=nomS(input,part);
			}else reponse=maj1(input);
		}return reponse;	
	}
	
	private static String maj1(String input) {	
		String input1 = input.substring(0, 1).toUpperCase() + input.substring(1);
		StringBuilder str = new StringBuilder("Hello, ");
		str.append(input1);
		if(input==input.toUpperCase()) {
			str.append(" !");
			return str.toString().toUpperCase();
		}
		return str.toString();
	}
	
	private static String vide(String input) {
		StringBuilder str2 = new StringBuilder("Hello, my friend");
		return str2.toString();
	}
	
	private static String nomS(String input,String[] part) {
		StringBuilder str4 = new StringBuilder("Hello");
		for(int i=0;i<part.length;i++) {
			String part1=part[i].substring(0, 1).toUpperCase() + part[i].substring(1);
			str4.append(", ");
			str4.append(part1);
		}return str4.toString();
	}
}
