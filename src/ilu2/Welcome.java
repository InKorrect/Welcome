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
	
	private static String nomS(String input,String[] part) {
		int[] nomMaj=new int[part.length]; int o=0; int nbNomMaj=0;
		StringBuilder str4 = new StringBuilder("Hello");
		for(int i=0;i<part.length;i++) {
			if(!part[i].equals(part[i].toUpperCase())) {
				String part1=part[i].substring(0, 1).toUpperCase() + part[i].substring(1);
				str4.append(", ");
				str4.append(part1);
			}else {
				nomMaj[o]=i;
				nbNomMaj++;o++;
				
			}
		}
		if(nbNomMaj>0)str4.append(nomMaj(nomMaj,part,nbNomMaj));
		return str4.toString();
	}
	private static String nomMaj(int[] nomMaj, String[] part,int nbNomMaj) {
		int i;
		StringBuilder str = new StringBuilder(". AND HELLO");
		for(i=0;i<nbNomMaj;i++) {
			str.append(", ");
			str.append(part[nomMaj[i]]);
		}
		str.append(" !");
		return str.toString();
	}
	
	private static String vide(String input) {
		StringBuilder str2 = new StringBuilder("Hello, my friend");
		return str2.toString();
	}
}
