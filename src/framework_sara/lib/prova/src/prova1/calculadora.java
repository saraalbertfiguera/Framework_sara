package prova1;

import javax.swing.JOptionPane;

public class calculadora {

	public static void main(String[] args) {
		
		int op;
		int num1=0,num2=0;

		System.out.println("Selecciona una d'aquestes operacions:\n"+"1.sumar\n"+"2.restar\n"+"3.multiplicar\n"+"4.dividir\n"+"5.eixir\n");
		  
		do{
		  op=Integer.parseInt(JOptionPane.showInputDialog("Selecciona una operaci�"));
		  switch (op){
		        
		      case 1:
		        num1=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el primer n�mero de la suma"));
		        num2=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el segon n�mero de la suma"));
		        System.out.println(num1+"+"+num2+"="+(num1+num2));break;
		        
		      case 2:
		        num1=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el primer n�mero de la resta"));
		        num2=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el segon n�mero de la resta"));
		        System.out.println(num1+"-"+num2+"="+(num1-num2));break;
		              
		      case 3:
		        num1=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el primer n�mero de la multiplicaci�"));
		        num2=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el segon n�mero de la multiplicaci�"));
		        System.out.println(num1+"*"+num2+"="+(num1*num2));break;
		        
		      case 4:
		        num1=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el primer n�mero de la divisi�"));
		        num2=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el segon n�mero de la divisi�"));
		       
		        if(num2==0){
		          System.out.println("No es pot dividir un n�mero entre 0");break;
		        } 
		        else{
		          num1=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el primer n�mero de la divisi�"));
		          num2=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el segon n�mero de la divisi�"));
		          System.out.println(num1+"/"+num2+"="+(num1/num2));break;
		        }
		      
		      case 5:
		        System.out.println("Has eixit de la calculadora");break;
		                
		            
		      default: System.out.println("Opci� no v�lida");break;
		        
		  }//end switch
		        
		}while (op!=5);
	
		
				
				

		
			
	}		
	
	}


