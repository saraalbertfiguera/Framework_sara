import javax.swing.JOptionPane;

public class Pdf5Exercici8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";
		int num = 0;
		boolean correcte = true;
		String cad = "";

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

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				cad = cad + (j + " ");
			}//end for
			cad=cad+"\n";
		}//end for
		
		JOptionPane.showMessageDialog(null, cad,"Resultat", JOptionPane.INFORMATION_MESSAGE);

	}

}
