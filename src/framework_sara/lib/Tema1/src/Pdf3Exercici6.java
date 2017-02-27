import javax.swing.JOptionPane;

public class Pdf3Exercici6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		boolean interruptor=true;
		int suma=0;
		String s="";
		// int continuar=0;
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Introdueix un número", "Introducció de dades", JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Has eixit de l'aplicació", "Eixir", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else{
						num=Integer.parseInt(s);
						if(num>=0){
							suma=suma+num;
						}else{
							interruptor=false;
							JOptionPane.showMessageDialog(null, "El resultat de la suma és: " +suma, "Resultat", JOptionPane.INFORMATION_MESSAGE); 
							System.exit(0);
							//continuar= JOptionPane.showConfirmDialog(null, "Vols continuar?");	
					    }//end else
					}//end else	
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introduit les dades correctament", "Error", JOptionPane.ERROR_MESSAGE);
					//interruptor=false;	
				}//end catch
			}while(interruptor=true);
				
				
				//(continuar==JOptionPane.YES_OPTION);	
			       // JOptionPane.showMessageDialog(null, "Gràcies per utilitzar aquesta aplicació", "Informació", JOptionPane.INFORMATION_MESSAGE);
			      //  System.exit(0);
			
			
				
			
		}//end while

	}


