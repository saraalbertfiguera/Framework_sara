import javax.swing.JOptionPane;

public class Pdf4Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resto = 0;
		int suma = 0;
		int num = 0;
		boolean correcte = true;
		String s = "";

		do {
			try {
				s = JOptionPane.showInputDialog(null, "Introdueix un número", "Introducció de dades",
						JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, "Eixint de l'aplicació", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					num = Integer.parseInt(s);
					correcte = true;
				} // end else
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introduït les dades correctament", "Error",
						JOptionPane.ERROR_MESSAGE);
			} // end catch
		} while (correcte == false);

		while (num > 0) {
			resto = num % 10;
			num = num / 10;
			if ((resto % 2) == 0)
				;
			suma = suma + resto;

		} // end while
		JOptionPane.showMessageDialog(null, "The result's operation is " + suma, "Result",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
