package tp6;

import java.util.Scanner;

public class Tp6Exo3 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Entrer un texte");
		String t = inp.next();
		
		inp.close();
		
		if(t.length() <= 30) {
			System.out.println(reverse(t));
		}

	}
	
	public static String reverse(String texte) {
		String t = "";
		
		for(int i = 0; i < texte.length(); i++) {
			t = texte.charAt(i) + t;
		}
		
		return t;
	}

}
