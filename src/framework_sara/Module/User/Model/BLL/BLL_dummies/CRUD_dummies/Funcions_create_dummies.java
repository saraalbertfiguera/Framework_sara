package framework_sara.Module.User.Model.BLL.BLL_dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import framework_sara.main_exer3;
import framework_sara.Module.User.Model.Classes.User;
import framework_sara.Module.User.Model.DAO.Funcions_user_dummies;
import framework_sara.classes.Settings;


public class Funcions_create_dummies {

	public static void crear_admin(User admin) {

		int location = -1;
		int opcions = 0;
		int opcions3 = 0;
		// String[] menu = { Llenguatge.getInstance().getProperty("si"),
		// Llenguatge.getInstance().getProperty("no") };
		//
		// admin = Funcions_user_dummies.create_adminDni_dummies();// primera
		// introduccio del dni
		//
		// location = Funcions_find_dummies.find_admin_dummies((Admin) admin);//
		// busca si existeix
		//
		// if (location != -1) {// si ja existeix
		// opcions3 = Funcions.menu(menu,
		// Llenguatge.getInstance().getProperty("ja_exist"),
		// Llenguatge.getInstance().getProperty("error"));// ja existeix,vol
		// veure la informacio daquest usuari?
		//
		// switch (opcions) {
		// //---------------------------------------------------------------------llevar
		// si no llig el usuari
		// case 0:
		// admin = Singleton.useradmin.get(location);
		// JOptionPane.showMessageDialog(null, admin.tostring());
		// break;
		// case 1:
		// break;
		// }//-----------------------------------------------------------------------------------------
		//
		// } else {// si no existeix

		Funcions_user_dummies.create_admin();

	}

	public static void crear_client(User client) {

		int location = -1;
		int opcions = 0;
		int opcions3 = 0;
		// String[] menu = {Llenguatge.getInstance().getProperty("si"),
		// Llenguatge.getInstance().getProperty("no") };
		//
		//
		// client = Funcions_user_dummies.create_clientDni_dummies();// primera
		// introduccio del dni
		//
		//
		// location=Funcions_find_dummies.find_client_dummies((Client) client);
		//
		// if (location != -1) {// si ja existeix
		// opcions3 = Funcions.menu(menu,
		// Llenguatge.getInstance().getProperty("ja_exist"),
		// Llenguatge.getInstance().getProperty("error"));// ja existeix,vol
		// veure la informacio daquest usuari?
		//
		// switch (opcions) {
		// //---------------------------------------------------------------------llevar
		// si no llig el usuari
		// case 0:
		// client = Singleton.userclient.get(location);
		// JOptionPane.showMessageDialog(null, client.tostring());
		// break;
		// case 1:
		// break;
		// }//-----------------------------------------------------------------------------------------
		//
		// } else {// si no existeix

		client = Funcions_user_dummies.create_client();

	}

	public static void crear_normal(User normal) {

		int location = -1;
		int opcions = 0;
		int opcions3 = 0;
		// String[] menu = { Llenguatge.getInstance().getProperty("si"),
		// Llenguatge.getInstance().getProperty("no") };
		//
		// //normal = Funcions_user_dummies.create_normalDni_dummies();//
		// primera introduccio del dni
		//
		// location=Funcions_find_dummies.find_normal_dummies((Normal)normal);
		//
		// if (location != -1) {// si ja existeix
		// opcions3 = Funcions.menu(menu,
		// Llenguatge.getInstance().getProperty("ja_exist"),
		// Llenguatge.getInstance().getProperty("error"));// ja existeix,vol
		// veure la informacio daquest usuari?
		//
		// switch (opcions) {
		// //---------------------------------------------------------------------llevar
		// si no llig el usuari
		// case 0:
		// normal = Singleton.usernormal.get(location);
		// JOptionPane.showMessageDialog(null, normal.tostring());
		// break;
		// case 1:
		// break;
		// }//-----------------------------------------------------------------------------------------
		//
		// } else {// si no existeix
		// opcions =
		// Funcions.menu(menu,Llenguatge.getInstance().getProperty("crear_user"),
		// Llenguatge.getInstance().getProperty("nou_normal"));// no existeix,
		// vols crearne un?Menu si o no
		//
		// switch (opcions) {
		// case 0:

		normal = Funcions_user_dummies.create_normal();

		// break;
		// case 1:
		// // opcio no
		// break;
		//
		// }// end switch
		// }
	}
}