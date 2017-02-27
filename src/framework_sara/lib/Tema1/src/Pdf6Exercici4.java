import javax.swing.JOptionPane;

public class Pdf6Exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		String s = "";
		boolean correcte = true;
		int num = 1;
		int digit = 18;
		int prod = 1;
		String cad = "";

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

		for (int i = 1; i <= n; i++) {
			;

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
		
			while (num > 0) {
				digit = num % 10;
				num = num / 10;
				if (((digit % 2) == 0) || ((digit % 3) == 0)) {
					prod = prod * digit;
				}
			} // end while
			cad = cad + ("\nEl producte dels digits de " + num + " divisors de 2 o de 3 es " + prod);

		} // end for
		JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);

	}

}
