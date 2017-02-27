package sara_albert;

import javax.swing.JOptionPane;

import Pdf5.funcions;

public class exercicis_examen {

	// *****************************************************exercici 1

	public static String exer1() {
		String cad = "";

		String[] opcions = { "Divisors", "Digits", "Eixir" };
		String[] opcionssec = { "Divisors", "Tornar", "Eixir" };
		int op = 0;
		int ops = 0;
		int num = 0;
		int resto = 0;
		String cad1 = "";
		// String resultat="Els digits son: \n";

		// op = JOptionPane.showOptionDialog(null, "Tria una opcio", "Menu", 0,
		// JOptionPane.QUESTION_MESSAGE, null,
		// opcions, opcionssec[0]);

		 if (op != 2) {
			op = funcions.menu(opcions, "Tria una opcio", "Menu");
		 }

			// return op;

			 if ((op == 2) || (op == -1)) {
			 JOptionPane.showMessageDialog(null, "Gracies per utilitzar aquesta aplicacio", "Eixir",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			 } // per a tancar o eixir del primer menu

			if (op == 0) {// si fem click al primr boto...
				num = funcions.askint("Introdueix un numero", "Introduccio de dades");

				for (int i = 1; i < num; i++) {
					if ((num % i) == 0) {
						cad = cad + (i + " és divisor de " + num + "\n");

						cad1 = cad1 + (i + "\n");
						cad = ("Els divisors son: \n" + cad1);
					} // end if
				} // end for

			} // end if del primer boto divisors

			if (op == 1) {// si fem click al segon boto...

				num = funcions.askint("Introdueix un numero", "Introduccio de dades");
				while (num > 0) {
					resto = num % 10;
					num = num / 10;
					cad1 = cad1 + (resto + "\n");
					cad = ("Els digits son: \n" + cad1);

				} // end while

			} // end del segon boto digits

		
		return cad;
		//do {
		//	op = funcions.menu(opcions, "Tria una opcio", "Menu");
		//} while (ops != 2);
		// ------------------------------------------------------
		/*
		 * if (op == 2) { // entrem en el menu secundari de l'exercici op =
		 * funcions.menu(opcionssec, "Choose an option", "Menu");
		 * 
		 * if (ops == 0) { num = funcions.askint("Introdueix un numero",
		 * "Introduccio de dades");
		 * 
		 * for (int i = 1; i < num; i++) { if ((num % i) == 0) { cad = cad + (i
		 * + " és divisor de " + num + "\n");
		 * 
		 * cad1 = cad1 + (i + "\n"); cad = ("Els divisors son: \n" + cad1); } //
		 * end if } // end for } // end if
		 * 
		 * if (ops == 1) {
		 * 
		 * 
		 * } // end if segon boto del menu secundari
		 * 
		 * } // end if//fi del segon menu
		 */

		// ops = funcions.menu(opcionssec, "Choose an option", "Menu");
		// ops = JOptionPane.showOptionDialog(null, "Tria una opcio", "Menu", 0,
		// JOptionPane.QUESTION_MESSAGE, null,
		// opcions, opcionssec[0]);

		
	}// end exer

	// *****************************************************exercici 2

	public static String exer2() {
		String cad = "";
		int num = 0;
		int interruptor = 0;
		int major = 0;
		int menor = 0;
		String cad1 = "";
		int divisors = 0;

		while (interruptor == 0) {
			num = funcions.askint("Introdueix un numero\nPrem -1 per a veure el resultat", "Introduccio de dades");
			if (num != -1) {

				for (int i = 1; i < num; i++) {
					if (((num % i) == 0)&&((i%2)==0)) {
						
						cad1 = cad1 + (i + "\n");
						cad = ("Els divisors parells de"+num+" son: \n" + cad1);

						
					} // end if
				} // end for

			} else {
				interruptor = -1;
			} // end else
		} // end while
		
		return cad;
	}// end exer

}// end exercicis
