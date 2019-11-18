package tp6;

import java.util.Scanner;

public class Tp6Exo1 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Entrer un texte");
		String t = inp.next();
		
		inp.close();
		
		int c = 0;
		for(int i = 0; i < t.length(); i++) {
			if(t.charAt(i) == 'e') {
				c++;
			}
		}
		
		System.out.println(c);
	}

}
