package tp6;

public class Tp6Exo5 {

	public static void main(String[] args) {
		int d = 32;
		int f = 127;
		
		int l = f-d+1;
		
		char tChar[] = new char[l];
		int tInt[] = new int[l];
		String tHex[] = new String[l];
		
		for(int i = 0; i < l; i++) {
			tInt[i] = d+i;
			tChar[i] = (char)(d+i);
			tHex[i] = Integer.toHexString(d+i);
		}
		
		System.out.println("Char Int Hex");
		for(int i = 0; i < l; i++) {
			System.out.println(" "+tChar[i]+"   "+tInt[i]+"  "+tHex[i]);
		}		
	}

}
