package tp5;

import java.util.Scanner;

public class Tp5Exo1 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int tab[] = new int[5];
		
		for(int i = 0; i < tab.length; i++) {
			System.out.println("Entrer un entier à la position "+i);
			tab[i] = inp.nextInt();
		}
		
		inp.close();
		
		System.out.println("Valeur max "+maxTab(tab));
		System.out.println("Nombre de zero "+nbZero(tab));
	}
	
	public static int maxTab(int t[]) {
		int n = t[0];
		for(int i = 1; i < t.length; i++) {
			if(t[i] > n) {
				n = t[i];
			}
		}
		
		return n;
	}
	public static int nbZero(int t[]) {
		int n = 0;
		
		for(int i = 0; i < t.length; i++) {
			if(t[i] == 0) {
				n++;
			}
		}
		
		return n;
	}

}
