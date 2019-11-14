package tp5;

import java.util.Scanner;

public class Tp5Exo1b {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int tab[][] = new int[2][3];
		
		for(int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab[i].length; j++) {
				System.out.println("Entrer un entier à la position "+j+" de la ligne "+i);
				tab[i][j] = inp.nextInt();
			}
		}
		
		inp.close();
		
		for(int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
		
		
		System.out.println("Valeur max "+maxTab(tab));
		System.out.println("Nombre de zero "+nbZero(tab));

	}
	
	public static int maxTab(int t[][]) {
		int n = t[0][0];
		for(int i = 0; i < t.length; i++) {
			for(int j = 1; j < t[i].length; j++) {
				if(t[i][j] > n) {
					n = t[i][j];
				}
			}
		}
		
		return n;
	}
	public static int nbZero(int t[][]) {
		int n = 0;
		
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				if(t[i][j] == 0) {
					n++;
				}
			}
		}
		
		return n;
	}

}
