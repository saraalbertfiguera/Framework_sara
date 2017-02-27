package framework_sara.Module.User.Model.Funcions;

import javax.swing.JOptionPane;
import framework_sara.main_exer3;
import framework_sara.Funcions.Funcions;
import framework_sara.Funcions.Validate;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.classes.Fecha;
import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;

public class Funcions_dades_user {

	// NOM ******************************************************

	public static String asknom() {

		String nom = "";
		boolean correcte = true;

		do {
			nom = Funcions.askstring(Llenguatge.getInstance().getProperty("nom"),
					Llenguatge.getInstance().getProperty("intro_dades")); // introdueix
																			// el
																			// nom,
																			// nom
			correcte = Validate.validanom(nom);
		} while (correcte == false);
		return nom;

	}// end funcio

	// DNI ******************************************************

	public static String askdni() {

		String dni = "";
		boolean correcte = true;

		do {
			dni = Funcions.askstring(Llenguatge.getInstance().getProperty("dni"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validadni(dni);

		} while (correcte == false);
		return dni;

	}// end funcio

	// DNI verificar ******************************************************

	public static String askdni2() {

		String dni = "";
		boolean correcte = true;

		do {
			dni = Funcions.askstring(Llenguatge.getInstance().getProperty("dni2"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validadni(dni);

			if (correcte == false) {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("mala_introduccio"),
						Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}

		} while (correcte == false);
		return dni;

	}// end funcio

	// TELEFON ***************************************************

	public static String asktel() {

		String tel;
		boolean correcte = true;

		do {
			tel = Funcions.askstring(Llenguatge.getInstance().getProperty("telefon"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validatel(tel);

		} while (correcte == false);
		return tel;
	}// end asktel

	// MOVIL ***************************************************

	public static String askmovil() {

		String tel;
		boolean correcte = true;

		do {
			tel = Funcions.askstring(Llenguatge.getInstance().getProperty("movil"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validatel(tel);

		} while (correcte == false);
		return tel;
	}// end asktel

	// EDAT ***************************************************

	public static String askedat() {

		String edat;
		boolean correcte = true;

		do {
			edat = Funcions.askstring(Llenguatge.getInstance().getProperty("edat"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validaedat(edat);

		} while (correcte == false);
		return edat;
	}// end asktel

	// CODI POSTAL ***************************************************

	public static String askcodipost() {

		String codipost;
		boolean correcte = true;

		do {
			codipost = Funcions.askstring(Llenguatge.getInstance().getProperty("codipost"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validacodipost(codipost);

		} while (correcte == false);
		return codipost;
	}// end asktel

	// EMAIL ***************************************************

	public static String askemail() {

		String email;
		boolean correcte = true;

		do {
			email = Funcions.askstring(Llenguatge.getInstance().getProperty("email"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validaemail(email);

		} while (correcte == false);
		return email;
	}// end asktel

	// LLETRES I NUMEROS ***************************************************

	public static String asknomnums() {

		String nomnums;
		boolean correcte = true;

		do {
			nomnums = Funcions.askstring(Llenguatge.getInstance().getProperty("password"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validanomnums(nomnums);

		} while (correcte == false);
		return nomnums;
	}// end asktel

	// SEXE ***************************************************

	public static String asksexe() {

		String sexe;
		boolean correcte = true;

		do {
			sexe = Funcions.askstring(Llenguatge.getInstance().getProperty("sexe"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validasexe(sexe);

		} while (correcte == false);
		return sexe;
	}// end asksexe

	// TIPO ***************************************************

	public static String asktipo() {

		String tipo;
		boolean correcte = true;

		do {
			tipo = Funcions.askstring(Llenguatge.getInstance().getProperty("usuari"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validatipo(tipo);

		} while (correcte == false);
		return tipo;
	}// end asktipo

	// USUARI ***************************************************

	public static String askusuari() {

		String usuari;
		boolean correcte = true;

		do {
			usuari = Funcions.askstring(Llenguatge.getInstance().getProperty("usuari"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validausuari(usuari);

		} while (correcte == false);
		return usuari;
	}// end askusuari

	// LOCALITAT ***************************************************

	public static String asklocalitat() {

		String localitat;
		boolean correcte = true;

		do {
			localitat = Funcions.askstring(Llenguatge.getInstance().getProperty("localitat"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validalocalitat(localitat);

		} while (correcte == false);
		return localitat;
	}// end asklocalitat

	// PROVINCIA ***************************************************

	public static String askprovincia() {

		String provincia;
		boolean correcte = true;

		do {
			provincia = Funcions.askstring(Llenguatge.getInstance().getProperty("provincia"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validaprovincia(provincia);

		} while (correcte == false);
		return provincia;
	}// end askprovincia

	// ADRECA ***************************************************

	public static String askadreca() {

		String adreca;
		boolean correcte = true;

		do {
			adreca = Funcions.askstring(Llenguatge.getInstance().getProperty("adreca"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validanomnums(adreca);

		} while (correcte == false);
		return adreca;
	}// end askprovincia

	// COGNOMS ***************************************************

	public static String askcognoms() {

		String cognoms;
		boolean correcte = true;

		do {
			cognoms = Funcions.askstring(Llenguatge.getInstance().getProperty("cognoms"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validacognoms(cognoms);

		} while (correcte == false);
		return cognoms;
	}// end askcognoms

	// CONTRASENYA ***************************************************

	public static String askcontrasenya() {

		String contrasenya;
		boolean correcte = true;

		do {
			contrasenya = Funcions.askstring(Llenguatge.getInstance().getProperty("password"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validacontrasenya(contrasenya);

		} while (correcte == false);
		return contrasenya;
	}// end askcontrasenya

	// FECHA ***************************************************

	public static String askfecha(int tipo) {

		String fecha;
		String format = Settings.getInstance().getformat_fecha();
		String tipoFecha = "date";
		boolean correcte = true;

		do {
			switch (tipo) {
			case 1:
				tipoFecha = Llenguatge.getInstance().getProperty("fechaNaixement"); // de
																					// naixement
				break;
			case 2:
				tipoFecha = Llenguatge.getInstance().getProperty("fechaCont"); // de
																				// contractacio
				break;

			default:
				tipoFecha = Llenguatge.getInstance().getProperty("fecha");
			}

			fecha = Funcions.askstring(Llenguatge.getInstance().getProperty("introd") + tipoFecha,
					Llenguatge.getInstance().getProperty("intro_dades"));

			switch (format) {
			case "dd/mm/yyyy":
				correcte = Validate.formatfecha(fecha);
				if (correcte == false) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("introduir_fecha"));
					// correcte = false;
				} // end if
				break;

			case "dd-mm-yyyy":
				correcte = Validate.formatfecha2(fecha);
				if (correcte == false) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("introduir_fecha"));
					// correcte = false;
				} // end if
				break;
			case "yyyy/mm/dd":
				correcte = Validate.formatfecha3(fecha);
				if (correcte == false) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("introduir_fecha"));
					// correcte = false;
				} // end if
				break;
			case "yyyy-mm-dd":
				correcte = Validate.formatfecha4(fecha);
				if (correcte == false) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("introduir_fecha"));
					// correcte = false;
				} // end if
				break;

			}// end switch

		} while (correcte == false);

		return fecha;
	} // end askfecha

	// COMENTARIS ***************************************************

	public static int askcomentaris() {

		String cad;
		int comentaris;
		boolean correcte = true;

		do {
			cad = Funcions.askstring(Llenguatge.getInstance().getProperty("introduir_comentaris"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validacomentaris(cad);

		} while (correcte == false);
		comentaris = Integer.parseInt(cad);
		return comentaris;
	}// end askcomentaris

	// NUM COMPRES ***************************************************

	public static int asknum_compres() {

		String cad;
		int num_compres;
		boolean correcte = true;

		do {
			cad = Funcions.askstring(Llenguatge.getInstance().getProperty("introduir_compres"),
					Llenguatge.getInstance().getProperty("intro_dades"));
			correcte = Validate.validacomentaris(cad);

		} while (correcte == false);
		num_compres = Integer.parseInt(cad);
		return num_compres;
	}// end asknum_compres

	// UPDATE FECHANAIX ***************************************************

	public static Fecha update_fechanaix_admin(Admin u1) {
		int edad = 0;
		int antiguedad;
		Fecha fecha_naixement = null;
		boolean continuar = false;
		do {
			fecha_naixement = Funcions_fecha_user.ask_FechaNaixement();
			edad = (u1.calculaedat());
			antiguedad = ((Admin) u1).getantiguetat();

			continuar = Funcions_dades_user.comprova(edad, antiguedad);
		} while (continuar == false);
		((Admin) u1).setfechaNaixement(fecha_naixement);
		return fecha_naixement;
	}

	public static Fecha update_fechanaix_client(Client u1) {
		int edad = 0;
		int antiguedad;
		Fecha fecha_naixement = null;
		boolean continuar = false;
		do {
			fecha_naixement = Funcions_fecha_user.ask_FechaNaixement();
			edad = (u1.calculaedat());
			if ((edad < 18) || (edad > 80)) {
				continuar = false;
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("menor_edat"));
			} else {
				continuar = true;
			}

		} while (continuar == false);
		((Client) u1).setfechaNaixement(fecha_naixement);
		return fecha_naixement;
	}

	public static Fecha update_fechanaix_normal(Normal u1) {
		int edad = 0;
		int antiguedad;
		Fecha fecha_naixement = null;
		boolean continuar = false;
		do {
			fecha_naixement = Funcions_fecha_user.ask_FechaNaixement();
			edad = (u1.calculaedat());
			if ((edad < 18) || (edad > 80)) {
				continuar = false;
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("menor_edat"));
			} else {
				continuar = true;
			}

		} while (continuar == false);
		((Normal) u1).setfechaNaixement(fecha_naixement);
		return fecha_naixement;
	}

	// COMPROVA MAJOR EDAT PER AL UPDATE **********************************

	public static boolean comprova(int edad, int antiguedad) {
		int valor = edad - antiguedad;
		boolean continuar = true;
		if (valor > 18) {
			continuar = true;
		} else {
			continuar = false;
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("menor_edat"));
		}
		return continuar;
	}

}
