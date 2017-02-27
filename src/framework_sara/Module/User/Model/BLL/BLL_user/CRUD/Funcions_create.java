package framework_sara.Module.User.Model.BLL.BLL_user.CRUD;

import javax.swing.JOptionPane;

import framework_sara.main_exer3;
import framework_sara.Funcions.Funcions;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.Singleton;
import framework_sara.Module.User.Model.Classes.User;
import framework_sara.Module.User.Model.DAO.Funcions_users;
import framework_sara.Module.User.Model.Funcions.Funcions_find;
import framework_sara.classes.Llenguatge.Llenguatge;

public class Funcions_create {
	// 49264129S
	public static void crear_admin(User admin) {

		int location = -1;

		int opcions3 = 0;
		String[] menu = { Llenguatge.getInstance().getProperty("si"), Llenguatge.getInstance().getProperty("no") };

		admin = Funcions_users.create_adminDni();// primera introduccio del dni

		location = Funcions_find.find_admin((Admin) admin);// busca si existeix

		if (location != -1) {// si ja existeix
			opcions3 = Funcions.menu(menu, Llenguatge.getInstance().getProperty("ja_exist"),
					Llenguatge.getInstance().getProperty("error"));// ja
																	// existeix,vol
																	// veure la
																	// informacio
																	// daquest
																	// usuari?

			switch (opcions3) { 
			case 0:
				admin = Singleton.useradmin.get(location);
				JOptionPane.showMessageDialog(null, admin.tostring());

				break;
			case 1:

				break;
			}// -----------------------------------------------------------------------------------------

		} else {// si no existeix

			admin = Funcions_users.create_admin();
			Singleton.useradmin.add((Admin) admin);

		}
	}

	public static void crear_client(User client) {

		int location = -1;
		int opcions = 0;
		int opcions3 = 0;
		String[] menu = { Llenguatge.getInstance().getProperty("si"), Llenguatge.getInstance().getProperty("no") };

		client = Funcions_users.create_clientDni();// primera introduccio del
													// dni

		location = Funcions_find.find_client((Client) client);

		if (location != -1) {// si ja existeix
			opcions3 = Funcions.menu(menu, Llenguatge.getInstance().getProperty("ja_exist"),
					Llenguatge.getInstance().getProperty("error"));// ja
																	// existeix,vol
																	// veure la
																	// informacio
																	// daquest
																	// usuari?

			switch (opcions3) { // ---------------------------------------------------------------------llevar
								// si no llig el usuari
			case 0:
				client = Singleton.userclient.get(location);
				JOptionPane.showMessageDialog(null, client.tostring());
				break;
			case 1:
				break;
			}// -----------------------------------------------------------------------------------------

		} else {// si no existeix

			client = Funcions_users.create_client();
			Singleton.userclient.add((Client) client);
		}
	}

	public static void crear_normal(User normal) {

		int location = -1;
		int opcions = 0;
		int opcions3 = 0;
		String[] menu = { Llenguatge.getInstance().getProperty("si"), Llenguatge.getInstance().getProperty("no") };

		normal = Funcions_users.create_normalDni();// primera introduccio del
													// dni

		location = Funcions_find.find_normal((Normal) normal);

		if (location != -1) {// si ja existeix
			opcions3 = Funcions.menu(menu, Llenguatge.getInstance().getProperty("ja_exist"),
					Llenguatge.getInstance().getProperty("error"));// ja
																	// existeix,vol
																	// veure la
																	// informacio
																	// daquest
																	// usuari?

			switch (opcions3) { // ---------------------------------------------------------------------llevar
								// si no llig el usuari
			case 0:
				normal = Singleton.usernormal.get(location);
				JOptionPane.showMessageDialog(null, normal.tostring());
				break;
			case 1:
				break;
			}// -----------------------------------------------------------------------------------------

		} else {// si no existeix

			normal = Funcions_users.create_normal();
			Singleton.usernormal.add((Normal) normal);
		}
	}
}