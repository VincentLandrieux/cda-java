package tp4;

public class Tp4Exo10 {

	public static void main(String[] args) {
		long nbCases = 64;
		
		for(int i = 1; i <= nbCases; i++) {
			System.out.println("Case "+i+": "+(long)Math.pow(2,i-1));
		}

	}

}
