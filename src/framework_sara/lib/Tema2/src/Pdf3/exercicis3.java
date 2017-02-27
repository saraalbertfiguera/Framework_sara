
package Pdf3;

import javax.swing.JOptionPane;

import miniexamen.funcions;

public class exercicis3 {

	// ************************************************************************************************************************************************Exercici4

	public static String exer1() {

		int n = 0, conta = 0, conte = 0, conti = 0, conto = 0, contu = 0;
		char caracter = ' ';
		String cad="";

		n = funcions.askint("¿cuantos caracteres quieres valorar?", "pregunta");
		for (int i = 0; i < n; i++) {
			caracter = funcions.askchar("Dime un caracter", "caracter");
			switch (caracter) {
			case 'a':
				conta++;
				break;
			case 'e':
				conte++;
				break;
			case 'i':
				conti++;
				break;
			case 'o':
				conto++;
				break;
			case 'u':
				contu++;
				break;

			}// fi switch_case
		} // fi for
		cad=cad+("la letra a se repite " + conta + " veces \n la letra e se repite " + conte
				+ " veces \n la letra i se repite " + conti + " veces \n la letra o se repite "
				+ conto + " veces \n la letra u se repite " + contu + " veces");
				
		return cad;
	}// end function

	// ***********************************************************************************************************************************************Exercici 6

	public static String exer2() {
		int num=0,suma=0;
		boolean interruptor=false;
		String cad="";
		
	while (interruptor==false){
		num=funcions.askint("Dime numero","numero");
		if(num<0){
			interruptor=true;
		
		}else{
		suma=suma+num;
		}
	}// fi while
	cad=cad+("la suma dels numeros es "+suma);
		return cad;

	}// end funcio

	// ****************************************************************************************************************************************************Exercici 8
	public static String exer3() {
		int num1=0;
		int num2=0;
		int suma=0;
		String cad="";
		
		num1=funcions.askint("Dime el primer numero","numero1");
		num2=funcions.askint("Dime el segundo numero","numero2");
		suma=num1+num2;
		cad=cad+("el resultat de la suma es "+suma);
		return cad;
	}// end funcio

	// *******************************************************************************************************************************************************Exercici 10

	public static String exer4() {
		
		int n=0,num=0,producto=1;
		String cad="";
		
		n=funcions.askint("¿de cuantos numeros quieres valorar su producto?","pregunta");
		for(int i=0;i<n;i++){
			num=funcions.askint("Dime numero","numero");
			producto=producto*num;
		}// fi for
		cad=cad+("el producto total de los numeros es "+producto);
		
		return cad;

	}// end funcio

	// *********************************************************************************************************************************************************Exercici 11
	public static String exer5() {

		int n=0,num=0;
		String cad="";
		
		n=funcions.askint("¿de cuantos numeros quieres valorar si son pares y positivos?","pregunta");
		for(int i=0;i<n;i++){
			num=funcions.askint("Dime numero","numero");
		if(((num%2)==0)&&(num>=0)) {
			cad=cad+("el numero "+num+" es par y positivo");
		}
		}//end for
		return cad;
	}// end function

	// ***********************************************************************************************************************************************************Exercici 12

	public static String exer7() {
		
		int num=0,contador=0,multiplica=1;
		String cad="";
		
		while(contador<5){
			num=funcions.askint("Dime numero entero","numero entero");
			if((num%2)!=0){
			multiplica=multiplica*num;
			contador++;
			}
		}
		cad=cad+("el resultado de la multiplicacion de los 5 primeros numeros impares es "+multiplica);
	

		return cad;

	}// end funcio


	
}
