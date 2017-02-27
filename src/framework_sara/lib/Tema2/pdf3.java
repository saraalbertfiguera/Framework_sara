package repas;

import javax.swing.JOptionPane;

public class pdf3 {

	public static void main(String[] args) {

		String opciones[] = { "Ejercicio4", "Ejercicio6", "Ejercicio8", "Ejercicio9", "Ejercicio10", "Ejercicio11",
				"ejercicio12", "ejercicio15", "SALIR" };
		String opciones1[] = { "hacer denuevo ejercicio", "volver menu principal", "SALIR" };
		String opciones2[] = { "SI", "NO" };
		int option = 0, option1 = 0,option2=0;
		do {
			option = funciones.menubuttons(opciones, "Elije una opcion", "menu");
			if ((option == 6) || (option == -1))
				System.exit(0);
			switch (option) {

			case 0:
				do {

					int n = 0, conta = 0, conte = 0, conti = 0, conto = 0, contu = 0;
					char caracter = ' ';

					n = funciones.valnumInt("¿cuantos caracteres quieres valorar?", "pregunta");
					for (int i = 0; i < n; i++) {
						caracter = funciones.valcaracter("Dime un caracter", "caracter");
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
					JOptionPane.showMessageDialog(null,
							"la letra a se repite " + conta + " veces \n la letra e se repite " + conte
									+ " veces \n la letra i se repite " + conti + " veces \n la letra o se repite "
									+ conto + " veces \n la letra u se repite " + contu + " veces");

					option1 = funciones.menubuttons(opciones1, "Elije una opcion", "menu");
				} while (option1 == 0);
				break;

			case 1:
				do {
					int num=0,suma=0;
					boolean interruptor=false;
					
				while (interruptor==false){
					num=funciones.valnumInt("Dime numero","numero");
					if(num<0){
						interruptor=true;
					
					}else{
					suma=suma+num;
					}
				}// fi while
				JOptionPane.showMessageDialog(null,"la suma dels numeros es "+suma);
				option1 = funciones.menubuttons(opciones1, "Elije una opcion", "menu");
				} while (option1 == 0);
			case 2:
				do {
					int num1=0,num2=0,suma=0;
					do{
						num1=funciones.valnumInt("Dime el primer numero","numero1");
						num2=funciones.valnumInt("Dime el segundo numero","numero2");
						suma=num1+num2;
						JOptionPane.showMessageDialog(null,"el resultat de la suma es "+suma);
						option2=funciones.menubuttons(opciones2,"quieres seguir sumando numeros?","menu3");
					}while(option2==0);
					option1 = funciones.menubuttons(opciones1, "Elije una opcion", "menu");
				} while (option1 == 0);
				break;
			case 3:
				do {
					
					int n=0,num=0,producto=1;
					n=funciones.valnumInt("¿de cuantos numeros quieres valorar su producto?","pregunta");
					for(int i=0;i<n;i++){
						num=funciones.valnumInt("Dime numero","numero");
						producto=producto*num;
					}// fi for
					JOptionPane.showMessageDialog(null,"el producto total de los numeros es "+producto);
					option1 = funciones.menubuttons(opciones1, "Elije una opcion", "menu");
				} while (option1 == 0);
				break;
			case 4:
				do {
					
					
					
					option1 = funciones.menubuttons(opciones1, "Elije una opcion", "menu");
				} while (option1 == 0);
				break;
			case 5:
				do {
					int n=0,num=0;
					String cad="";
					n=funciones.valnumInt("¿de cuantos numeros quieres valorar si son pares y positivos?","pregunta");
					for(int i=0;i<n;i++){
						num=funciones.valnumInt("Dime numero","numero");
					if(((num%2)==0)&&(num>=0))
						cad=cad+("el numero "+num+" es par y positivo");
					}// fi for
					JOptionPane.showMessageDialog(null,cad);

					option1 = funciones.menubuttons(opciones1, "Elije una opcion", "menu");
				} while (option1 == 0);
				break;
			case 6:
				do {

					option1 = funciones.menubuttons(opciones1, "Elije una opcion", "menu");
				} while (option1 == 0);
				break;
			case 7:
				do {
					
					int num=0,contador=0,multiplica=1;
					while(contador<5){
						num=funciones.valnumInt("Dime numero entero","numero entero");
						if((num%2)!=0){
						multiplica=multiplica*num;
						contador++;
						}
					}
					JOptionPane.showMessageDialog(null,"el resultado de la multiplicacion de los 5 primeros numeros impares es "+multiplica);

					option1 = funciones.menubuttons(opciones1, "Elije una opcion", "menu");
				} while (option1 == 0);
				break;
			}
		} while ((option != 8) && (option1 != 2));

	}

}
