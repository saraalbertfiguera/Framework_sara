package Pdf1;
import javax.swing.JOptionPane;

public class Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0,num2=0;
		boolean correcte=true;	
		do{
			
			num1 = funcions.askint("Introdueix un numero", "Introduccio de dades");
			num2 = funcions.askint("Introdueix un numero", "Introduccio de dades");
			
	}while(correcte==false);
		
		if(num1>num2)
			JOptionPane.showMessageDialog(null,num1 + " és major que " + num2 , "resultat",JOptionPane.INFORMATION_MESSAGE);
		
			
		if(num1<num2)
			JOptionPane.showMessageDialog(null,num1 + " és menor que " + num2 , " resultat ",JOptionPane.INFORMATION_MESSAGE);
		
		else{
			JOptionPane.showMessageDialog(null,num1 + " és igual que " + num2 , "resultat",JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
