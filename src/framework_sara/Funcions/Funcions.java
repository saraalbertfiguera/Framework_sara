package framework_sara.Funcions;

import framework_sara.main_exer3;
import framework_sara.classes.Llenguatge.Llenguatge;

import javax.swing.JOptionPane;

public class Funcions {
	public static Llenguatge idioma = null;

	// ********************************************************************************************************************************************************************
	// INT
	public static int askint(String message, String title) {
		int num = 0;
		boolean correcte = true;
		String s = "";

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("no_intro"),
							Llenguatge.getInstance().getProperty("eixir"), JOptionPane.ERROR_MESSAGE);
					correcte = false;
				} else {
					num = Integer.parseInt(s);
					correcte = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("mala_introduccio"), "Error",
						JOptionPane.ERROR_MESSAGE);
				correcte = false;
			}
		} while (correcte == false);
		return num;

	}

	// *******************************************************************************************************************************************************
	// INT DISTINT DE 0

	public static int askintno0(String message, String title) {
		int num = 0;
		boolean correcte = true;
		String s = "";

		do {
			num = askint(idioma.getProperty("intro_no0"), Llenguatge.getInstance().getProperty("intro_dades"));
			if (num != 0)
				correcte = true;
			else
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error1"), "Error",
						JOptionPane.ERROR_MESSAGE);
			correcte = false;
		} while (correcte == false);

		return num;

	}

	// ******************************************************************************************************************************************************************
	// FLOAT

	public static float askfloat(String message, String title) {
		String s = "";
		float num = 0.0f;
		boolean correcte = true;

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("no_intro"),
							Llenguatge.getInstance().getProperty("eixir"), JOptionPane.ERROR_MESSAGE);
					correcte = false;
				} else {
					num = Float.parseFloat(s);
					correcte = true;
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("mala_introduccio"), "Error",
						JOptionPane.ERROR_MESSAGE);
				correcte = false;
			}
		} while (correcte == false);
		return num;

	}

	// *****************************************************************************************************************************************************
	// FLOAT DISTINT DE 0

	public static float askfloatno0(String message, String title) {
		float num = 0.0f;
		boolean correcte = true;

		do {
			num = askfloat(Llenguatge.getInstance().getProperty("intro_no0"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			if (num != 0)
				correcte = true;
			else
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error1"), "Error",
						JOptionPane.ERROR_MESSAGE);
		} while (correcte == false);

		return num;
	}

	// *******************************************************************************************************************************************************************
	// CHAR

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
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error2"), "Error",
						JOptionPane.ERROR_MESSAGE);
				correcte = false;
			}
		} while (correcte == false);

		return c;
	}

	// *****************************************************************************************************************************************************************
	// STRING

	public static String askstring(String message, String title) {
		String s = "";
		boolean correct = false;

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				correct = true;
				if (s.equals("")) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("mala_introduccio"),
							"Error", JOptionPane.ERROR_MESSAGE);
					correct = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("mala_introduccio"), "Error",
						JOptionPane.ERROR_MESSAGE);
				correct = false;
			}
		} while (correct == false);

		return s;

	}

	// *********************************************************************************************************************************************************
	// DESEA CONTINUAR

	public static int askcontinuar(String message, String title) {
		int continuar = 0;

		// do{
		continuar = JOptionPane.showConfirmDialog(null, Llenguatge.getInstance().getProperty("continuar"));

		/*
		 * }while(continuar==JOptionPane.YES_OPTION);
		 * JOptionPane.showMessageDialog(null,
		 * "Gr�cies per utilitzar aquesta aplicaci�", "Informaci�",
		 * JOptionPane.INFORMATION_MESSAGE); System.exit(0);
		 */
		return continuar;
	}

	// *********************************************************************************************************************************************************
	// MENU EXERCICIS

	public static int menu(String[] opciones, String message, String title) {

		int op = JOptionPane.showOptionDialog(null, message, title, 0, JOptionPane.QUESTION_MESSAGE, null, opciones,
				opciones[0]);
		return op;

	}

	// *********************************************************************************************************************************************************
	// MENU COMBOBOX

	public static String menubox1(String[] opcions, String message, String title) {
		String op;

		op = (String) JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, opcions,
				opcions[0]);
		return op;
	}
	
	
	public static String menubox(String[] opcions,String message,String title){
		String op;
		boolean correcto=false;
		do{
			op=(String)JOptionPane.showInputDialog(null,message,title,JOptionPane.QUESTION_MESSAGE,null,opcions,opcions[0]);
			
			if(op==null){
				JOptionPane.showMessageDialog(null, "error");
				correcto=false;
			}else{
				correcto=true;
			}
			
		}while (correcto==false);
		return op;
		
	}
	
	

}
