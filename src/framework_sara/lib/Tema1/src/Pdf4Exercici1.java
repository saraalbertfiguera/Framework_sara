import javax.swing.JOptionPane;

public class Pdf4Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		String s="";
		String cad="";
		boolean correcte=true;
		int i=1;
		
		
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Introdueix un numero", "Introduccio de dades", JOptionPane.QUESTION_MESSAGE);
				if(null==s){
					JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else{
					num=Integer.parseInt(s);
					correcte=true;
				}//end else
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		}while(correcte==false);
		
		for( i=1;i<num;i++){
			if((num%i)==0){	
				cad=cad+( i+ " és divisor de "+num+"\n");	//La cadena es tot lo de dins del parèntesi
			}//end if
		}//end for
		//------------------------------------------------------------------------------------------------------------------
	
		JOptionPane.showMessageDialog(null, cad, "Resultat", JOptionPane.INFORMATION_MESSAGE);	

		
		
		
		
	}

}
