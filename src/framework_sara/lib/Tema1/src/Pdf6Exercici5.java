import javax.swing.JOptionPane;

public class Pdf6Exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		String s = "";
		boolean correcte = true;
		int continuar = 0;
		String cad = "";

		do {
			do {
				try {
					s = JOptionPane.showInputDialog(null, "Introduce a number", "Input", JOptionPane.QUESTION_MESSAGE);
					if (null == s) {
						JOptionPane.showMessageDialog(null, "You have exit of the application", "Exit",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						num = Integer.parseInt(s);
						correcte = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "You haven't entered data correctly", "Error",
							JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			} while (correcte == false);

			if (((num % 6) == 0) || ((num % 8) == 0) || ((num % 9) == 0)) {
				cad = cad + (num + " es un numero redó\n");
			}else{
				cad=cad+(num+" no es un numero redó\n");
			}
			JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
			

			continuar = JOptionPane.showConfirmDialog(null, "Do you want continue?");
		} while (continuar == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "Thanks for use this application", "Informació",
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}

}
