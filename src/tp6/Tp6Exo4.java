package tp6;

import java.util.Scanner;

public class Tp6Exo4 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Entrer le nombre de texte");
		int nbT = inp.nextInt();
		
		String tabT[] = new String[nbT];
		
		for(int i = 0; i < nbT; i++) {
			System.out.println("Entrer un texte");
			tabT[i] = inp.next();
		}
		
		inp.close();
		
		triAlpha(tabT);
		afficheTab(tabT);

	}
	
	public static void triAlpha(String[] tabTexte) {
		
		for(int i = 0; i < tabTexte.length-1; i++) {
			for(int j = i+1; j < tabTexte.length; j++) {
				int r = tabTexte[i].compareTo(tabTexte[j]);
				if(r > 0) {
					tabTexte = switchTab(tabTexte, i, j);
				}
			}
		}
	}
	
	public static String[] switchTab(String t[], int i1, int i2) {
		String x = t[i1];
		t[i1] = t[i2];
		t[i2] = x;
		
		return t;
	}
	
	public static void afficheTab(String[] t) {
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " ");
		}
		System.out.println();
	}

}
