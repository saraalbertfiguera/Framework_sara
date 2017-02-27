package framework_sara;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import framework_sara.Funcions.Format;
import framework_sara.Funcions.Funcions;
import framework_sara.Funcions.Funcions_openSave_settings_json;
import framework_sara.Funcions.Menus;
import framework_sara.Module.User.Model.BLL.BLL_dummies.CRUD_dummies.Funcions_create_dummies;
import framework_sara.Module.User.Model.BLL.BLL_dummies.CRUD_dummies.Funcions_delete_dummies;
import framework_sara.Module.User.Model.BLL.BLL_dummies.CRUD_dummies.Funcions_order_dummies;
import framework_sara.Module.User.Model.BLL.BLL_dummies.CRUD_dummies.Funcions_read_dummies;
import framework_sara.Module.User.Model.BLL.BLL_dummies.CRUD_dummies.Funcions_update_dummies;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Funcions.Funcions_generics_open_save.Funcions_openSave_auto;
import framework_sara.Module.User.Model.Funcions.Funcions_generics_open_save.Funcions_openSave_demand;
import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;


public class Main_dummies {

	// public static Llenguatge idioma = null;
	// public static Settings settings = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op = 0;
		int ops = 0;
		int op3 = 0;
		// User u1 = null;
		Admin admin = null;
		Client client = null;
		Normal normal = null;
	
		Settings.getInstance();

		// idioma = new Llenguatge("valencia"); Ja no creem ací el idioma, el
		// creem en la classe Llenguatge i el cridem desde Settings amb el
		// getInstance
		// settings = new Settings();
		// String cad="";

		

		do {

			Funcions_openSave_auto.Funcions_generic_obrir();

			String[] opcions = { Llenguatge.getInstance().getProperty("admin"),
					Llenguatge.getInstance().getProperty("client"), Llenguatge.getInstance().getProperty("normal"),
					Llenguatge.getInstance().getProperty("opcions"), Llenguatge.getInstance().getProperty("eixir") };
			String[] opcionssec = { Llenguatge.getInstance().getProperty("crud1"),
					Llenguatge.getInstance().getProperty("crud2"), Llenguatge.getInstance().getProperty("crud3"),
					Llenguatge.getInstance().getProperty("crud4"), Llenguatge.getInstance().getProperty("order"),
					Llenguatge.getInstance().getProperty("guardar"), Llenguatge.getInstance().getProperty("obrir"),
					Llenguatge.getInstance().getProperty("eixir") };
			String[] opcions3 = { Llenguatge.getInstance().getProperty("format_fecha"),
					Llenguatge.getInstance().getProperty("moneda"),
					Llenguatge.getInstance().getProperty("format_decimal"),
					Llenguatge.getInstance().getProperty("idioma"),Llenguatge.getInstance().getProperty("no_dummies"),Llenguatge.getInstance().getProperty("seleccio_format"),
					Llenguatge.getInstance().getProperty("tema"),Llenguatge.getInstance().getProperty("eixir") };
			String[] opcions4 = { Llenguatge.getInstance().getProperty("angles"),
					Llenguatge.getInstance().getProperty("valencia"),
					Llenguatge.getInstance().getProperty("castella") };

			ops = 0;
			op = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("seleccio_usuari"),
					Llenguatge.getInstance().getProperty("menu"));

			if ((op == 4) || (op == -1) || (ops == 5)) {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("gracies"),
						Llenguatge.getInstance().getProperty("eixir"), JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			} // end if

			switch (op) {

			case 0: // Admin ---------------------------------------------

				while ((op == 0) && (ops != 7)) {

					ops = Funcions.menu(opcionssec, Llenguatge.getInstance().getProperty("seleccio_opcio"),
							Llenguatge.getInstance().getProperty("usuari_admin"));

					switch (ops) {

					case 0:
						Funcions_create_dummies.crear_admin(admin);

						break;
					case 1:
						Funcions_read_dummies.read_admin(admin);
						break;
					case 2:
						Funcions_update_dummies.update_admin(admin);
						break;
					case 3:
						Funcions_delete_dummies.delete_admin(admin);
						break;
					case 4:
						// order
						Funcions_order_dummies.order_admin_dummies();
						break;
					case 5: // guardar on demand
						Funcions_openSave_demand.Funcions_generic_guardar();
						break;
					case 6:
						Funcions_openSave_demand.Funcions_generic_obrir_demand();
						break;
					case 7:
						Funcions_openSave_auto.Funcions_generic_guardar();
						break;

					}// end switch opss
				} // end while

			case 1: // Client ---------------------------------------------

				while ((op == 1) && (ops != 7)) {

					ops = Funcions.menu(opcionssec, Llenguatge.getInstance().getProperty("seleccio_opcio"),
							Llenguatge.getInstance().getProperty("usuari_client"));

					switch (ops) {

					case 0:
						Funcions_create_dummies.crear_client(client);
					

						break;
					case 1:

						Funcions_read_dummies.read_client(client);
						break;
					case 2:

						Funcions_update_dummies.update_client(client);
						break;
					case 3:
						Funcions_delete_dummies.delete_client(client);
						break;
					case 4:
						// order
						Funcions_order_dummies.order_client();
						break;
					case 5: // guardar on demand
						Funcions_openSave_demand.Funcions_generic_guardar();
					case 6:
						Funcions_openSave_demand.Funcions_generic_obrir_demand();
						break;
						
					case 7:
						Funcions_openSave_auto.Funcions_generic_guardar();
						break;

					}// end switch ops
				} // end while

			case 2: // Normal ---------------------------------------------

				while ((op == 2) && (ops != 7)) {

					ops = Funcions.menu(opcionssec, Llenguatge.getInstance().getProperty("seleccio_opcio"),
							Llenguatge.getInstance().getProperty("usuari_normal"));

					switch (ops) {

					case 0:
						Funcions_create_dummies.crear_normal(normal);

						break;
					case 1:
						Funcions_read_dummies.read_normal(normal);
						break;
					case 2:
						Funcions_update_dummies.update_normal(normal);
						break;
					case 3:
						Funcions_delete_dummies.delete_normal(normal);
						break;
					case 4:
						// order
						Funcions_order_dummies.order_normal();
						break;
					case 5: // guardar on demand
						Funcions_openSave_demand.Funcions_generic_guardar();
					case 6:
						Funcions_openSave_demand.Funcions_generic_obrir_demand();
						break;
					case 7:
						Funcions_openSave_auto.Funcions_generic_guardar();
						break;
					}// end switch op3
				} // end while

			case 3: // Opcions ------------------------------------------
				op3 = 0;

				while ((op == 3) && (op3 != 7)) {

					op3 = Funcions.menu(opcions3, Llenguatge.getInstance().getProperty("seleccio_opcio"),
							Llenguatge.getInstance().getProperty("opcions"));

					switch (op3) {

					case 0:
						Menus.formatFecha();
						break;

					case 1:
						Menus.currency();
						break;
					case 2:
						Menus.decimal();
						break;
					case 3:
						Llenguatge.getInstance().setIdioma(Menus.idioma());
						break;

					case 4:
						Settings.getInstance().setdummies(0);
						//Main_dummies Dummies = new Main_dummies();
					
						main_exer3.main(args);
						break;
					case 5:
						Funcions_openSave_auto.Funcions_fitxers_auto();
						break;
					case 6:
						Format.theme();
						break;
					case 7:
						Funcions_openSave_settings_json.guardar_Json_auto();
						break;
					}
				} // end while

			}// end switch ops

		} while (op != 4);
	}
}
