import javax.swing.JOptionPane;

public class PdfExercici10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int cont_positiu=0;
		int cont_negatiu=0;
		String s="";
		int continuar=0;
		
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Introdueix un n�mero", "Introducci� de dades", JOptionPane.QUESTION_MESSAGE);
				continuar= JOptionPane.showConfirmDialog(null, "Vols continuar?");
				if(s==null){
					JOptionPane.showMessageDialog(null, "Has eixit de l'aplicaci�", "Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else{
					num=Integer.parseInt(s);
					if(num<0){
						cont_negatiu++;
					}else{
						cont_positiu++;
					}//end else	
				}//end else
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		}while(continuar==JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "S'han introdu�t:\n " +cont_positiu+ " n�meros positius i\n " +cont_negatiu+ " n�meros negatius", "Resultat", JOptionPane.INFORMATION_MESSAGE);
		
		

	}

}
