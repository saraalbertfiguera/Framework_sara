import javax.swing.JOptionPane;

public class Pdf3Exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char lletra=' ';
		int cont_a=0;
		int cont_e=0;
		int cont_i=0;
		int cont_o=0;
		int cont_u=0;
		int n=0;
		int continuar=0;
		boolean correcte=true;
		String s="";
		
		do{
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Quants caracters vas a introduir?", "Introducció de dades", JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Eixir", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else{
						n=Integer.parseInt(s);
						correcte=true;
					}
					
				for(int i=0;i<n;i++){
					s=JOptionPane.showInputDialog(null, "Introdueix un caracter", "Introducció de dades", JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Eixir", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					//}else if(s!=char){
					//	JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Eixir", JOptionPane.INFORMATION_MESSAGE);
					}else{	
					lletra=s.charAt(0);
					correcte=true;
					}
						
					}//end for
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
					correcte=false;
				}
			}while(correcte==false);
			JOptionPane.showMessageDialog(null, "Lletra a introduïda "+cont_a+ " vegades\nLletra e introduïda "+cont_e+ " vegades\n"
					+ "Lletra i introduïda "+cont_i+ " vegades\nLletra o introduïda "+cont_o+ " vegades\n"
							+"Lletra u introduïda "+cont_u+ " vegades\n ", "Resultat", JOptionPane.INFORMATION_MESSAGE);
			
			 continuar= JOptionPane.showConfirmDialog(null, "Vols continuar?");
		}while(continuar==JOptionPane.YES_OPTION);	
		
			        JOptionPane.showMessageDialog(null, "Gràcies per utilitzar aquesta aplicació", "Informació", JOptionPane.INFORMATION_MESSAGE);
			        System.exit(0);
	   }
	

	

  }


