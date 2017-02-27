import javax.swing.JOptionPane;

public class Pdf5Exercici6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0;
		int num = 0;
		String s = "";
		boolean correcte = true;
		int suma = 0;
		String cad = "";

		while (cont < 5) {
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

			if (((num % 7) == 0) || ((num % 11) == 0)) {
				cont++;
				cad = cad + (num + " es multiple de 7 o de 11\n");
				suma = suma + num;
			}

		} // end while
		JOptionPane.showMessageDialog(null, cad + " \n La suma dels numeros es " + suma, "Resultat",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
