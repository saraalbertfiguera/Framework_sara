package framework_sara.Module.User.Model.BLL.BLL_dummies.CRUD_dummies;

import java.util.Collections;

import javax.swing.JOptionPane;

import framework_sara.Main_dummies;
import framework_sara.Funcions.Funcions;
import framework_sara.Module.User.Model.Classes.Singleton;
import framework_sara.Module.User.Model.Classes.Order.Order_comentaris;
import framework_sara.Module.User.Model.Classes.Order.Order_edat;
import framework_sara.Module.User.Model.Classes.Order.Order_fechaCont;
import framework_sara.Module.User.Model.Classes.Order.Order_fechaNaixement;
import framework_sara.Module.User.Model.Classes.Order.Order_nom;
import framework_sara.Module.User.Model.Classes.Order.Order_punts;
import framework_sara.classes.Llenguatge.Llenguatge;
import framework_sara.Main_dummies;

public class Funcions_order_dummies {

	public static void order_admin_dummies() {
		String[] opcions = { "A) " + Llenguatge.getInstance().getProperty("dni"),
				"B) " + Llenguatge.getInstance().getProperty("nom"),
				"C) " + Llenguatge.getInstance().getProperty("edat"),
				"D) " + Llenguatge.getInstance().getProperty("fechaNaixement"),
				"E) " + Llenguatge.getInstance().getProperty("fechaCont") };
		String menu = "";
		char order = ' ';

		if (Singleton.useradmin.isEmpty()) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("crear_abans"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {
			menu = Funcions.menubox(opcions, Llenguatge.getInstance().getProperty("menu"),
					Llenguatge.getInstance().getProperty("order_camp"));
			order = menu.charAt(0);
			switch (order) {
			case 'A':
				Collections.sort(Singleton.useradmin);
				break;
			case 'B':
				Collections.sort(Singleton.useradmin, new Order_nom());
				break;
			case 'C':
				Collections.sort(Singleton.useradmin, new Order_edat());
				break;
			case 'D':
				Collections.sort(Singleton.useradmin, new Order_fechaNaixement());
				break;
			case 'E':
				Collections.sort(Singleton.useradmin, new Order_fechaCont());

				break;

			}
		}
	}

	public static void order_client() {
		String[] opcions = { "A) " + Llenguatge.getInstance().getProperty("dni"),
				"B) " + Llenguatge.getInstance().getProperty("nom"),
				"C) " + Llenguatge.getInstance().getProperty("edat"),
				"D)" + Llenguatge.getInstance().getProperty("fechaNaixement") };
		String menu = "";
		char order = ' ';

		if (Singleton.useradmin.isEmpty()) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("crear_abans"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {
			menu = Funcions.menubox(opcions, Llenguatge.getInstance().getProperty("menu"),
					Llenguatge.getInstance().getProperty("order_camp"));

			order = menu.charAt(0);
			switch (order) {
			case 'A':
				Collections.sort(Singleton.userclient);
				break;
			case 'B':
				Collections.sort(Singleton.userclient, new Order_nom());
				break;
			case 'C':
				Collections.sort(Singleton.userclient, new Order_edat());
				break;
			case 'D':
				Collections.sort(Singleton.userclient, new Order_fechaNaixement());
				break;

			}
		}
	}

	public static void order_normal() {
		String[] opcions = { "A) " + Llenguatge.getInstance().getProperty("dni"),
				"B) " + Llenguatge.getInstance().getProperty("nom"),
				"C) " + Llenguatge.getInstance().getProperty("cognoms"),
				"D) " + Llenguatge.getInstance().getProperty("edat"),
				"E) " + Llenguatge.getInstance().getProperty("fechaNaixement"),
				"F) " + Llenguatge.getInstance().getProperty("punts"),
				"G) " + Llenguatge.getInstance().getProperty("comentaris") };
		String menu = "";
		char order = ' ';

		if (Singleton.useradmin.isEmpty()) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("crear_abans"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {
			menu = Funcions.menubox(opcions, Llenguatge.getInstance().getProperty("menu"),
					Llenguatge.getInstance().getProperty("order_camp"));

			order = menu.charAt(0);
			switch (order) {
			case 'A':
				Collections.sort(Singleton.usernormal);
				break;
			case 'B':
				Collections.sort(Singleton.usernormal, new Order_nom());
				break;
			case 'C':
				Collections.sort(Singleton.usernormal, new Order_edat());
				break;
			case 'D':
				Collections.sort(Singleton.usernormal, new Order_fechaNaixement());
				break;
			case 'E':
				Collections.sort(Singleton.usernormal, new Order_punts());
				break;
			case 'F':
				Collections.sort(Singleton.usernormal, new Order_comentaris());
				break;

			}
		}
	}

}
