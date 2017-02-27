package Pdf1;

import javax.swing.JOptionPane;
//import funcions.java;

public class MenuExercicis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[] opciones = { "exercici1", "exercici2", "exercici3", "división", "eixir"};
		 String[] opciones1 = { "torna a fer lexercici", "tornar", "eixir" };
		int opp = 0;
		int ops = 0;
		float aux = 0.0f;
		float num1 = 0.0f;
		float num2 = 0.0f;
		float num3 = 0.0f;

		do {
			opp = funcions.menup(opciones,"Quin exercici vols fer?", "Menu");

			if ((opp == 4) || (opp == -1)) {
				JOptionPane.showMessageDialog(null, "Has eixit de laplicació", "Exit", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}

			// ------------------------------- Exercici 1
			switch (opp) {
			case 0:

				do {
					num1 = funcions.askfloat("Introdueix un numero", "Introduccio de dades");
					num2 = funcions.askfloat("Introdueix un numero", "Introduccio de dades");
					num3 = funcions.askfloat("Introdueix un numero", "Introduccio de dades");

					JOptionPane.showMessageDialog(null, "El resultat és: " + ((num1 + num2 + num3) / 3), "Resultat",
							JOptionPane.INFORMATION_MESSAGE);

					ops = funcions.menus(opciones1, "Tria una de les opcions", "Menu");
				} while (ops == 0);
				break;
			// -------------------------------Exercici 2
			case 1:
				do {
					num1 = funcions.askint("Introdueix un numero", "Introduccio de dades");
					num2 = funcions.askint("Introdueix un numero", "Introduccio de dades");

					if (num1 > num2)
						JOptionPane.showMessageDialog(null, num1 + " és major que " + num2, "resultat",
								JOptionPane.INFORMATION_MESSAGE);

					if (num1 < num2)
						JOptionPane.showMessageDialog(null, num1 + " és menor que " + num2, " resultat ",
								JOptionPane.INFORMATION_MESSAGE);

					else {
						JOptionPane.showMessageDialog(null, num1 + " és igual que " + num2, "resultat",
								JOptionPane.INFORMATION_MESSAGE);
					}

					ops = funcions.menus(opciones1, "Tria una de les opcions", "Menu");

				} while (ops == 0);
				break;
			// ---------------------------------Exercici 3
			case 2:
				do {
					num1 = funcions.askfloat("Introdueix un numero", "Introduccio de dades");
					num2 = funcions.askfloat("Introdueix un numero", "Introduccio de dades");

					aux = num1;
					num1 = num2;
					num2 = aux;
					JOptionPane.showMessageDialog(null, num1 + " , " + num2, "Resultat",
							JOptionPane.INFORMATION_MESSAGE);

					ops = funcions.menus(opciones1, "Tria una de les opcions", "Menu");

				} while (ops == 0);
				break;
			// ----------------------------------Exercici 4
			case 3:
				do {
					ops = funcions.menus(opciones1, "Tria una de les opcions", "Menu");

				} while (ops == 0);
				break;

			}// end switch

		} while ((opp != 4) || (ops != 2));

		System.exit(0);

	}
}
