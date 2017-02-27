package framework_sara.Funcions;

import framework_sara.main_exer3;

import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;

public class Menus {

	// public static Llenguatge idioma = null;
	// FORMAT DE FECHA ----------------------------------------------------

	// public static String estandar_fecha="dd/mm/yyyy";

	public static void formatFecha() {
		String[] opcions = { "dd/mm/yyyy", "dd-mm-yyyy", "yyyy/mm/dd", "yyyy-mm-dd" };
		int menu = 0;
		menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("seleccio_formatfecha"),
				Llenguatge.getInstance().getProperty("format_fecha"));
		switch (menu) {
		case 0:
			Settings.getInstance().setformat_fecha("dd/mm/yyyy");
			break;
		case 1:
			Settings.getInstance().setformat_fecha("dd-mm-yyyy");
			break;
		case 2:
			Settings.getInstance().setformat_fecha("yyyy/mm/dd");
			break;
		case 3:
			Settings.getInstance().setformat_fecha("yyyy-mm-dd");
			break;
		}
	}

	// CANVI DE MONEDA ------------------------------------------------------

	// public static char estandar_moneda='�';

	public static void currency() {
		// char currency=' ';
		String[] opcions = { Llenguatge.getInstance().getProperty("euro"),
				Llenguatge.getInstance().getProperty("dolar"), Llenguatge.getInstance().getProperty("lliura") };
		int menu = 0;

		menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("seleccio_moneda"),
				Llenguatge.getInstance().getProperty("moneda"));

		switch (menu) {
		case 0:
			Settings.getInstance().setmoneda('€');
			break;
		case 1:
			Settings.getInstance().setmoneda('$');
			break;
		case 2:
			Settings.getInstance().setmoneda('£');
			break;
		}
	}

	// NOMBRE DE DECIMALS ------------------------------------------------------

	// public static int estandar_decimal=1;

	public static void decimal() {
		int menu = 0;
		String[] opcions = { "1", "2", "3" };

		menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("seleccio_opcio"),
				Llenguatge.getInstance().getProperty("format_decimal"));

		switch (menu) {
		case 0:
			Settings.getInstance().setdecimal(1);
			break;
		case 1:
			Settings.getInstance().setdecimal(2);
			break;
		case 2:
			Settings.getInstance().setdecimal(3);
			break;
		}
	}

	// IDIOMA ------------------------------------------------------

	public static String idioma() {
		int menu = 0;
		String[] opcions = { Llenguatge.getInstance().getProperty("angles"),
				Llenguatge.getInstance().getProperty("valencia"), Llenguatge.getInstance().getProperty("castella") };
		// String [] opcions = { "angles", "valencia","castella" };
		String idioma = "";
		menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("seleccio_idioma"),
				Llenguatge.getInstance().getProperty("idioma"));

		switch (menu) {
		case 0:
			idioma = "angles";
			break;
		case 1:
			idioma = "valencia";
			break;
		case 2:
			idioma = "castella";
			break;

		}
		return idioma;

	}
}
