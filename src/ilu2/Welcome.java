package ilu2;

public class Welcome {
	public static String welcome(String input) {
		String reponse = null;
		if(" ".equals(input)||input==null||"".equals(input)) {
			reponse=vide(input);
		}else {
			input=input.replaceAll(" ", "");
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
	private static int nbOccurences(String[] noms,int nbOccur,String nom) {
		for(int i=0;i<noms.length;i++) {
			if(noms[i].equals(nom)) {
				nbOccur++;
			}
		}
		return nbOccur;
	}
	
	private static boolean exist(String[] nomMin,String nom) {
		boolean exist=false;
		for(int i=0;i<nomMin.length;i++) {
			if(nomMin[i].equals(nom)) {
				exist=true;
			}
		}
		return exist;
	}
	
	private static String nomS(String input,String[] part) {
		int[] nomMaj=new int[part.length]; int o=0; int nbNomMaj=0;
		int[] nomMin=new int[part.length]; int m=0; int nbNomMin=0;
		StringBuilder str4=new StringBuilder("");
		for(int i=0;i<part.length;i++) {
			if(!part[i].equals(part[i].toUpperCase())) {
				nomMin[m]=i;
				nbNomMin++;m++;
			}else {
				nomMaj[o]=i;
				nbNomMaj++;o++;
			}
		}
		if(nbNomMin>0)str4.append(nomMin(nomMin,part,nbNomMin));
		if(nbNomMaj>0)str4.append(nomMaj(nomMaj,part,nbNomMaj));
		return str4.toString();
	}
	
	private static String nomMin(int[] nomMin,String part[],int nbNomMin) {
		int i;
		StringBuilder str = new StringBuilder("Hello");
		for(i=0;i<nbNomMin-1;i++) {
			str.append(", ");
			str.append(part[nomMin[i]].substring(0, 1).toUpperCase()+part[nomMin[i]].substring(1));
		}
		if(nbNomMin>1)str.append(" and ");
		else str.append(", ");
		str.append(part[nomMin[i]].substring(0, 1).toUpperCase()+part[nomMin[i]].substring(1));
		return str.toString();
		}
	
	private static String nomMaj(int[] nomMaj, String[] part,int nbNomMaj) {
		int i;
		StringBuilder str = new StringBuilder(". AND HELLO");
		for(i=0;i<nbNomMaj-1;i++) {
			str.append(", ");
			str.append(part[nomMaj[i]]);
		}
		if(nbNomMaj>1)str.append(" AND ");
		else str.append(", ");
		str.append(part[nomMaj[i]]);
		str.append(" !");
		return str.toString();
	}
	
	private static String vide(String input) {
		StringBuilder str2 = new StringBuilder("Hello, my friend");
		return str2.toString();
	}
}
