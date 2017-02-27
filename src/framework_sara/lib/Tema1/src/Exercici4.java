import javax.swing.JOptionPane;

public class Exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		String s="";
		boolean correcte=true;
		String cadena="";
		
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Introdueix un número", "Introducció de dades",JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Eixir", JOptionPane.INFORMATION_MESSAGE);
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
		
		for(int i=1;i<=10;i++){ 
			cadena=cadena+((num+" * "+i+" = "+(num*i))+"\n");	
		}//end for
		
		JOptionPane.showMessageDialog(null, "El resultat de la multiplicació és \n"+(cadena), "Resultat", JOptionPane.INFORMATION_MESSAGE);
	

	}

}
