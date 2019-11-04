package tp2;

import java.util.Scanner;

/*
 * Nom du répertoire: tp2
 * Nom du projet: exo1
 * Nom de la classe: Tp2Exo1
 */
public class Tp2Exo1 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Entrer un entier");
		a = inp.nextInt();
		System.out.println("Entrer un deuxième entier");
		b = inp.nextInt();
		
		inp.close();
		
		System.out.println("Somme: " + (a+b));
	}

}
