package tp4;

import java.util.Scanner;

public class Tp4Exo5 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		final int code = 1234;
		
		int nbT = 5;
		while(nbT > 0){
			System.out.println("Entrer le code:");
			if(inp.nextInt() == code) {
				nbT = -1;
				System.out.println("correct");
				
			}else {
				nbT--;
				System.out.println("incorrect, reste "+nbT+" essai(s)");
			}
		}
		inp.close();
		
		if(nbT == 0){
			System.out.println("bloqué");
		}
	}

}
