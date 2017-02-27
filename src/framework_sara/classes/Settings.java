package framework_sara.classes;

import java.io.Serializable;
import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import framework_sara.Funcions.Funcions_openSave_settings_json;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.Singleton;
import framework_sara.Module.User.Model.Funcions.Funcions_tema;
import framework_sara.Module.User.Model.Funcions.Funcions_generics_open_save.Funcions_openSave_auto;
import framework_sara.classes.Llenguatge.Llenguatge;




@XStreamAlias("Settings")
public class Settings implements Serializable {

	@XStreamAlias("moneda")
	private char moneda;
	@XStreamAlias("decimal")
	private int decimal;
	@XStreamAlias("format_fecha")
	private String format_fecha;
	@XStreamAlias("idioma")
	private String idioma;
	@XStreamAlias("dummies")
	private int dummies;
	@XStreamAlias("fitxers")
	private int fitxers;
	@XStreamAlias("instance")
	private static Settings instance;
	@XStreamAlias("tema")
	private String tema;

	public Settings(char moneda, int decimal, String format_fecha, String idioma, int dummies, int fitxers,
			String tema) {

		this.moneda = moneda;
		this.decimal = decimal;
		this.format_fecha = format_fecha;
		this.idioma = idioma;
		this.dummies = dummies;
		this.fitxers = fitxers;
		this.tema = tema;
	}

	public Settings() {
		this.moneda = '€';
		this.decimal = 1;
		this.format_fecha = "dd/mm/yyyy";
		this.idioma = "angles";
		this.dummies = 0;
		this.fitxers = 0;
		this.tema = "METAL";
	}

	public static Settings getInstance() {
		if (instance == null) {
			instance = new Settings();

			Funcions_openSave_settings_json.obrir_json_auto();

			Funcions_tema.theme();
			Llenguatge.getInstance();

			Singleton.useradmin = new ArrayList<Admin>();
			Singleton.userclient = new ArrayList<Client>();
			Singleton.usernormal = new ArrayList<Normal>();

			Funcions_openSave_auto.Funcions_generic_obrir();
			//
			// boolean dummies =
			// Functions_menu.YES_NO(Language_general.getInstance().getProperty("dummies"));
			// if (dummies == true) {
			// Make_dummies.makedummies_admin();
			// Make_dummies.makedummies_client();
			// Make_dummies.makedummies_userregister();
			// }
		}
		return instance;
	}

	public char getmoneda() {
		return this.moneda;
	}

	public int getdecimal() {
		return this.decimal;
	}

	public String getformat_fecha() {
		return this.format_fecha;
	}

	public String getidioma() {
		return this.idioma;
	}

	public int getdummies() {
		return this.dummies;
	}

	public int getfitxers() {
		return this.fitxers;
	}

	public String gettema() {
		return this.tema;
	}
	
	
	
	
	

	public void setmoneda(char moneda) {
		this.moneda = moneda;
	}

	public void setdecimal(int decimal) {
		this.decimal = decimal;
	}

	public void setformat_fecha(String format_fecha) {
		this.format_fecha = format_fecha;
	}

	public void setidioma(String idioma) {
		this.idioma = idioma;
	}

	public void setdummies(int dummies) {
		this.dummies = dummies;
	}

	public void setfitxers(int fitxers) {
		this.fitxers = fitxers;
	}

	public void setTheme(String theme) {
		this.tema = theme;
		Funcions_tema.theme();
	}

	public String toString() {
		String cad = "";
		cad = ("moneda" + this.getmoneda() + "decimal" + this.getdecimal() + "format_fecha" + this.getformat_fecha()
				+ "idioma" + this.getidioma() + "dummies" + this.getdummies() + "fitxers" + this.getfitxers() + "tema"
				+ this.gettema());
		return cad;
	}

}
