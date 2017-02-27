package miniexamen;

import javax.swing.JOptionPane;

public class funcions {

	// ********************************************************************************************************************************************************************  INT
	public static int askint(String message, String title) {
		int num = 0;
		boolean correcte = true;
		String s = "";
		

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "You dont' entered any number", "Exit", JOptionPane.ERROR_MESSAGE);
					correcte=false;
				}else{
				num = Integer.parseInt(s);
				correcte = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't entered data correctly", "Error",
						JOptionPane.ERROR_MESSAGE);
				correcte=false;
			}
		} while (correcte == false);
		return num;

	}

	// *******************************************************************************************************************************************************  INT DISTINT DE 0
	

	public static int askintno0(String message, String title) {
		int num = 0;
		boolean correcte = true;
		String s = "";

		do {
			num = askint("Introdueix un numero distint de 0", "Introduccio de dades");
			if (num != 0)
				correcte = true;
			else
				JOptionPane.showMessageDialog(null, "Error, no es pot dividir un numero entre 0", "Error",
						JOptionPane.ERROR_MESSAGE);
				correcte=false;
		} while (correcte == false);

		return num;

	}
	


	// ******************************************************************************************************************************************************************  FLOAT

	public static float askfloat(String message, String title) {
		String s = "";
		float num = 0.0f;
		boolean correcte = true;

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "You dont' entered any number", "Exit", JOptionPane.ERROR_MESSAGE);
					correcte=false;
				}else{
					num = Float.parseFloat(s);
					correcte = true;
				}
				

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't entered data correctly", "Error",
						JOptionPane.ERROR_MESSAGE);
				correcte=false;
			}
		} while (correcte == false);
		return num;

	}

	// *****************************************************************************************************************************************************  FLOAT DISTINT DE 0


	public static float askfloatno0(String message, String title) {
		float num = 0.0f;
		boolean correcte = true;

		do {
			num = askfloat("Introdueix un numero distint de 0", "Introduccio de dades");
			if (num != 0)
				correcte = true;
			else
				JOptionPane.showMessageDialog(null, "Error,no es pot dividir un numero entre 0", "Error",
						JOptionPane.ERROR_MESSAGE);
		} while (correcte == false);

		return num;
	}

	// *******************************************************************************************************************************************************************  CHAR

	public static char askchar(String message, String title) {
		char c = ' ';
		String s = "";
		boolean correcte = true;

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				c = s.charAt(0);
				correcte = true;

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introducido una letra", "Error", JOptionPane.ERROR_MESSAGE);
				correcte = false;
			}
		} while (correcte == false);

		return c;
	}

	// *****************************************************************************************************************************************************************  STRING

	public static String askstring(String message, String title) {
		String s = "";
		boolean correct = false;

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				correct = true;
				if (s.equals("")) {
					JOptionPane.showMessageDialog(null, "Error de introduccio de dades", "Error",
							JOptionPane.ERROR_MESSAGE);
					correct = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introducido una cadena", "Error",
						JOptionPane.ERROR_MESSAGE);
				correct = false;
			}
		} while (correct == false);

		return s;

	}
	
	// *********************************************************************************************************************************************************  DESEA CONTINUAR
	
	public static int askcontinuar(String message, String title) {
		int continuar=0;
	
	//do{
	continuar= JOptionPane.showConfirmDialog(null, "Vols continuar?");
	
		/*}while(continuar==JOptionPane.YES_OPTION);	
			        JOptionPane.showMessageDialog(null, "Gràcies per utilitzar aquesta aplicació", "Informació", JOptionPane.INFORMATION_MESSAGE);
			        System.exit(0);
	*/
	return continuar;
	}

	// *********************************************************************************************************************************************************  MENU EXERCICIS

	public static int menu(String[] opciones, String message, String title) {

		int op = JOptionPane.showOptionDialog(null, message, title, 0, JOptionPane.QUESTION_MESSAGE,
				null, opciones, opciones[0]);
		return op;

	}


}
