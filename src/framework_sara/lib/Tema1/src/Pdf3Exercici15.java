import javax.swing.JOptionPane;

public class Pdf3Exercici15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		String s = "";
		boolean correcte = true;
		int contador = 0;
		int producte = 1;

		while (contador < 5) {

			do {
				try {
					s = JOptionPane.showInputDialog(null, "Introdueix un numero", "Introduccio de dades",
							JOptionPane.QUESTION_MESSAGE);
					if (s == null) {
						JOptionPane.showInternalMessageDialog(null, "Has eixit de l'aplicació", "Exit",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						num = Integer.parseInt(s);

					} // end else

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error",
							JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}

			} while (correcte == false);

			// end while

			if ((num % 2) != 0) {
				producte = producte * num;
				contador++;
			} // end if
		} // end while

		JOptionPane.showMessageDialog(null, "El resultat de l'operació és: " + producte, "Resultat",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
