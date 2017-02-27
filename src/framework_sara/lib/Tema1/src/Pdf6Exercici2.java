import javax.swing.JOptionPane;

public class Pdf6Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";
		boolean correcte = true;
		int num = 0;
		int interruptor = 0;
		int cont = 0;
		int suma = 0;
		int major = 0;
		int menor = 0;

		while (interruptor == 0) {

			do {
				try {
					s = JOptionPane.showInputDialog(null, "Introduce a number", "Input",
							JOptionPane.QUESTION_MESSAGE);
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

			if ((num >= 10) && (num <= 120)) {
				cont++;
				suma = suma + num;

				if (num > major) {
					major = num;
				}
				if (num < menor) {//A quant inicialitze menor per a que no m'agafe el valor amb la que la inicialitze?
					menor = num;
				}
			}
			if(num==-5){
				interruptor=1;
			}

		} // end while
		JOptionPane.showMessageDialog(
				null, "Has introduit " + cont + " numeros entre 10 i 120\nLa seua suma es " + suma
						+ "\nEl numero major es " + major + "\nEl numero menor es " + menor,
				"Result", JOptionPane.INFORMATION_MESSAGE);

	}

}
