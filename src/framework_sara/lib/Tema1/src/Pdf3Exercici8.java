import javax.swing.JOptionPane;

public class Pdf3Exercici8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int suma=0;
		int continuar=0;
		String s="";
		
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Introdueix un número", "INtroducció de dades", JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else{
					num=Integer.parseInt(s);
					suma=suma+num;
					continuar= JOptionPane.showConfirmDialog(null, "Vols continuar?");
					
				}//end else
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introduït les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
				continuar=1;
			}
		}while(continuar==JOptionPane.YES_OPTION);	
		   JOptionPane.showMessageDialog(null, "El resultat de la suma és: "+suma, "Resultat", JOptionPane.INFORMATION_MESSAGE);
	       JOptionPane.showMessageDialog(null, "Gràcies per utilitzar aquesta aplicació", "Informació", JOptionPane.INFORMATION_MESSAGE);
	       System.exit(0);
		   
		
		
		

		
		
		
		
		
		
	}

}
