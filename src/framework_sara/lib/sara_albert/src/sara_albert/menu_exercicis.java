package sara_albert;

import javax.swing.JOptionPane;

public class menu_exercicis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] opcions = { "exercici1", "exercici2", "Eixir" };
		String[] opcionssec = { "Tornar a fer lexercici", "Tornar al menu principal", "Eixir" };
		int op = 0;
		int ops = 0;

		do {
			op = funcions.menu(opcions, "Quin exercici vols fer?", "Menu");

			if ((op == 2) || (op == -1)) {
				JOptionPane.showMessageDialog(null, "Thanks for use this application", "Exit",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}

			switch (op) {
			case 0:
				do {
					String resultat = "";
					resultat = exercicis_examen.exer1();
					JOptionPane.showMessageDialog(null, resultat);

					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;

			case 1:
				do {
					String resultat1 = "";
					resultat1 = exercicis_examen.exer2();
					JOptionPane.showMessageDialog(null, resultat1);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;

			

			

			}// end switch
		} while ((op != 2) || (ops != 2));

	}//
}//
