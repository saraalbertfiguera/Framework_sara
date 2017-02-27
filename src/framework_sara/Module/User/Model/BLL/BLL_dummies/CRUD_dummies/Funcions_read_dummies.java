package framework_sara.Module.User.Model.BLL.BLL_dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import framework_sara.main_exer3;
import framework_sara.Funcions.Funcions;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.Singleton;
import framework_sara.Module.User.Model.Funcions.Funcions_find;
import framework_sara.classes.Llenguatge.Llenguatge;

public class Funcions_read_dummies {

	public static void read_admin(Admin admin) {

		int location = -1;
		int opcions2 = 0;
		String[] menu2 = { Llenguatge.getInstance().getProperty("llegir_totsadmin"),
				Llenguatge.getInstance().getProperty("llegir_unadmin") };

		if (Singleton.useradmin.isEmpty()) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("crear_abans"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {

			opcions2 = Funcions.menu(menu2, Llenguatge.getInstance().getProperty("seleccio_opcio"),
					Llenguatge.getInstance().getProperty("menu"));
			switch (opcions2) {
			case 0:
				for (int i = 0; i < Singleton.useradmin.size(); i++) {
					String cad = "";
					cad = cad + (Singleton.useradmin.get(i).tostring());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				location = -1;
				// admin = Funcions_user_dummies.create_adminDni_dummies();
				// location = Funcions_find_dummies.find_admin_dummies(admin);
				admin = Funcions_find.IDadmin();
				location = Funcions_find.find_admin(admin);
				if (location != -1) { // existeix l'usuari
					admin = Singleton.useradmin.get(location);
					JOptionPane.showMessageDialog(null, admin.tostring());
				} else {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("no_exist"),
							Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
				}
				break;
			}

		}
	}

	public static void read_client(Client client) {

		int location = -1;
		int opcions2 = 0;
		String[] menu2 = { Llenguatge.getInstance().getProperty("llegir_totsclient"),
				Llenguatge.getInstance().getProperty("llegir_unclient") };

		if (Singleton.userclient.isEmpty()) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("no_exist"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {

			opcions2 = Funcions.menu(menu2, Llenguatge.getInstance().getProperty("seleccio_opcio"),
					Llenguatge.getInstance().getProperty("menu"));
			switch (opcions2) {
			case 0:
				for (int i = 0; i < Singleton.userclient.size(); i++) {
					String cad = "";
					cad = cad + (Singleton.userclient.get(i).tostring());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				location = -1;
				// client = Funcions_user_dummies.create_clientDni_dummies();
				// location = Funcions_find_dummies.find_client_dummies(client);
				client = Funcions_find.IDclient();
				location = Funcions_find.find_client(client);

				if (location != -1) { // existeix l'usuari
					client = Singleton.userclient.get(location);
					JOptionPane.showMessageDialog(null, client.tostring());
				} else {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("no_exist"),
							Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
				}
				break;
			}

		}
	}

	public static void read_normal(Normal normal) {

		int location = -1;
		int opcions2 = 0;
		String[] menu2 = { Llenguatge.getInstance().getProperty("llegir_totnormal"),
				Llenguatge.getInstance().getProperty("llegir_unnormal") };

		if (Singleton.usernormal.isEmpty()) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("no_exist"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {
			opcions2 = Funcions.menu(menu2, Llenguatge.getInstance().getProperty("seleccio_opcio"),
					Llenguatge.getInstance().getProperty("menu"));

			switch (opcions2) {
			case 0:
				for (int i = 0; i < Singleton.usernormal.size(); i++) {
					String cad = "";
					cad = cad + (Singleton.usernormal.get(i).tostring());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				location = -1;
				// normal = Funcions_user_dummies.create_normalDni_dummies();
				// location = Funcions_find_dummies.find_normal_dummies(normal);
				normal = Funcions_find.IDnormal();
				location = Funcions_find.find_normal(normal);

				if (location != -1) { // existeix l'usuari
					normal = Singleton.usernormal.get(location);
					JOptionPane.showMessageDialog(null, normal.tostring());
				} else {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("no_exist"),
							Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
				}
				break;
			}

		}
	}

}
