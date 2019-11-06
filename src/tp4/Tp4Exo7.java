package tp4;

import java.util.Scanner;

public class Tp4Exo7 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		String bit;
		
		System.out.println("Donner une valeur enti�re comprise entre -2147483648 et 2147483647");
		int n = inp.nextInt();
		System.out.println("Donner un num�ro de bit compris entre 0 et 31");
		int iBit = inp.nextInt();
		
		bit = decToBin(n).substring(iBit, iBit+1);
		System.out.println("Dans l'�criture binaire du nombre "+n+" ("+decToBin(n)+"), le bit num�ro "+iBit+" est � "+ bit);
				
		inp.close();
	}
	
	public static String decToBin(int dec){
		String bin = "";
		int reste = dec;
		while(reste > 0){
			bin = (reste%2) + bin;
			reste = reste/2;
		}
		
		return bin;
	}

}
