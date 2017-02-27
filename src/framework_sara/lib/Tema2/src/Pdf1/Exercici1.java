
package Pdf1;

import javax.swing.JOptionPane;

public class Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		float num1=0,num2=0,num3=0;
		
		String s="";
		boolean correcte=true;	
		do{
			
			num1 = funcions.askfloat("Introdueix un numero", "Introduccio de dades");
			num2 = funcions.askfloat("Introdueix un numero", "Introduccio de dades");
			num3 = funcions.askfloat("Introdueix un numero", "Introduccio de dades");
			
			
				
		}while(correcte==false);
		
				JOptionPane.showMessageDialog(null,"El resultat és: "+((num1+num2+num3)/3),"resultat",JOptionPane.INFORMATION_MESSAGE);

	
		
	}

}
