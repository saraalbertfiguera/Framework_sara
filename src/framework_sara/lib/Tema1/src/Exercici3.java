import javax.swing.JOptionPane;

public class Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0,num2=0,aux=0;
		String s="";
		boolean correcte=true;
		do{
			try{
				s=JOptionPane.showInputDialog(null,"Introdueix el primer número","Introducció de dades",JOptionPane.QUESTION_MESSAGE);
				if (s==null){
					JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Eixir", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else{
					num1=Integer.parseInt(s);
					correcte=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"No has introduit les dades correctament","Error",JOptionPane.ERROR_MESSAGE);
				correcte=false;
			}//end catch
			
			try{
				s=JOptionPane.showInputDialog(null, "Introdueix el segon número", "Introducció de dades", JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Eixir", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else{
					num2=Integer.parseInt(s);
					correcte=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error", JOptionPane.INFORMATION_MESSAGE);
				correcte=false;
			}//end catch

		}while(correcte==false);
		
		aux=num1;
		num1=num2;
		num2=aux;
		JOptionPane.showMessageDialog(null, num1 + "," + num2 , "Resultat", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}

}
