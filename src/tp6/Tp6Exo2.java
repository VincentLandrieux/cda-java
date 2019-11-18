package tp6;

import java.util.Scanner;

public class Tp6Exo2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Entrer un texte");
		String t = inp.next();
		
		inp.close();
		
		t = delE(t);
		
		System.out.println(t);

	}
	
	public static String delE(String text) {
		String t = "";
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) != 'e') {
				t += text.charAt(i);
			}
		}
		return t;
	}

}
