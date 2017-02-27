import javax.swing.JOptionPane;

public class Pdf5Exercici7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean correcte = true;
		String s = "";
		int interruptor = 1;
		int numprev = 0;
		int suma = 0;
		int cont = 0;
		int num = 0;

		do {
			try {
				s = JOptionPane.showInputDialog(null, "Introdueix un numero", "Introduccio de dades",
						JOptionPane.QUESTION_MESSAGE);
				if (null == s) {
					JOptionPane.showMessageDialog(null, "Has eixit de laplicacio", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					numprev = Integer.parseInt(s);
					correcte = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error",
						JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		} while (correcte == false);

		while (interruptor == 1) {

			do {
				try {
					s = JOptionPane.showInputDialog(null, "Introdueix un numero", "Introduccio de dades",
							JOptionPane.QUESTION_MESSAGE);
					if (null == s) {
						JOptionPane.showMessageDialog(null, "Has eixit de laplicacio", "Exit",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						num = Integer.parseInt(s);
						correcte = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error",
							JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			} while (correcte == false);

			if (num == 0) {
				interruptor = 0;
			} else {
				if (num > numprev) {
					cont++;
				} else {
					suma = suma + num;
				}
			} // end else

		}
		JOptionPane
				.showMessageDialog(null,
						"Shan introduit " + cont + " numeros majors que " + numprev
								+ "\nLa suma dels numeros menor que " + numprev + " es " + suma,
						"Resultat", JOptionPane.INFORMATION_MESSAGE);

	}

}
