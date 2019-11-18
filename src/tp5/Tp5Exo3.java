package tp5;

import java.util.Scanner;

public class Tp5Exo3 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Entrer le nombre d'entier");
		int nb = inp.nextInt();
		
		int tab[] = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.println("Entrer un entier à la position "+i);
			tab[i] = inp.nextInt();
		}
		
		inp.close();
		
//		int t[] = {5,4,1,4,8,0};
		
		afficheTab(tab);
		
		afficheTab(triABulle(tab.clone()));
		
//		afficheTab(tab);
	}

	public static int[] triABulle(int t[]) {
		for(int i = t.length-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(t[j] > t[j+1]) {
					t = switchTab(t, j, j+1);
				}
			}
		}
		
		return t;
	}
	
	public static int[] switchTab(int t[], int i1, int i2) {
		int x = t[i1];
		t[i1] = t[i2];
		t[i2] = x;
		
		return t;
	}
	
	public static void afficheTab(int t []) {
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " ");
		}
		System.out.println("");
		System.out.println("");
	}

}
