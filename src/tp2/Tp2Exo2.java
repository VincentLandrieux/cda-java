package tp2;

import javax.swing.JOptionPane;

public class Tp2Exo2 {

	public static void main(String[] args) {
		
		String a;
		String b;
		
		a = JOptionPane.showInputDialog(null, "Entrer un entier");
		b = JOptionPane.showInputDialog(null, "Entrer un deuxième entier");
		
		JOptionPane.showMessageDialog(null, Integer.parseInt(a) + Integer.parseInt(b));
	}

}
