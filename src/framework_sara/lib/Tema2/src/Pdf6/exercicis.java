package Pdf6;

import javax.swing.JOptionPane;

public class exercicis {

	
//**********************************************************exer1	
	public static String exer1() {
	
		int n = 0;
		int suma = 0;
		String cad = "";
		int i = 1;
		int j = 1;
		
	for (i = 1; i < n; i++) {
		suma = 0;
		for (j = 1; j < i; j++) {
			if ((i % j) == 0) {
				suma = suma + j;
			}
		} // end for
		if (suma >= 20) {
			cad = cad + ("The sum of the divisors of " + i + " is " + suma + "\n");

		} else {
			cad = cad + ("The sum of the divisors of " + i + " is " + suma + "\n");

		}
	} // end for
	if (suma >= 20) {
		JOptionPane.showMessageDialog(null, cad+"\nLa suma dels divisors d'aquests numeros es major que 20", "Result", JOptionPane.INFORMATION_MESSAGE);

	} else {
		cad = cad + ("The sum of the divisors of " + i + " is " + suma + "\n");
	}//end else
	
	return cad;
	}//end exer
	
	
	
	
}
