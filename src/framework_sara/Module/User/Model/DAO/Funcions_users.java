package framework_sara.Module.User.Model.DAO;

import javax.swing.JOptionPane;

import framework_sara.classes.Fecha;

import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;
import framework_sara.Main_dummies;
import framework_sara.main_exer3;
import framework_sara.Funcions.Funcions;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.User;
import framework_sara.Module.User.Model.Funcions.Funcions_dades_user;
import framework_sara.Module.User.Model.Funcions.Funcions_fecha_user;

//import javax.swing.JOptionPane;

public class Funcions_users {

	// CREATE --------------------------------------------------------------

	public static Admin create_admin() {
		Admin u1 = null;

		String dni = Funcions_dades_user.askdni();
		String nom = Funcions_dades_user.asknom();
		String adreca = Funcions_dades_user.askadreca();
		String sexe = Funcions_dades_user.asksexe();
		// String tipo = Funcions.askstring("Introduce your user
		// type","Questionnaire");
		Fecha fechaNaixement = Funcions_fecha_user.ask_FechaNaixement();
		String email = Funcions_dades_user.askemail();
		String usuari = Funcions_dades_user.askusuari();
		String password = Funcions_dades_user.askcontrasenya();
		String movil = Funcions_dades_user.asktel();
		String localitat = Funcions_dades_user.asklocalitat();
		String provincia = Funcions_dades_user.askprovincia();
		String codipost = Funcions_dades_user.askcodipost();
		Fecha fechaContratacion = Funcions_fecha_user.ask_FechaContratacio(fechaNaixement);

		u1 = new Admin(dni, nom, adreca, sexe, fechaNaixement, email, usuari, password, movil, localitat, provincia,
				codipost, fechaContratacion);

		return u1;
	}// end create admin

	public static Admin create_adminDni() {
		Admin u1 = null;
		String dni = Funcions_dades_user.askdni2();
		u1 = new Admin(dni);
		return u1;
	}
	// -------------------------------------------------------------------------------------

	public static Client create_client() {
		Client u1 = null;

		String dni = Funcions_dades_user.askdni();
		String nom = Funcions_dades_user.asknom();
		String adreca = Funcions_dades_user.askadreca();
		String sexe = Funcions_dades_user.asksexe();
		// String tipo = Funcions.askstring("Introduce your user
		// type","Questionnaire");
		Fecha fechaNacimiento = Funcions_fecha_user.ask_FechaNaixement();
		String email = Funcions_dades_user.askemail();
		String usuari = Funcions_dades_user.askusuari();
		String password = Funcions_dades_user.askcontrasenya();
		String movil = Funcions_dades_user.askmovil();
		String localitat = Funcions_dades_user.asklocalitat();
		String provincia = Funcions_dades_user.askprovincia();
		String codipost = Funcions_dades_user.askcodipost();
		String telefon = Funcions_dades_user.asktel();
		// Fecha fechaAlta = new Fecha(Funcions_dades_user.askfecha(3));
		int num_compres = Funcions_dades_user.asknum_compres();
		u1 = new Client(dni, nom, adreca, sexe, fechaNacimiento, email, usuari, password, movil, localitat, provincia,
				codipost, telefon, num_compres);
		return u1;
	}// end create client

	public static Client create_clientDni() {
		Client u1 = null;
		String dni = Funcions_dades_user.askdni2();
		u1 = new Client(dni);
		return u1;
	}

	// ---------------------------------------------------------------------------

	public static Normal create_normal() {
		Normal u1 = null;

		String dni = Funcions_dades_user.askdni();
		String nom = Funcions_dades_user.asknom();
		String adreca = Funcions_dades_user.askadreca();
		String sexe = Funcions_dades_user.asksexe();
		Fecha fechaNacimiento = Funcions_fecha_user.ask_FechaNaixement();
		String cognoms = Funcions_dades_user.askcognoms();
		String localitat = Funcions_dades_user.asklocalitat();
		int comentaris = Funcions_dades_user.askcomentaris();

		u1 = new Normal(dni, nom, adreca, sexe, fechaNacimiento, cognoms, localitat, comentaris);
		return u1;
	}// end create normal

	public static Normal create_normalDni() {
		Normal u1 = null;
		String dni = Funcions_dades_user.askdni2();
		u1 = new Normal(dni);
		return u1;
	}

	// ----------------------------------------------------------------------

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
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("cerar_abans"));
		} else {

			if (u1 instanceof Admin) {
				cad = ((Admin) u1).tostring();
			} // end if

			if (u1 instanceof Client) {
				cad = ((Client) u1).tostring();
				// JOptionPane.showMessageDialog(null, cad);
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
				int dummies = Settings.getInstance().getdummies();
				if (dummies == 0) {
					String opcions[] = { Llenguatge.getInstance().getProperty("dni"),
							Llenguatge.getInstance().getProperty("nom"), Llenguatge.getInstance().getProperty("adreca"),
							Llenguatge.getInstance().getProperty("sexe"),
							Llenguatge.getInstance().getProperty("fechaNaixement"),
							Llenguatge.getInstance().getProperty("email"),
							Llenguatge.getInstance().getProperty("usuari"),
							Llenguatge.getInstance().getProperty("password"),
							Llenguatge.getInstance().getProperty("movil"),
							Llenguatge.getInstance().getProperty("localitat"),
							Llenguatge.getInstance().getProperty("provincia"),
							Llenguatge.getInstance().getProperty("codipost"),
							Llenguatge.getInstance().getProperty("fechaCont") };
					menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("canvi_camp"),
							Llenguatge.getInstance().getProperty("crud3"));

				} else {
					String opcions[] = { Llenguatge.getInstance().getProperty("dni"),  Llenguatge.getInstance().getProperty("nom"),
							 Llenguatge.getInstance().getProperty("adreca"), Llenguatge.getInstance().getProperty("sexe"),
							 Llenguatge.getInstance().getProperty("fechaNaixement"), Llenguatge.getInstance().getProperty("email"),
							 Llenguatge.getInstance().getProperty("usuari"), Llenguatge.getInstance().getProperty("password"),
							 Llenguatge.getInstance().getProperty("movil"),  Llenguatge.getInstance().getProperty("localitat"),
							 Llenguatge.getInstance().getProperty("provincia"),  Llenguatge.getInstance().getProperty("codipost"),
							 Llenguatge.getInstance().getProperty("fechaCont") };
					menu = Funcions.menu(opcions,  Llenguatge.getInstance().getProperty("canvi_camp"),
							 Llenguatge.getInstance().getProperty("crud3"));
				} // end else

				switch (menu) {
				case 0:
					u1.setdni(Funcions_dades_user.askdni());
					break;
				case 1:
					u1.setnom(Funcions_dades_user.asknom());
					break;
				case 2:
					u1.setadreca(Funcions_dades_user.askadreca());
					break;

				case 3:
					u1.setsexe(Funcions_dades_user.asksexe());
					break;
				case 4:
					// String fechaNaix = Funcions_dades_user.askfecha(1);
					// Fecha fechaN = new Fecha(fechaNaix);
					// ((Admin) u1).setfechaNaixement(fechaN);
					Fecha fnaix = Funcions_dades_user.update_fechanaix_admin((Admin) u1);
					break;
				case 5:
					((Admin) u1).setemail(Funcions_dades_user.askemail());
					break;
				case 6:
					((Admin) u1).setusuari(Funcions_dades_user.askusuari());
					break;
				case 7:
					((Admin) u1).setpassword(Funcions_dades_user.asknomnums());
					break;
				case 8:
					((Admin) u1).setmovil(Funcions_dades_user.asktel());
					break;
				case 9:
					((Admin) u1).setlocalitat(Funcions_dades_user.asklocalitat());
					break;
				case 10:
					((Admin) u1).setprovincia(Funcions_dades_user.askprovincia());
					break;
				case 11:
					((Admin) u1).setcodipost(Funcions_dades_user.askcodipost());
					break;
				case 12:
					String fechaContr = Funcions_dades_user.askfecha(2);
					Fecha fechaContratacion = new Fecha(fechaContr);
					((Admin) u1).setFechaContratacion(fechaContratacion);
					break;

				}// end if

			} // end switch

			// ----------------update CLIENT

			if (u1 instanceof Client) {
				int dummies = Settings.getInstance().getdummies();
				if (dummies == 0) {
					String opcions[] = { Llenguatge.getInstance().getProperty("dni"),
							Llenguatge.getInstance().getProperty("nom"), Llenguatge.getInstance().getProperty("adreca"),
							Llenguatge.getInstance().getProperty("sexe"),
							Llenguatge.getInstance().getProperty("fechaNaixement"),
							Llenguatge.getInstance().getProperty("email"),
							Llenguatge.getInstance().getProperty("usuari"),
							Llenguatge.getInstance().getProperty("password"),
							Llenguatge.getInstance().getProperty("movil"),
							Llenguatge.getInstance().getProperty("localitat") };
					menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("canvi_camp"),
							Llenguatge.getInstance().getProperty("crud3"));
				} else {
					String opcions[] = { Llenguatge.getInstance().getProperty("dni"),
							Llenguatge.getInstance().getProperty("nom"), Llenguatge.getInstance().getProperty("adreca"),
							Llenguatge.getInstance().getProperty("sexe"),
							Llenguatge.getInstance().getProperty("fechaNaixement"),
							Llenguatge.getInstance().getProperty("email"),
							Llenguatge.getInstance().getProperty("usuari"),
							Llenguatge.getInstance().getProperty("password"),
							Llenguatge.getInstance().getProperty("movil"),
							Llenguatge.getInstance().getProperty("localitat") };
					menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("canvi_camp"),
							Llenguatge.getInstance().getProperty("crud3"));
				}

				switch (menu) {
				case 0:
					u1.setdni(Funcions_dades_user.askdni());
					break;
				case 1:
					u1.setnom(Funcions_dades_user.asknom());
					break;
				case 2:
					u1.setadreca(Funcions_dades_user.askadreca());
					break;
				case 3:
					u1.setsexe(Funcions_dades_user.asksexe());
					break;
				case 4:
					// String fechaNac = Funcions_dades_user.askfecha(1);
					// Fecha fechaN = new Fecha(fechaNac);
					// ((Client) u1).setfechaNaixement(fechaN);
					Fecha fnaix = Funcions_dades_user.update_fechanaix_client((Client) u1);
					break;
				case 5:
					((Client) u1).setemail(Funcions_dades_user.askemail());
					break;
				case 6:
					((Client) u1).setusuari(Funcions_dades_user.askusuari());
					break;
				case 7:
					((Client) u1).setpassword(Funcions_dades_user.asknomnums());
					break;
				case 8:
					((Client) u1).setmovil(Funcions_dades_user.askmovil());
					break;
				case 9:
					((Client) u1).setlocalitat(Funcions_dades_user.asklocalitat());
					break;
				case 10:
					((Client) u1).setprovincia(Funcions_dades_user.askprovincia());
					break;
				case 11:
					((Client) u1).setcodipost(Funcions_dades_user.askcodipost());
					break;
				case 12:
					((Client) u1).settelefon(Funcions_dades_user.asktel());
					break;

				}// end if

			} // end switch

			// ---------------------update NORMAL

			if (u1 instanceof Normal) {
				int dummies = Settings.getInstance().getdummies();

				if (dummies == 0) {

					String opcions[] = { Llenguatge.getInstance().getProperty("dni"),
							Llenguatge.getInstance().getProperty("nom"), Llenguatge.getInstance().getProperty("adreca"),
							Llenguatge.getInstance().getProperty("sexe"),
							Llenguatge.getInstance().getProperty("fechaNaixement"),
							Llenguatge.getInstance().getProperty("email"),
							Llenguatge.getInstance().getProperty("usuari"),
							Llenguatge.getInstance().getProperty("password"),
							Llenguatge.getInstance().getProperty("movil"),
							Llenguatge.getInstance().getProperty("localitat") };

					menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("canvi_camp"),
							Llenguatge.getInstance().getProperty("crud3"));
				} else {
					String opcions[] = {  Llenguatge.getInstance().getProperty("dni"),  Llenguatge.getInstance().getProperty("nom"),
							 Llenguatge.getInstance().getProperty("adreca"), Llenguatge.getInstance().getProperty("sexe"),
							 Llenguatge.getInstance().getProperty("fechaNaixement"), Llenguatge.getInstance().getProperty("email"),
							 Llenguatge.getInstance().getProperty("usuari"), Llenguatge.getInstance().getProperty("password"),
							 Llenguatge.getInstance().getProperty("movil"), Llenguatge.getInstance().getProperty("localitat") };
					menu = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("canvi_camp"),
							 Llenguatge.getInstance().getProperty("crud3"));

				}

				switch (menu) {
				case 0:
					u1.setdni(Funcions_dades_user.askdni());
					break;
				case 1:
					u1.setnom(Funcions_dades_user.asknom());
					break;
				case 2:
					u1.setadreca(Funcions_dades_user.askadreca());
					break;

				case 3:
					u1.setsexe(Funcions_dades_user.asksexe());
					break;
				case 4:
					// Fecha fechaN = Funcions_fecha_user.ask_FechaNaixement();
					// ((Normal) u1).setfechaNaixement(fechaN);
					Fecha fnaix = Funcions_dades_user.update_fechanaix_normal((Normal) u1);

					break;
				case 5:
					((Normal) u1).setcognoms(Funcions_dades_user.askcognoms());
					break;
				case 6:
					((Normal) u1).setlocalitat(Funcions_dades_user.asklocalitat());
					break;

				}// end switch
			} // end if
		} // end else
		return u1;
	}// end update user generic

	// DELETE ---------------------------------------------------------------

	public static User delete_user(User u1) {
		if (u1 == null) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("cerar_abans"));
		} else {
			u1 = null;
		}
		return u1;
	}// end delete user generic

}// end funcions
