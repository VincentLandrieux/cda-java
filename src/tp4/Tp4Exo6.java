package tp4;

import java.util.Scanner;

public class Tp4Exo6 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int somme = 0;
		
		System.out.println("Donner une valeur entre 1 et 100 inclus");
		int n = inp.nextInt();
		
		for(int i = 1; i < n*2; i+=2){
			somme += i;
		}
		System.out.println(somme);
				
		inp.close();
	}

}
