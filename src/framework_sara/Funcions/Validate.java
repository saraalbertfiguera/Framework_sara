package framework_sara.Funcions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

	private static final String plantilla_nom = "^[a-zA-Z\\s]*$";
	private static final String plantilla_CP = "^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";
	private static final String plantilla_tel = "^[0-9]{2,3}-? ?[0-9]{6,7}$";
	private static final String plantilla_email = ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	private static final String plantilla_edat = "^[0-9]{1,2}$";
	private static final String plantilla_nomnums = "^[A-Za-z0-9-\\s]*$";
	private static final String plantilla_localitat = "^[a-zA-Z]*$";
	private static final String plantilla_provincia = "^[a-zA-Z]*$";
	private static final String plantilla_sexe = "^(M|W)*$";
	private static final String plantilla_tipo = "^(admin|client|normal)*$";
	private static final String plantilla_usuari = "^[a-zA-Z]*$";
	private static final String plantilla_cognoms = "^[a-zA-Z\\s]*$";
	private static final String plantilla_contrasenya = "^[a-zA-Z0-9-\\s]{6,}$";
	private static final String plantilla_comentaris="^[0-9]{1,}$";
	private static final String plantilla_fecha = "\\d{1,2}/\\d{1,2}/\\d{4}";
	private static final String plantilla_fecha2= "\\d{1,2}-\\d{1,2}-\\d{4}";
	private static final String plantilla_fecha3= "\\d{4}/\\d{1,2}/\\d{1,2}";
	private static final String plantilla_fecha4= "\\d{4}-\\d{1,2}-\\d{1,2}";
	
	public static boolean validacomentaris(String comentaris) {
		Pattern pattern = Pattern.compile(plantilla_comentaris);
		Matcher matcher = pattern.matcher(comentaris);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validacomentaris
	
	public static boolean formatfecha(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha);
		Matcher matcher = pattern.matcher(fecha);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validafecha
	
	public static boolean formatfecha2(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha2);
		Matcher matcher = pattern.matcher(fecha);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validafecha2
	
	public static boolean formatfecha3(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha3);
		Matcher matcher = pattern.matcher(fecha);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validafecha3
	
	public static boolean formatfecha4(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha4);
		Matcher matcher = pattern.matcher(fecha);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validafecha4
		
	public static boolean validacontrasenya(String user) {
		Pattern pattern = Pattern.compile(plantilla_contrasenya);
		Matcher matcher = pattern.matcher(user);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validacontrasenya

	public static boolean validasexe(String user) {
		Pattern pattern = Pattern.compile(plantilla_sexe);
		Matcher matcher = pattern.matcher(user);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validasexe

	public static boolean validausuari(String user) {
		Pattern pattern = Pattern.compile(plantilla_usuari);
		Matcher matcher = pattern.matcher(user);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validausuari

	public static boolean validatipo(String user) {
		Pattern pattern = Pattern.compile(plantilla_tipo);
		Matcher matcher = pattern.matcher(user);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validatipo

	public static boolean validamvl(String user) {
		Pattern pattern = Pattern.compile(plantilla_tel);
		Matcher matcher = pattern.matcher(user);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validatel

	public static boolean validauser(String user) {
		Pattern pattern = Pattern.compile(plantilla_usuari);
		Matcher matcher = pattern.matcher(user);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validauser

	public static boolean validalocalitat(String localitat) {
		Pattern pattern = Pattern.compile(plantilla_localitat);
		Matcher matcher = pattern.matcher(localitat);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validalocalitat

	public static boolean validaprovincia(String provincia) {
		Pattern pattern = Pattern.compile(plantilla_provincia);
		Matcher matcher = pattern.matcher(provincia);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validaprovincia

	public static boolean validanom(String nom) {
		Pattern pattern = Pattern.compile(plantilla_nom);
		Matcher matcher = pattern.matcher(nom);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validanom

	public static boolean validanomnums(String nomnums) {
		Pattern pattern = Pattern.compile(plantilla_nomnums);
		Matcher matcher = pattern.matcher(nomnums);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end nomnums

	public static boolean validacodipost(String codipost) {
		Pattern pattern = Pattern.compile(plantilla_CP);
		Matcher matcher = pattern.matcher(codipost);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validacodipost

	public static boolean validatel(String tel) {
		Pattern pattern = Pattern.compile(plantilla_tel);
		Matcher matcher = pattern.matcher(tel);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validatel
	
	public static boolean validamovil(String movil) {
		Pattern pattern = Pattern.compile(plantilla_tel);
		Matcher matcher = pattern.matcher(movil);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validamovil

	public static boolean validaemail(String email) {
		Pattern pattern = Pattern.compile(plantilla_email);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end validaemail

	public static boolean validaedat(String edat) {
		Pattern pattern = Pattern.compile(plantilla_edat);
		Matcher matcher = pattern.matcher(edat);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end
		// validaedat

	public static boolean validacognoms(String cognoms) {
		Pattern pattern = Pattern.compile(plantilla_cognoms);
		Matcher matcher = pattern.matcher(cognoms);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}// end
		// validacognoms

	public static boolean validadni(String dni) {
		boolean val = true;
		String dni2 = "";
		String caracters = "TRWACMYFPDXDNJZSQVHLCKET";
		int dni1 = 0;
		int modul = 0;
		for (int i = 0; i < 8; i++) {
			dni2 += dni.charAt(i);
			char lletra = dni.charAt(8);
			dni1 = Integer.parseInt(dni2);
			modul = dni1 % 23;
			char let = caracters.charAt(modul);
			if (let == lletra) {
				val = true;
			} else {
				val = false;
			} // end else
		} // end for
		return val;
	}// end validadni

}//
