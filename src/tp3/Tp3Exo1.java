package tp3;

import java.util.Scanner;

public class Tp3Exo1 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Entrer un booléen");
		afficher(inp.nextBoolean());
		System.out.println("Entrer un byte");
		afficher(inp.nextByte());
		System.out.println("Entrer un char");
		afficher(inp.next().charAt(0));
		System.out.println("Entrer un short");
		afficher(inp.nextShort());
		System.out.println("Entrer un int");
		afficher(inp.nextInt());
		System.out.println("Entrer un long");
		afficher(inp.nextLong());
		System.out.println("Entrer un float");
		afficher(inp.nextFloat());
		System.out.println("Entrer un double");
		afficher(inp.nextDouble());
		System.out.println("Entrer un string");
		afficher(inp.next());
		
		inp.close();
		
	}
	
	/* Fonctions */
	//Afficher
	public static void afficher(boolean a) {
		System.out.println(a);
	}
	public static void afficher(byte a) {
		System.out.println(a);
	}
	public static void afficher(char a) {
		System.out.println(a);
	}
	public static void afficher(short a) {
		System.out.println(a);
	}
	public static void afficher(int a) {
		System.out.println(a);
	}
	public static void afficher(long a) {
		System.out.println(a);
	}
	public static void afficher(float a) {
		System.out.println(a);
	}
	public static void afficher(double a) {
		System.out.println(a);
	}
	public static void afficher(String a) {
		System.out.println(a);
	}
	
}
