package Pdf4;

import javax.swing.JOptionPane;

public class exercicis {

	// *******************************exercici 1

	public static String exer1() {
		String cad = "";
		int num = 0;
		int i = 1;

		num = funcions.askint("Introdueix un numero", "Introduccio de dades");
		for (i = 1; i < num; i++) {
			if ((num % i) == 0) {
				cad = cad + (i + " és divisor de " + num + "\n");
			}
		}

		return cad;
	}// end exer

	// ********************************exercici 2

	public static String exer2() {
		String cad = "";
		int num=1;
		int resto=1;
		int suma=0;
		
		num=funcions.askint("Introdueix un numero", "Introduccio de dades");
		
		while (num > 0) {
			resto = num % 10;
			num = num / 10;
	
			if ((resto % 2) == 0) {
			suma = suma + resto;
			
			}//end if
			
		} // end while
		cad=cad+("La suma es "+suma);
	
		return cad;
	}// end exer

}//
