package tp7;

import java.util.Scanner;

public class Tp6Exo2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Entrer 3 Entiers");
		int a = inp.nextInt();
		int b = inp.nextInt();
		int c = inp.nextInt();
		
		inp.close();

		System.out.println(plusgrand(a,b,c));
	}
	
	public static int plusgrand(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}

}
