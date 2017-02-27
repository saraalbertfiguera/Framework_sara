package miniexamen;

import javax.swing.JOptionPane;

import miniexamen.funcions;

public class menu_exercicis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] opcions = { "exercici1", "exercici2", "exercici3", "exercici4", "exercici5", "exercici6", "exercici7", "Exit"};
		String[] opcionssec = { "Do the exercise again", "Back to main menu", "exit" };
		int op = 0;
		int ops = 0;

		do {
			op = funcions.menu(opcions, "What exercise do you want to do?", "Menu");

			if ((op == 7) || (op == -1)) {
				JOptionPane.showMessageDialog(null, "Thanks for use this application", "Exit", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}

			switch (op) {
			case 0:
				do {
					String resultat = "";
					resultat = exercicis.exer1();
					JOptionPane.showMessageDialog(null, resultat);

					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;

			case 1:
				do {
					String resultat1 = "";
					resultat1 = exercicis.exer2();
					JOptionPane.showMessageDialog(null, resultat1);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;

			case 2:
				do {
					String resultat2 = "";
					resultat2 = exercicis.exer3();
					JOptionPane.showMessageDialog(null, resultat2);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;

			case 3:
				do {
					String resultat3 = "";
					resultat3 = exercicis.exer4();
					JOptionPane.showMessageDialog(null, resultat3);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;

			case 4:
				do {
					String resultat4 = "";
					resultat4 = exercicis.exer5();
					JOptionPane.showMessageDialog(null, resultat4);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;

			case 5:
				do {
					String resultat5 = "";
					resultat5 = exercicis.exer6();
					JOptionPane.showMessageDialog(null, resultat5);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;

			case 6:
				do {
					String resultat6 = "";
					resultat6 = exercicis.exer7();
					JOptionPane.showMessageDialog(null, resultat6);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;

			}// end switch
		} while ((op != 7) || (ops != 2));

	}//

}//
