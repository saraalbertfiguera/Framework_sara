
package miniexamen;

import javax.swing.JOptionPane;

import miniexamen.funcions;

public class exercicis {

	// ***********************************************************************************************************************************************************************

	public static String exer1() {

		boolean interruptor = true;
		int num = 0;
		int cont = 0;
		int suma = 0;
		int resto = 1;
		String cad = "";

		num = funcions.askint("Introdueix un numero", "Introduccio de dades");

		if (num < 0) {
			interruptor = false;
		} else {
			// cont = 0;
			// suma = 0;
			while (num > 0) {
				resto = num % 10;
				num = num / 10;
				if ((resto % 2) == 0) {
					cont++;
					suma = resto + suma;
				} // end if
				cad = ("Aquest numero te " + cont + " digits parells\nLa suma dels digits parells es " + suma);
			} // end while
		} // end else
		return cad;
	}// end function

	// **************************************************************************************************************************************************************

	public static String exer2() {
		boolean interruptor = false;
		int num = 0;
		int major = 0;
		String cad = "";
		int cont = 0;

		while (interruptor == false) {
			num = funcions.askint("Introdueix un numero\nPer a veure el resultat prem 0", "Introduccio de dades");
			if (num == 0) {
				interruptor = true;

			} else {
				if (num > major) {
					major = num;
					cont = 0;
				} // end if
				if (num == major) {
					cont++;
				} // end if
			} // end else
		} // end while
		cad = cad + ("El major es " + major + " i es repetix " + cont + " vegades\n");
		return cad;

	}// end funcio

	// ************************************************************************************************************************************************************************
	public static String exer3() {
		int num = 0;
		int N = 0;
		int K = 0;
		int cont = 0;
		int resto = 0;
		String cad = "";
		int continuar = 0;

		do {
			N = funcions.askint("Introdueix un numero N", "Introduccio de dades");
			K = funcions.askint("Introdueix un numero K", "Introduccio de dades");
			cont = 0;
			while (N > 0) {
				resto = N % 10;
				N = N / 10;
				cont++;
				if (cont == K) {
					cad = cad + ("El digit que ocupa la posició " + K + " es " + resto + "\n");
				}
			} // end while
			continuar = JOptionPane.showConfirmDialog(null, "Vols continuar?");
		} while (continuar == JOptionPane.OK_OPTION);

		return cad;
	}// end funcio

	// ***********************************************************************************************************************************************************************

	public static String exer4() {
		int n = 0;
		int suma = 0;
		String cad = "";

		n = funcions.askint("Quants numeros vols introduir?", "Introduccio de dades");
		for (int i = 1; i <= n; i++) {

			suma = 0;
			for (int j = 1; j < i; j++) {
				if ((i % j) == 0) {
					suma = suma + j;
				}

			} // end for
			if (suma == i) {
				cad = cad + (i + " es perfecte\n");
			} else {
				cad = cad + (i + " no es perfecte\n");
			} // end else
		} // end for
		return cad;

	}// end funcio

	// ************************************************************************************************************************************************************
	public static String exer5() {

		boolean interruptor = false;
		int num = 0;
		int suma = 0;
		int suma_par = 0;
		int producte_impar = 1;
		int cont = 0;
		int cont_par = 0;
		int contproducte_impar = 0;
		String cad = "";

		while (interruptor == false) {
			num = funcions.askint("Introdueix un numero\nPer a veure el resultat prem 0", "Introduccio de dades");
			if (num == 0) {
				interruptor = true;
			} else {
				cont++;
				if ((num % 2) == 0) {
					suma_par = suma_par + num;
				} else {
					producte_impar = producte_impar * num;
				}
			} // end else
		} // end while

		cad = cad + ("Has introduit " + cont + " numeros\nLa suma dels numeros parells es " + suma_par
				+ "\nEl producte dels numeros impars es " + producte_impar);
		return cad;
	}// end function

	// ******************************************************************************************************************************************************************

	public static String exer6() {

		int producte = 1;
		String cad = "";

		int n = funcions.askint("Introdueix un numero", "Introduccio de dades");
		for (int i = 1; i <= n; i++) {
			producte = 1;
			for (int j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					producte = producte * j;
				} // end if
			} // end for
		} // end for
		if (producte <= 10) {
			cad = cad + ("El producte dels divisors de " + n + " es " + producte + "\nPer tant,es menor que 10");
		} else {
			cad = cad + ("El producte dels divisors de " + n + " es " + producte + "\nPer tant, es major que 10");
		} // end else

		return cad;

	}// end funcio

	// ******************************************************************************************************************************************************************

	public static String exer7() {

		int producte = 1;
		String cad = "";
		int num = 0;
		int n = 0;
		String cad2="";

		n = funcions.askint("Quants numeros vols introduir?", "Introduccio de dades");
		for (int i = 0; i < n; i++) {

			num = funcions.askint("Introdueix un numero", "Introduccio de dades");
			if (((num % 2) == 0) && (num > 0)) {
				cad = cad + (num+" es parell i positiu\n");
			}
			if ((num % 3) == 0) {
				producte = producte * num;
				cad2=cad+("El producte dels multiples de 3 es "+producte);
			}

		} // end for
		
		return cad2;

	}// end funcio

	
}
