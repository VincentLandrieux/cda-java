package tp3;

import java.util.Scanner;

public class Tp3Exo4 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		
		int s = 0;
		
		System.out.println("Entrer les heures");
		s += inp.nextInt() * 3600;
		System.out.println("Entrer les minutes");
		s += inp.nextInt() * 60;
		System.out.println("Entrer les secondes");
		s += inp.nextInt();
		
		inp.close();
		
		System.out.println(s + " s");

	}

}
