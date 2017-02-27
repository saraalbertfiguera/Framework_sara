package framework_sara.Module.User.Model.DAO;

import javax.swing.JOptionPane;

import framework_sara.Main_dummies;
import framework_sara.main_exer3;
import framework_sara.Funcions.Funcions;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.Singleton;
import framework_sara.Module.User.Model.Classes.User;
import framework_sara.Module.User.Model.Funcions.Funcions_dades_user;
import framework_sara.Module.User.Model.Funcions.Funcions_dummies;
import framework_sara.Module.User.Model.Funcions.Funcions_fecha_user;
import framework_sara.classes.Fecha;

import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;

public class Funcions_user_dummies {

	// CREATE --------------------------------------------------------------

	public static Admin create_admin() {
		Admin u1 = null;

		for (int i = 0; i < 5; i++) {

			String dni = Funcions_dummies.DNI();
			String nom = Funcions_dummies.nom();
			String adreca = Funcions_dummies.adreca();
			String sexe = Funcions_dummies.sexe();
			// String tipo = Funcions.askstring("Introduce your user
			// type","Questionnaire");
			Fecha fechaNaixement = Funcions_dummies.fechaNacimiento();
			String email = Funcions_dummies.email();
			String usuari = Funcions_dummies.usuari();
			String password = Funcions_dummies.password();
			String movil = Funcions_dummies.movil();
			String localitat = Funcions_dummies.localitat();
			String provincia = Funcions_dummies.provincia();
			String codipost = Funcions_dummies.codipost();
			Fecha fechaContratacion = Funcions_dummies.fechaContratacion(fechaNaixement);

			Admin a1 = new Admin(dni, nom, adreca, sexe, fechaNaixement, email, usuari, password, movil, localitat,
					provincia, codipost, fechaContratacion);

			Singleton.useradmin.add(a1);
		}

		return u1;
	}// end create admin

	public static Admin create_adminDni_dummies() {
		Admin u1 = null;
		String dni = Funcions_dades_user.askdni2();
		u1 = new Admin(dni);
		return u1;
	}

	public static Client create_client() {
		Client u1 = null;

		for (int i = 0; i < 5; i++) {
			Client c1 = new Client(Funcions_dummies.DNI(), Funcions_dummies.nom(), Funcions_dummies.adreca(),
					Funcions_dummies.sexe(), Funcions_dummies.fechaNacimiento(), Funcions_dummies.email(),
					Funcions_dummies.usuari(), Funcions_dummies.password(), Funcions_dummies.movil(),
					Funcions_dummies.localitat(), Funcions_dummies.provincia(), Funcions_dummies.codipost(),
					Funcions_dummies.telefon(), Funcions_dummies.num_compres());
			Singleton.userclient.add(c1);
		}
		return u1;
	}// end create client

	public static Client create_clientDni_dummies() {
		Client u1 = null;
		String dni = Funcions_dades_user.askdni2();
		u1 = new Client(dni);
		return u1;
	}

	public static Normal create_normal() {
		Normal u1 = null;

		for (int i = 0; i < 5; i++) {
			Normal n1 = new Normal(Funcions_dummies.DNI(), Funcions_dummies.nom(), Funcions_dummies.adreca(),
					Funcions_dummies.sexe(), Funcions_dummies.fechaNacimiento(), Funcions_dummies.cognoms(),
					Funcions_dummies.localitat(), Funcions_dummies.comentaris());
			Singleton.usernormal.add(n1);
		}
		return u1;

	}

	public static Normal create_normalDni_dummies() {
		Normal u1 = null;
		String dni = Funcions_dades_user.askdni2();
		u1 = new Normal(dni);
		return u1;
	}

	public static User create_user(int i) {
		User u1 = null;

		if (i == 1) { // ----------------------------------- CREATE ADMIN
			u1 = create_admin();

		} // end if

		if (i == 2) { // ----------------------------------- CREATE CLIENT

			u1 = create_client();
		} // end if

		if (i == 3) { // ----------------------------------- CREATE NORMAL

			u1 = create_normal();
		} // end if

		return u1;

	}// end create user generic

	// READ -----------------------------------------------------------------

	public static String read_user(User u1) {

		String cad = "";

		if (u1 == null) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("crear_abans"));
		} else {

			if (u1 instanceof Admin) {
				cad = ((Admin) u1).tostring();
			} // end if

			if (u1 instanceof Client) {
				cad = ((Client) u1).tostring();

			} // end if

			if (u1 instanceof Normal) {
				cad = ((Normal) u1).tostring();
			} // end if

		} // end else

		return cad;

	}// end read user generic

	// UPDATE ---------------------------------------------------------------

	public static User update_user(User u1) {

		int menu = 0;

		// -----------update ADMIN

		if (u1 == null) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("crear_abans"));
		} else {

			if (u1 instanceof Admin) {

				String opcions[] = { Llenguatge.getInstance().getProperty("dni"),
						Llenguatge.getInstance().getProperty("nom"), Llenguatge.getInstance().getProperty("adreca"),
						Llenguatge.getInstance().getProperty("sexe"),
						Llenguatge.getInstance().getProperty("fechaNaixement"),
						Llenguatge.getInstance().getProperty("email"), Llenguatge.getInstance().getProperty("usuari"),
						Llenguatge.getInstance().getProperty("password"), Llenguatge.getInstance().getProperty("movil"),
						Llenguatge.getInstance().getProperty("localitat"),
						Llenguatge.getInstance().getProperty("provincia"),
						Llenguatge.getInstance().getProperty("codipost"),
						Llenguatge.getInstance().getProperty("fechaCont") };
				menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("canvi_camp"),
						Llenguatge.getInstance().getProperty("crud3"));

				/*
				 * String opcions[] = { "dni", "nom", "adreca", "sexe",
				 * "fechaNacimiento", "email", "usuari", "password", "movil",
				 * "localitat", "provincia", "codipost", "fechacontratacion" };
				 */
				// menu = Funcions.menu(opcions, "What field do you want
				// change?", "Update");

				switch (menu) {
				case 0:
					u1.setdni(Funcions_dummies.DNI());
					break;
				case 1:
					u1.setnom(Funcions_dummies.nom());
					break;
				case 2:
					u1.setadreca(Funcions_dummies.adreca());
					break;

				case 3:
					u1.setsexe(Funcions_dummies.sexe());
					break;
				case 4:
					// String fechaNaix = Funcions_dades_user.askfecha(1);
					// Fecha fechaN = new
					// Fecha(Funcions_dummies.fechaNacimiento());
					// ////////?????????????????????'
					((Admin) u1).setfechaNaixement(Funcions_dummies.fechaNacimiento());
					break;
				case 5:
					((Admin) u1).setemail(Funcions_dummies.email());
					break;
				case 6:
					((Admin) u1).setusuari(Funcions_dummies.usuari());
					break;
				case 7:
					((Admin) u1).setpassword(Funcions_dummies.password());
					break;
				case 8:
					((Admin) u1).setmovil(Funcions_dummies.movil());
					break;
				case 9:
					((Admin) u1).setlocalitat(Funcions_dummies.localitat());
					break;
				case 10:
					((Admin) u1).setprovincia(Funcions_dummies.provincia());
					break;
				case 11:
					((Admin) u1).setcodipost(Funcions_dummies.codipost());
					break;
				case 12:
					// String fechaContr = Funcions_dades_user.askfecha(2);
					// Fecha fechaContratacion = new Fecha("5/6/2015");
					// ((Admin) u1).setFechaContratacion(fechaContratacion);
					((Admin) u1).setFechaContratacion(Funcions_dummies.fechaContratacion(u1.getfechaNaixement()));
					break;

				}//

			} //

			// ----------------update CLIENT

			if (u1 instanceof Client) {
				String opcions[] = { Llenguatge.getInstance().getProperty("dni"),
						Llenguatge.getInstance().getProperty("nom"), Llenguatge.getInstance().getProperty("adreca"),
						Llenguatge.getInstance().getProperty("sexe"),
						Llenguatge.getInstance().getProperty("fechaNaixement"),
						Llenguatge.getInstance().getProperty("email"), Llenguatge.getInstance().getProperty("usuari"),
						Llenguatge.getInstance().getProperty("password"), Llenguatge.getInstance().getProperty("movil"),
						Llenguatge.getInstance().getProperty("localitat") };

				menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("canvi_camp"),
						Llenguatge.getInstance().getProperty("crud3"));

				switch (menu) {
				case 0:
					u1.setdni("21689442M");
					break;
				case 1:
					u1.setnom("Manolo");
					break;
				case 2:
					u1.setadreca("carrer major");
					break;

				case 3:
					u1.setsexe("M");
					break;
				case 4:
					// String fechaNaix = Funcions_dades_user.askfecha(1);
					Fecha fechaN = new Fecha("8/9/1990");
					((Client) u1).setfechaNaixement(fechaN);
					break;
				case 5:
					((Client) u1).setemail("manolo@gmail.com");
					break;
				case 6:
					((Client) u1).setusuari("manolo");
					break;
				case 7:
					((Client) u1).setpassword("manolo123");
					break;
				case 8:
					((Client) u1).setmovil("665987425");
					break;
				case 9:
					((Client) u1).setlocalitat("Alcoi");
					break;
				case 10:
					((Client) u1).setprovincia("Alacant");
					break;
				case 11:
					((Client) u1).setcodipost("48521");
					break;
				case 12:
					((Client) u1).settelefon("962348512");
					break;

				}// end if

			} // end switch

			// ---------------------update NORMAL

			if (u1 instanceof Normal) {
				String opcions[] = { Llenguatge.getInstance().getProperty("dni"),
						Llenguatge.getInstance().getProperty("nom"), Llenguatge.getInstance().getProperty("adreca"),
						Llenguatge.getInstance().getProperty("sexe"),
						Llenguatge.getInstance().getProperty("fechaNaixement"),
						Llenguatge.getInstance().getProperty("email"), Llenguatge.getInstance().getProperty("usuari"),
						Llenguatge.getInstance().getProperty("password"), Llenguatge.getInstance().getProperty("movil"),
						Llenguatge.getInstance().getProperty("localitat") };
				menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("canvi_camp"),
						Llenguatge.getInstance().getProperty("crud3"));

				switch (menu) {
				case 0:
					u1.setdni("21689442M");
					break;
				case 1:
					u1.setnom("Manolo");
					break;
				case 2:
					u1.setadreca("carrer major");
					break;

				case 3:
					u1.setsexe("M");
					break;
				case 4:

					Fecha fechaN = new Fecha("8/9/1990");
					((Normal) u1).setfechaNaixement(fechaN);
					break;
				case 5:
					((Normal) u1).setcognoms("Ferrero Gandia");
					break;
				case 6:
					((Normal) u1).setlocalitat("Alcoi");
					break;

				}// end switch
			} // end if
		} // end else
		return u1;
	}// end update user generic

	// DELETE ---------------------------------------------------------------

	public static User delete_user(User u1) {
		if (u1 == null) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("crear_abans"));
		} else {
			u1 = null;
		}
		return u1;
	}// end delete user generic

	// FORMAT DE FECHA ------------------------------------------------------

	public static String estandar_fecha = "dd/mm/yyyy";

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

	public static char estandar_moneda = '€';

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

	public static int estandar_decimal = 1;

	public static void decimal() {
		int menu = 0;
		String[] opcions = { "1", "2", "3" };

		menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("seleccio_decimals"),
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

}
