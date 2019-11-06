package tp4;

public class Tp4Exo8 {

	public static void main(String[] args) {
		System.out.println("result "+fibonacci(10));

	}
	
	public static int fibonacci(int n) {
		if(n > 1) {
			n = fibonacci(n-1) + fibonacci(n-2);
		}
		
		return n;
	}

}
