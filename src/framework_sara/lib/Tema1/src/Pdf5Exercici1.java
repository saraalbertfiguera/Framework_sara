import javax.swing.JOptionPane;

public class Pdf5Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		String s = "";
		boolean correcte = true;
		int suma = 0;
		int producte = 1;
		int n = 0;
		String cad = "";
		int contpos_par = 0;
		int contneg_inpar = 0;

		do {
			try {
				s = JOptionPane.showInputDialog(null, "Quants numeros vols introduir?", "Introduccio de dades",
						JOptionPane.QUESTION_MESSAGE);
				if (null == s) {
					JOptionPane.showMessageDialog(null, "Has eixit de l'aplicacio", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					n = Integer.parseInt(s);
					correcte = true;
				} // end else
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (correcte == false);

		for (int i = 0; i < n; i++) {
			do {
				try {
					s = JOptionPane.showInputDialog(null, "Introdueix un numero", "Introduccio de dades",
							JOptionPane.QUESTION_MESSAGE);
					if (null == s) {
						JOptionPane.showMessageDialog(null, "Has eixit de l'aplicacio", "Exit",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						num = Integer.parseInt(s);
						correcte = true;
					} // end else
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			} while (correcte == false);

			cad = cad + ("\n El quadrat de " + num + " es " + (num * num));
			suma = (suma + num);
			producte = producte + suma;
			if (((num % 2) == 0) && (num >= 0)) {
				contpos_par++;
			}

			if (((num % 2) != 0) && (num < 0)) {
				contneg_inpar++;
			}
		}
		JOptionPane.showMessageDialog(null, cad, "Resultat", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "\n El resultat de la suma i el producte total es " + producte, "Resultat",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "s'han introduit " + contpos_par + " numeros positius i parells i "
				+ contneg_inpar + " numeros negatius i imparells","Resultat", JOptionPane.INFORMATION_MESSAGE);

	}

}
