package Pdf1;
import javax.swing.JOptionPane;

public class Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1=0.0f,num2=0.0f,aux=0.0f;
		String s="";
		boolean correcte=true;
		do{
			num1 = funcions.askfloat("Introdueix un numero", "Introduccio de dades");
			num2 = funcions.askfloat("Introdueix un numero", "Introduccio de dades");

		}while(correcte==false);
		
		aux=num1;
		num1=num2;
		num2=aux;
		JOptionPane.showMessageDialog(null, num1 + " , " + num2 , "Resultat", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}

}
