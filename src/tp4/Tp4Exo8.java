package tp4;

public class Tp4Exo8 {

	public static void main(String[] args) {
//		System.out.println("result "+fibonacci(10));

		int n = 1;
		float f[] = new float[3];
		f[0] = fibonacci(n);
		f[1] = fibonacci(n-1);
		f[2] = f[0] / f[1];
		
		float limiteMin = 1.6179f;
		float limiteMax = 1.6181f;
		float nbOr = ((float)Math.sqrt(5)+1)/2;
		boolean flag = true;
		
		while(flag){
			n++;
			
			f[0] = fibonacci(n);
			f[1] = fibonacci(n-1);
			f[2] = f[0] / f[1];
			
			System.out.println("n= " + n);
			System.out.println("f(n)= "+ f[2]);
			
			if(f[2] > limiteMin && f[2] < limiteMax) {
				flag = false;
			}
			
		}
		
		System.out.println("nombre d'or = "+nbOr+ " " +"f("+n+")= "+f[2]);
		
	}
	
	public static int fibonacci(int n) {
		if(n > 1) {
			n = fibonacci(n-1) + fibonacci(n-2);
		}
		
		return n;
	}
}
