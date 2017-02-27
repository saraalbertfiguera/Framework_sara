import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class Pdf5Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";
		int n = 0;
		int num = 0;
		String cad = "";
		// String cad2="";
		int cont = 0;
		int suma = 0;
		boolean correcte = true;

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
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Exit",
						JOptionPane.ERROR_MESSAGE);
				System.exit(0);
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
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Exit",
							JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			} while (correcte == false);

			if (((num % 2) == 0) && ((num % 3) == 0)) {
				cad = cad + ("\n" + num + " es divisor de 2 i de 3");
				suma = suma + num;

			}
			if ((num > 35) && (num < 75)) {
				cad = cad + ("\n" + num + " esta compres entre 35 i 75");
				suma = suma + num;
				cont++;
				// cad=cad+("esta compres entre 35 i 75"+suma);
				// cad=cad+("esta compres entre 35 i 75"+cont);

			}
		}

			JOptionPane.showMessageDialog(null,
					cad + "\nEl resultat de la suma dels numeros que compleixen les condicions anteriors es " + suma,
					"Resultat", JOptionPane.INFORMATION_MESSAGE);
			// JOptionPane.showMessageDialog(null, cad, "Resultat",
			// JOptionPane.INFORMATION_MESSAGE);
			// JOptionPane.showMessageDialog(null, "El resultat de la suma dels
			// numeros que compleixen les condicions anteriors es "+suma,
			// "Resultat", JOptionPane.INFORMATION_MESSAGE);

		

	}

}
