import javax.swing.JOptionPane;//


/**
 * Esto es una prova per a generar un arxiu javadoc
 * @author Sara
 * @version 1.0, 08/11/16
 */


public class Exercici2 {
	/**
	 *@param Primer comentari abans del main
	 *
	 */
	
	
	public static void main(String[] args) {
		
		int num1=0,num2=0;
		String s="";
		boolean correcte=true;	
		
		do{
			
			try{
				s=JOptionPane.showInputDialog(null,"Introdueix el primer n�mero","Introducci� de dades",JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null,"Has eixit de l'aplicaci�","Eixir",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);	
				}else{
					num1=Integer.parseInt(s);
					correcte=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"No has introduit cap n�mero","Error",JOptionPane.ERROR_MESSAGE);
				correcte=false;
				JOptionPane.showMessageDialog(null,"Has eixit de l'aplicaci�","Eixir",JOptionPane.INFORMATION_MESSAGE);//si no introdueixes
				System.exit(0);                                                                                        //b� les dades, se'n ix
			}//end try-catch
			
			try{
				s=JOptionPane.showInputDialog(null,"Introdueix el segon n�mero","Introducci� de dades",JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null,"Has eixit de l'aplicaci�","Eixir",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					/**
					 *@return Segon comentari dins del class
					 */	
				}else{
					num2=Integer.parseInt(s);
					correcte=true;	
				}	
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"No has introduit cap n�mero","Error",JOptionPane.ERROR_MESSAGE);
				correcte=false;	
				JOptionPane.showMessageDialog(null,"Has eixit de l'aplicaci�","Eixir",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}//end try-catch

	}while(correcte==false);
		
		if(num1>num2)
			JOptionPane.showMessageDialog(null,num1 + " �s major que " + num2 , "resultat",JOptionPane.INFORMATION_MESSAGE);
		
			
		if(num1<num2)
			JOptionPane.showMessageDialog(null,num1 + " �s menor que " + num2 , " resultat ",JOptionPane.INFORMATION_MESSAGE);
		
		else{
			JOptionPane.showMessageDialog(null,num1 + " �s igual que " + num2 , "resultat",JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
