import javax.swing.JOptionPane;

public class Pdf3Exercici11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont=0;
		int num=0;
		int n=0;
		String s="";
		//String t="";
		//int i=0;
		boolean correcte=true;
		
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Quants números vas a introduir?", "Introducció de dades", JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Eixint de l'aplicació", "Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else{
					n=Integer.parseInt(s);
					correcte=true;
				}//end else
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introduït les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
				correcte=false;
			
			}//end catch
		}while(correcte==false);	
			
	for(int i=0;i<n;i++){
		do{
				try {
					s=JOptionPane.showInputDialog(null, "Introdueix un número", "Introducció de dades", JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Eixint de l'aplicació", "Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else{
						num=Integer.parseInt(s);
						correcte=true;
					}//end else
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introduït les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
				}//end catch
			
		}while(correcte==false);
		
		if((num%2==0)&&(num>=0)){
			cont++;
		}//end if
			
		

	}//end for
	JOptionPane.showMessageDialog(null, "Has introduit "+cont+ " vegades, un número parell i positiu", "Resultat", JOptionPane.INFORMATION_MESSAGE);
	
	}
}
