package framework_sara.Module.User.Model.BLL.BLL_user.CRUD;

import javax.swing.JOptionPane;

import framework_sara.main_exer3;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.Singleton;
import framework_sara.Module.User.Model.Funcions.Funcions_find;
import framework_sara.classes.Llenguatge.Llenguatge;


public class Funcions_delete {

	public static void delete_admin (Admin admin) {
		
		
		int location = -1;
	
		
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null,Llenguatge.getInstance().getProperty("crear_abans"),Llenguatge.getInstance().getProperty("error"),JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
//			admin = Funcions_users.create_adminDni();
//			location = Funcions_find.find_admin(admin);
			admin = Funcions_find.IDadmin();
			location=Funcions_find.find_admin(admin);
			if (location != -1) {
				Singleton.useradmin.remove(location);
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("usuari_borrat"));
			}else {
				JOptionPane.showMessageDialog(null,"error", "error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void delete_client (Client client) {
		int location = -1;
		
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null,Llenguatge.getInstance().getProperty("crear_abans"),Llenguatge.getInstance().getProperty("error"),JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
//			client = Funcions_users.create_clientDni();
//			location = Funcions_find.find_client(client);
			client = Funcions_find.IDclient();
			location=Funcions_find.find_client(client);
			if (location != -1) {
				Singleton.userclient.remove(location);
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("usuari_borrat"));
			}else {
				JOptionPane.showMessageDialog(null,"error", "error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void delete_normal (Normal normal) {
		int location = -1;
		
		if(Singleton.usernormal.isEmpty()){
			JOptionPane.showMessageDialog(null,Llenguatge.getInstance().getProperty("crear_abans"),Llenguatge.getInstance().getProperty("error"),JOptionPane.ERROR_MESSAGE);
			location = -1;
//			normal = Funcions_users.create_normalDni();
//			location = Funcions_find.find_normal(normal);
			normal = Funcions_find.IDnormal();
			location=Funcions_find.find_normal(normal);
			if (location != -1) {
				Singleton.usernormal.remove(location);
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("usuari_borrat"));
			}else {
				JOptionPane.showMessageDialog(null,"error", "error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
}
