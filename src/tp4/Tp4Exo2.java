package tp4;

import java.util.Scanner;

public class Tp4Exo2 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		float moyenne = 0;
		
		float note = 0f;
		int c = 0;
		
//		while(true) {
//			System.out.println("note "+(c+1)+" :");
//			note = inp.nextFloat();
//			if(note >= 0){
//				moyenne +=  note;
//				c++;
//			}else {
//				break;
//			}
//		}
		do {
			System.out.println("note "+(c+1)+" :");
			note = inp.nextFloat();
			if(note >= 0){
				moyenne +=  note;
				c++;
			}
		}while(note >= 0);
		
		inp.close();
		
		moyenne /= c;
		
		System.out.println("moyenne de ces "+c+" notes: "+moyenne);

	}

}
