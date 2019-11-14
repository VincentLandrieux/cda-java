package tp5;

public class Tp5Exo2 {

	public static void main(String[] args) {
		
		int mat1[][] = {{1,4},
						{2,3},
						{3,2},
						{4,1}};
		int mat2[][] = {{1,2,3,4},
						{4,3,2,1}};
		
		afficheTab(multiplyMatrice(mat1, mat2));
//		affiche
//		17 14 11 8 
//		14 13 12 11 
//		11 12 13 14 
//		8 11 14 17 
		
	}
	
	public static void afficheTab(int t [][]) {
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static int[][] multiplyMatrice(int m1[][], int m2[][]){
		int tR[][] = new int[m1.length][m1.length];

		for(int i=0; i < tR.length; i++) {
			for(int j=0; j < tR[i].length; j++) {
				for(int k=0; k < m1[0].length; k++) {
//					System.out.println("i= "+i+" j= "+j+" k= "+k);
//					System.out.println(m1[i][k] +"*"+ m2[k][i]);
					tR[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		return tR;
	}
	
}
