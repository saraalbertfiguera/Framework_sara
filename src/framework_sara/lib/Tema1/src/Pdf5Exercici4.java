import javax.swing.JOptionPane;

public class Pdf5Exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";
		boolean correcte = true;
		int num = 0;
		int interruptor = 0;
		int major = 0;
		int menor = 0;

		while (interruptor == 0) {

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
				}
			} while (correcte == false);

			if (num != -1) {
				if((menor==0)&&(major==0)){
					menor=num;
					major=num;
				}else{
					if(num<menor){
						menor=num;
					}else if(num>major){
						major=num;
					}
				
				
				}

			} else {
				interruptor = 1;
			}

		} // end while
		JOptionPane.showMessageDialog(null, "El numero mes menut es: " + menor + "\nEl numero mes gran es: " + major,
				"Resultat", JOptionPane.INFORMATION_MESSAGE);

	}

}
