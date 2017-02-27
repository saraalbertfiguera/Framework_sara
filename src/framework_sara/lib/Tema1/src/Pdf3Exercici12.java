import javax.swing.JOptionPane;

public class Pdf3Exercici12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0;
		int num2=0;
		String s="";
		boolean correcte=true;
		int continuar=0;
		
	do{	
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Introdueix un numero", "Introduccio de dades", JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				
				}else{
					num1=Integer.parseInt(s);
				}
			}catch(Exception e){
				
			JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
			}
		}while(correcte==false);
		//------------------------------------Introducció segon número--------------------------------------------------------
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Introdueix un numero", "Introduccio de dades", JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				
				}else{
					num2=Integer.parseInt(s);
				}
			}catch(Exception e){
				
			JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
			}//end catch
		}while(correcte==false);
		JOptionPane.showMessageDialog(null, "El resultat de la suma es:\n" +(num1+num2), "Resultat", JOptionPane.INFORMATION_MESSAGE);
		
		//---------------------------------------------------Vols continuar?--------------------------------------------------------
		continuar= JOptionPane.showConfirmDialog(null, "Vols continuar?");
		
	}while(continuar==JOptionPane.YES_OPTION);	
		JOptionPane.showMessageDialog(null, "Gràcies per utilitzar aquesta aplicació", "Informació", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		

	}

}
