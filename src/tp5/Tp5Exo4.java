package tp5;

import java.util.Scanner;

public class Tp5Exo4 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("combien de notes:");
		int nbNotes = inp.nextInt();
		
		float notes[] = new float[nbNotes];
		
		
		for(int i = 0; i < nbNotes; i++) {
			System.out.println("note "+(i+1)+":");
			notes[i] = inp.nextFloat();
		}
		
		inp.close();
		
		System.out.println("moyenne de ces notes:"+moyenne(notes));
	}
	
	public static float moyenne(float t[]) {
		float somme = 0;
		
		for(int i = 0; i < t.length; i++) {
			somme += t[i];
		}
		
		return (float)((int)((somme/t.length)*100))/100;
	}

}
