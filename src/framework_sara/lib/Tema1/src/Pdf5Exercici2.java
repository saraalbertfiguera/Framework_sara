import javax.swing.JOptionPane;

public class Pdf5Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad = "";

		for (int i = 1; i <= 10; i++) {
			cad = "";// netegem cadena
			for (int j = 1; j <= 10; j++) {
				cad = cad + (i + " * " + j + " = " + (i * j) + "\n");
			} // end for
			JOptionPane.showMessageDialog(null, cad, "Resultat", JOptionPane.INFORMATION_MESSAGE);

		} // end for

	}

}
