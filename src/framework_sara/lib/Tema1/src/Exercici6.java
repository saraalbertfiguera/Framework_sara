import javax.swing.JOptionPane;

public class Exercici6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int suma=0;
		String s="";
		boolean correcte=true;
		do{
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Introdueix un número", "Introducció de dades", JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Eixint", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else{
						num=Integer.parseInt(s);
						correcte=true;
						suma=suma+num;
						
					}	
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
					correcte=false;
				}
			}while(correcte==false);//end do-while intern
			
		}while(num!=0);
		JOptionPane.showMessageDialog(null, "El resultat de la suma és: "+suma, "Resultat", JOptionPane.INFORMATION_MESSAGE);
	}

}
