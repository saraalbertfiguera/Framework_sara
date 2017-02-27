package framework_sara.Module.User.Model.Funcions;

import framework_sara.main_exer3;
import framework_sara.classes.Llenguatge.Llenguatge;


public class Funcions_altres_dades_user {

	public static int punts(int comentaris) {

		int punts = 0;

		if (comentaris < 10) {

			punts = 0;
		} else if ((comentaris >= 10) && (comentaris <= 50)) {
			punts = 100;
		} else if ((comentaris > 50) && (comentaris <= 100)) {
			punts = 200;
		} else if ((comentaris > 100) && (comentaris <= 150)) {
			punts = 300;
		} else if ((comentaris > 150) && (comentaris <= 200)) {
			punts = 400;
		} else {
			punts = 500;
		}
		return punts;

	}// end funcio punts

	public static String karma(int punts) {
		String karma = "";
		if (punts <= 100) {
			karma =  Llenguatge.getInstance().getProperty("baix");
		} else if ((punts > 100) && (punts <= 200)) {
			karma = Llenguatge.getInstance().getProperty("mig");
		} else if ((punts >= 300) && (punts < 400)) {
			karma = Llenguatge.getInstance().getProperty("alt");
		} else if (punts >= 400) {
			karma = Llenguatge.getInstance().getProperty("molt_alt");
		}
		return karma;
	}

	public static int descompte(int num_compres) {
		int descompte=0;
		if (num_compres < 5) {
			descompte = 0;
		} else if ((num_compres >= 5) && (num_compres <= 10)) {
			descompte = 5;
		} else if ((num_compres > 10) && (num_compres <= 20)) {
			descompte = 10;
		} else if ((num_compres > 20) && (num_compres <= 40)) {
			descompte = 15;
		} else if ((num_compres > 40) && (num_compres <= 60)) {
			descompte = 20;
		} else if ((num_compres > 60) && (num_compres <= 80)) {
			descompte = 30;
		} else if ((num_compres > 80) && (num_compres <= 100)) {
			descompte = 50;
		} else if (num_compres > 100) {
			descompte = 55;
		}

		return descompte;
	}
	
	public static float salari(int antiguetat) {
		int salari=0;
	
		if (antiguetat <=2) {
			salari = 800;
		} else if ((antiguetat >= 3) && (antiguetat < 5)) {
			salari = 900;
		} else if ((antiguetat >= 5) && (antiguetat <= 7)) {
			salari = 1000;
		} else if (antiguetat > 10) {
			salari = 1500;
		}
		return salari;
	}
	
	
}//
