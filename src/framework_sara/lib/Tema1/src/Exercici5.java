import javax.swing.JOptionPane;

public class Exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int suma=0;
		String s="";
		boolean correcte=true;
		
		for (int i = 1; i <= 5; i++) {
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Introdueix un número", "Introducció de dades", JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Eixint", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else{
						num=Integer.parseInt(s);
						correcte=true;	
					}	
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
					correcte=false;	
				}//end try-catch
				
			}while(correcte==false);
			suma=suma+num;	
		}//end for
										
		
		

	}

}
