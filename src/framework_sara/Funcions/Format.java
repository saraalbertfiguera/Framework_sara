package framework_sara.Funcions;

import java.text.DecimalFormat;

import framework_sara.Module.User.Model.Funcions.Funcions_tema;
import framework_sara.classes.Settings;

public class Format {

	public static String format1decimal(float salari) {
		DecimalFormat decimalformat = new DecimalFormat(".0");
		return decimalformat.format(salari);
	}

	public static String format2decimal(float salari) {
		DecimalFormat decimalformat = new DecimalFormat(".00");
		return decimalformat.format(salari);
	}

	public static String format3decimal(float salari) {
		DecimalFormat decimalformat = new DecimalFormat(".000");
		return decimalformat.format(salari);
	}

	public static String formatSalari(char moneda, float salari, int decimal) {
		String salariOk = null;
		switch (moneda) {
		case '$':

			salari = salari * 1.0844f;
			if (decimal == 1) {
				salariOk = Format.format1decimal(salari);
			} else if (decimal == 2) {
				salariOk = Format.format2decimal(salari);
			} else if (decimal == 3) {
				salariOk = Format.format3decimal(salari);
			} //

			break;
		case '£':
			salari = salari * 0.72686f;
			if (decimal == 1) {
				salariOk = Format.format1decimal(salari);
			} else if (decimal == 2) {
				salariOk = Format.format2decimal(salari);
			} else if (decimal == 3) {
				salariOk = Format.format3decimal(salari);
			} //

			break;
		case '€':
			salari = salari;
			if (decimal == 1) {
				salariOk = Format.format1decimal(salari);
			} else if (decimal == 2) {
				salariOk = Format.format2decimal(salari);
			} else if (decimal == 3) {
				salariOk = Format.format3decimal(salari);
			} //
			break;
		}
		return salariOk;
	}

	public static void theme() {
		String[] options = { "METAL", "GTK", "MOTIF", "NINBUS", "WINDOWS95", "WINDOWS", "MAC OS", "MAC OS X" };
		String menu = "";

		menu = Funcions.menubox(options, "missatge", "titol");
		switch (menu) {
		case "METAL":
			Settings.getInstance().setTheme("METAL");
			Funcions_tema.theme();
			break;

		case "GTK":// GTK
			Settings.getInstance().setTheme("GTK");
			Funcions_tema.theme();
			break;

		case "MOTIF":// Motif
			Settings.getInstance().setTheme("MOTIF");
			Funcions_tema.theme();
			break;

		case "NIMBUS":// Nimbus - JAVA
			Settings.getInstance().setTheme("NINBUS");
			Funcions_tema.theme();
			break;

		case "WINDOWS95":// WINDOWS 95
			Settings.getInstance().setTheme("WINDOWS95");
			Funcions_tema.theme();
			break;

		case "WINDOWS":// WINDOWS
			Settings.getInstance().setTheme("WINDOWS");
			Funcions_tema.theme();
			break;

		case "MAC OS":// MAC OS
			Settings.getInstance().setTheme("MAC OS");
			Funcions_tema.theme();
			break;

		case "MAC OS X":// MAC OS X
			Settings.getInstance().setTheme("MAC OS X");
			Funcions_tema.theme();
			break;
		}
	}
}
