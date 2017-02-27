package Pdf5;

import javax.swing.JOptionPane;

public class exercicis {

	// *****************************************************exercici 1

	public static String exer1() {
		String cad = "";
		String cad2 = "";
		int n = 0;
		int num = 0;
		int suma = 0;
		int producte = 1;
		int cont_pos_parell = 0;
		int cont_neg_imp = 0;

		n = funcions.askint("Quants numeros vols introduir?", "Introduccio de dades");
		for (int i = 0; i < n; i++) {
			num = funcions.askint("Introdueix un numero", "Introduccio de dades");

			suma = (suma + num);
			producte = (producte * suma);

			if ((num > 0) && ((num % 2) == 0)) {
				cont_pos_parell++;
			}
			if (((num % 2) != 0) && (num < 0)) {
				cont_neg_imp++;
			}
			cad2 = cad2 + ("El quadrat de " + num + " es " + (num * num) + "\n");
			cad = cad2 + ("La suma total es " + suma + " i el producte total es " + producte + "\nHi han "
					+ cont_pos_parell + " numeros positius i parells\nHi han " + cont_neg_imp
					+ " numeros negatius i imparells");

		} // end for

		return cad;
	}// end exer

	// *****************************************************exercici 2

	public static String exer2() {
		String cad = "";
		// int i=1;
		// int j=1;

		for (int i = 1; i <= 10; i++) {
			cad = "";// netegem cadena
			for (int j = 1; j <= 10; j++) {
				cad = cad + (i + " * " + j + " = " + (i * j) + "\n");

			}

		} // end for

		return cad;
	}// end exer

	// *****************************************************exercici 3

	public static String exer3() {
		String cad = "";
		int n = 0;
		int num = 0;
		String cad1 = "";
		String cad2 = "";
		String cad3 = "";
		int cont = 0;
		int suma = 0;

		n = funcions.askint("Quants numeros vols introduir?", "Introduccio de dades");
		for (int i = 0; i < n; i++) {
			num = funcions.askint("Introdueix un numero", "Introduccio de dades");
			if (((num % 2) == 0) && ((num % 3) == 0)) {
				cad1 = cad1 + (num + " es multiple de 2 i de 3\n");
			} // end if
			if ((num >= 35) && (num <= 75)) {
				cad2 = cad2 + (num + " esta compres entre 35 i 75\n");
				cont++;
				suma = suma + num;

			} // end if
		} // end for
		cad3 = cad3 + ("Hi han " + cont + " numeros entre 35 i 75 i la seua suma es " + suma + "\n");
		cad = cad1 + cad2 + cad3;

		return cad;
	}// end exer

	// *****************************************************exercici 4

	public static String exer4() {
		String cad = "";
		boolean correcte = true;
		int num = 0;
		int interruptor = 0;
		int major = 0;
		int menor = 0;

		while (interruptor == 0) {
			num = funcions.askint("Introdueix un numero\nPrem -1 per a veure el resultat", "Introduccio de dades");
			if (num != -1) {
				if ((menor == 0) && (major == 0)) {
					menor = num;
					major = num;
				} else {
					if (num < menor) {
						menor = num;
					} else if (num > major) {
						major = num;
					} // end if

				} // end else
			} else {
				interruptor = 1;
			} // end else
		} // end while
		cad = cad + ("El numero mes menut es: " + menor + "\nEl numero mes gran es: " + major);
		return cad;
	}// end exer

	// *****************************************************exercici 5

	public static String exer5() {
		String cad = "";
		int num = 0;
		boolean correcte = true;
		int interruptor = 1;
		String cad1 = "";
		String cad2 = "";

		while (interruptor == 1) {
			num = funcions.askint("Introdueix un numero\nPrem 0 per a verure el resultat", "Introduccio de dades");

			if (num != 0) {

				for (int i = 1; i <= num; i++) {
					if ((num % i) == 0) {

						cad = cad + (i + " es divisor de " + num + "\n");
					} // end if
				} // end for

			} else {
				interruptor = 0;
			}
		} // end while

		return cad;
	}// end exer

	// *****************************************************exercici 6

	public static String exer6() {
		String cad = "";
		int cont = 0;
		int num = 0;
		int suma = 0;
		String cad1 = "";

		while (cont < 5) {
			num = funcions.askint("Introdueix un numero", "Introduccio de dades");

			if (((num % 7) == 0) || ((num % 11) == 0)) {
				cont++;
				cad1 = cad1 + (num + " es multiple de 7 o de 11\n");
				suma = suma + num;
			} // end if

		} // end while
		cad = cad1 + (" \n La suma dels 5 numeros multiples de 7 o de 11 es " + suma);
		return cad;
	}// end exer

	// *****************************************************exercici 7

	public static String exer7() {
		String cad = "";
		int interruptor = 1;
		int numprev = 0;
		int suma = 0;
		int cont = 0;
		int num = 0;

		numprev = funcions.askint("Introdueix un numero de referencia previ", "Introduccio de dades");
		
		while (interruptor == 1) {
			num = funcions.askint("Introdueix un numero\nPrem 0 per a veure el resultat", "Introduccio de dades");

			if (num == 0) {
				interruptor = 0;
			} else {
				if (num > numprev) {
					cont++;
				} else {
					suma = suma + num;
				}
			} // end else

		} // end while
		cad = cad + ("Shan introduit " + cont + " numeros majors que " + numprev + "\nLa suma dels numeros menor que "
				+ numprev + " es " + suma);
		return cad;
	}// end exer

	// *****************************************************exercici 8

	public static String exer8() {
		String cad = "";
		int num=0;
		
		num=funcions.askint("Introdueix un numero", "Introduccio de dades");

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				cad = cad + (j + " ");
			}//end for
			cad=cad+"\n";
		}//end for
		
		
		return cad;
	}// end exer

}// end exercicis
