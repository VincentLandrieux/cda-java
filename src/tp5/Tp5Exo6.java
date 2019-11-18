package tp5;

import java.util.Scanner;

public class Tp5Exo6 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Entrer un Entier");
		int dec = inp.nextInt();
		
		inp.close();
		
		System.out.println("Base 2: "+decToBin(dec));
		System.out.println("Base 16: "+decToHex(dec));
	}
	
	public static String decToBin(int dec) {
		String bin = "";
		int result = dec;
		if(dec == 0) {
			bin = "0";
		}
		while(result > 0) {
			bin = result % 2 + bin;
			result /= 2;
			
		}
		
		return bin;
	}
	
	public static String decToHex(int dec) {
		String unit[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		String hex = "";
		int result = dec;
		if(dec == 0) {
			hex = "0";
		}
		while(result > 0) {
			hex = unit[result % 16] + hex;
			result /= 16;
			
		}
		
		return hex;
	}

}
