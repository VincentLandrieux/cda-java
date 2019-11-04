package tp4;

import java.util.Scanner;

public class Tp4Exo1 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		float moyenne = 0;
		
		System.out.println("combien de notes:");
		int nbNote = inp.nextInt();
		
		for(int i = 1; i <= nbNote; i++) {
			System.out.println("note "+i+" :");
			moyenne +=  inp.nextFloat();
		}
		
		inp.close();
		
		moyenne /= nbNote;
		moyenne = (int)(moyenne *100)/100.0f;
		
		System.out.println("moyenne de ces "+nbNote+" notes: "+moyenne);

	}

}
