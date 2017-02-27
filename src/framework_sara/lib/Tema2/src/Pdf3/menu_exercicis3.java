package Pdf3;

import javax.swing.JOptionPane;

import Pdf4.exercicis;


public class menu_exercicis3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] opcions = { "exercici1", "exercici2","exercici3", "exercici4", "exercici5", "exercici7", "Exit"};
		String[] opcionssec = { "Do the exercise again", "Back to main menu", "exit" };
		int op = 0;
		int ops = 0;

		do {
			op = funcions.menu(opcions, "What exercise do you want to do?", "Menu");

			if ((op == 6) || (op == -1)) {
				JOptionPane.showMessageDialog(null, "Thanks for use this application", "Exit", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}

			switch (op) {
			case 0:
				do {
					String resultat = "";
					resultat = exercicis3.exer1();
					JOptionPane.showMessageDialog(null, resultat);

					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;

			case 1:
				do {
					String resultat1 = "";
					resultat1 = exercicis3.exer2();
					JOptionPane.showMessageDialog(null, resultat1);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;
				
			case 2:
				do {
					String resultat1 = "";
					resultat1 = exercicis3.exer3();
					JOptionPane.showMessageDialog(null, resultat1);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;
				
			case 3:
				do {
					String resultat1 = "";
					resultat1 = exercicis3.exer4();
					JOptionPane.showMessageDialog(null, resultat1);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;
				
			case 4:
				do {
					String resultat1 = "";
					resultat1 = exercicis3.exer5();
					JOptionPane.showMessageDialog(null, resultat1);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;
				
			case 5:
				do {
					String resultat1 = "";
					resultat1 = exercicis3.exer7();
					JOptionPane.showMessageDialog(null, resultat1);
					ops = funcions.menu(opcionssec, "Choose an option", "Menu");
				} while (ops == 0);
				break;
		
				
			}// end switch
		} while ((op != 6) || (ops != 2));
	}

}
