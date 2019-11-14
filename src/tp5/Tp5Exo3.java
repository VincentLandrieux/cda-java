package tp5;

import java.util.Scanner;

public class Tp5Exo3 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
//		System.out.println("Entrer le nombre d'entier");
//		int nb = inp.nextInt();
//		
//		int tab[] = new int[nb];
//		
//		for(int i = 0; i < nb; i++) {
//			System.out.println("Entrer un entier à la position "+i);
//			tab[i] = inp.nextInt();
//		}
		
		inp.close();
		
		int t[] = {5,4,1,4,8,0};
		
		afficheTab(tri(t));
		afficheTab(triABulle(t));
	}
	
	public static int[] tri(int t[]) {
		for(int i=0; i < t.length; i++) {
			for(int j=0; j < t.length; j++) {
				if(t[i] > t[j]) {
					t = switchTab(t, i, j);
				}
			}
		}
		
		return t;
	}
	public static int[] triABulle(int t[]) {
		int f = t.length;
		int i = 0;
		
		while(i < f) {
			for(int j=0; j < f; j++) {
				if(t[i] > t[j]) {
					t = switchTab(t, i, j);
				}
			}
				
			i++;
		}
		
		return t;
	}
	
	public static int[] switchTab(int t[], int i1, int i2) {
		int x = t[i1];
		t[i1] = t[i2];
		t[i2] = x;
		
		System.out.println(t[i1]+"<>"+t[i2]);
		
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
