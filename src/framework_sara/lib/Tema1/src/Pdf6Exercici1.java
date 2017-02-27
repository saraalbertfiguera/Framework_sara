import javax.swing.JOptionPane;

public class Pdf6Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		boolean correcte = true;
		String s = "";
		int suma = 0;
		String cad = "";
		int i = 1;
		int j = 1;

		do {
			try {
				s = JOptionPane.showInputDialog(null, "How many numbers do you want to enter?", "Input",
						JOptionPane.QUESTION_MESSAGE);
				if (null == s) {
					JOptionPane.showMessageDialog(null, "You have exit of the application", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					n = Integer.parseInt(s);
					correcte = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't entered data correctly", "Error",
						JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		} while (correcte == false);

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

			JOptionPane.showMessageDialog(null, cad+"\nLa suma dels divisors d'aquests numeros es menor que 20", "Result", JOptionPane.INFORMATION_MESSAGE);

		}
	}

}
