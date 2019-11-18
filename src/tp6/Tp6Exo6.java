package tp6;

public class Tp6Exo6 {

	public static void main(String[] args) {
		int d = 128;
		int f = 255;
		
		afficheUnicode(d,f);
		
		d = 256;
		f = 351;
		
		afficheUnicode(d,f);

	}
	
	public static void afficheUnicode(int d, int f) {
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
		System.out.println();
	}

}
