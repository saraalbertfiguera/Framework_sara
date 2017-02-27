package framework_sara.Module.User.Model.BLL.BLL_dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import framework_sara.main_exer3;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.Singleton;
import framework_sara.Module.User.Model.DAO.Funcions_user_dummies;
import framework_sara.Module.User.Model.Funcions.Funcions_find;
import framework_sara.classes.Llenguatge.Llenguatge;

public class Funcions_update_dummies {

	public static void update_admin(Admin admin) {

		int location1 = -1;

		if (Singleton.useradmin.isEmpty()) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("crear_abans"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {
			location1 = -1;
			// admin =Funcions_user_dummies.create_adminDni_dummies();
			// location1 = Funcions_find_dummies.find_admin_dummies(admin);
			admin = Funcions_find.IDadmin();
			location1 = Funcions_find.find_admin(admin);
			if (location1 != -1) {
				admin = Singleton.useradmin.get(location1);

				Funcions_user_dummies.update_user(admin);

				Singleton.useradmin.set(location1, admin);// modifica amb la
															// posicio
			} else {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"),
						Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void update_client(Client client) {

		int location1 = -1;

		if (Singleton.useradmin.isEmpty()) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("crear_abans"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {
			location1 = -1;
			// client =Funcions_user_dummies.create_clientDni_dummies();
			// location1 = Funcions_find_dummies.find_client_dummies(client);
			client = Funcions_find.IDclient();
			location1 = Funcions_find.find_client(client);
			if (location1 != -1) {
				client = Singleton.userclient.get(location1);

				Funcions_user_dummies.update_user(client);

				Singleton.userclient.set(location1, client);// modifica amb la
															// posicio
			} else {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"),
						Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void update_normal(Normal normal) {

		int location1 = -1;

		if (Singleton.useradmin.isEmpty()) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("crear_abans"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {
			location1 = -1;
			// normal =Funcions_user_dummies.create_normalDni_dummies();
			// location1 = Funcions_find_dummies.find_normal_dummies(normal);
			normal = Funcions_find.IDnormal();
			location1 = Funcions_find.find_normal(normal);
			if (location1 != -1) {
				normal = Singleton.usernormal.get(location1);

				Funcions_user_dummies.update_user(normal);

				Singleton.usernormal.set(location1, normal);// modifica amb la
															// posicio
			} else {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"),
						Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
