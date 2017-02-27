import javax.swing.JOptionPane;

public class Pdf5Exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";
		int num = 0;
		boolean correcte = true;
		int interruptor = 1;
		String cad = "";

		while (interruptor == 1) {
			do {
				try {
					s = JOptionPane.showInputDialog(null, "Introdueix un numero", "Introduccio de dades",
							JOptionPane.QUESTION_MESSAGE);
					if (null == s) {
						JOptionPane.showMessageDialog(null, "Has eixit de laplicacio", "Exit",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						num = Integer.parseInt(s);
						correcte = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error",
							JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			} while (correcte == false);
		


			if (num != 0) {

				for (int i = 1; i < num; i++) {
					if ((num % i) == 0) {
						cad = cad + (i + " és divisor de " + num + "\n");
					} // end if
				} // end for

			}else{
				interruptor=0;
			}
		} // end while

		JOptionPane.showMessageDialog(null, cad, "Resultat", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}

}
