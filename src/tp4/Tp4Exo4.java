package tp4;

public class Tp4Exo4 {

	public static void main(String[] args) {
		
		int n = 100;
		
		for(int i = 2; i <= n; i++) {
			if(premier(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	public static boolean premier(int n) {
		boolean flag = true;
		
		for(int i=2; i < n/*/2*/; i++) {
			if(n%i == 0) {
				flag = false;
			}
		}
		
		return flag;
	}

}
