package tp5;

public class Tp5Exo5 {

	public static void main(String[] args) {
		
		System.out.println(palindrome("cayac"));
		System.out.println(palindrome("bleu"));
	}
	
	public static boolean palindrome(String mot) {
		boolean flag = true;
		int i = 0;
		while(i < mot.length()/2 && flag) {
			if(!mot.substring(i, i+1).equals(mot.substring(mot.length()-i-1, mot.length()-i))) {
				flag = false;
			}
			
			i++;
		}
		
		return flag;
	}
}
