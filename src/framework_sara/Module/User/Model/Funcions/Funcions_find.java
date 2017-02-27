package framework_sara.Module.User.Model.Funcions;

import framework_sara.Funcions.Funcions;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.Singleton;
import framework_sara.classes.Llenguatge.Llenguatge;

public class Funcions_find {

	public static int find_admin(Admin admin) {
		for (int i = 0; i <= (Singleton.useradmin.size() - 1); i++) {
			if ((Singleton.useradmin.get(i)).equals(admin))
				return i;
		}
		return -1;
	}

	public static int find_client(Client client) {
		for (int i = 0; i <= (Singleton.userclient.size() - 1); i++) {
			if ((Singleton.userclient.get(i)).equals(client))
				return i;
		}
		return -1;
	}

	public static int find_normal(Normal normal) {
		for (int i = 0; i <= (Singleton.usernormal.size() - 1); i++) {
			if ((Singleton.usernormal.get(i)).equals(normal))
				return i;
		}
		return -1;
	}

	public static String[] generate_vector_admin() {
		Admin a1 = null;
		String s = "";
		int arraylist = Singleton.useradmin.size();
		String[] user = new String[arraylist];
		for (int i = 0; i < arraylist; i++) {
			a1 = (Admin) Singleton.useradmin.get(i);
			s = a1.getdni() + "-" + a1.getnom();
			user[i] = s;
		}

		return user;
	}

	public static String[] generate_vector_client() {
		Client c1 = null;
		String s = "";
		int arraylist = Singleton.userclient.size();
		String[] user = new String[arraylist];
		for (int i = 0; i < arraylist; i++) {
			c1 = (Client) Singleton.userclient.get(i);
			s = c1.getdni() + "-" + c1.getnom();
			user[i] = s;
		}

		return user;
	}

	public static String[] generate_vector_normal() {
		Normal u1 = null;
		String s = "";
		int arraylist = Singleton.usernormal.size();
		String[] user = new String[arraylist];
		for (int i = 0; i < arraylist; i++) {
			u1 = (Normal) Singleton.usernormal.get(i);
			s = u1.getdni() + "-" + u1.getnom();
			user[i] = s;
		}

		return user;
	}

	public static Admin IDadmin() {
		Admin a1 = null;
		String ID = "";
		String[] admin = generate_vector_admin();
		String search = Funcions.menubox(admin, Llenguatge.getInstance().getProperty("seleccio_opcio"),
				Llenguatge.getInstance().getProperty("menu"));
		if (search != "") {
			for (int i = 0; i < 9; i++) {
				ID += search.charAt(i);
			}
			a1 = new Admin(ID);
		}
		return a1;
	}

	public static Client IDclient() {
		Client c1 = null;
		String ID = "";
		String[] client = generate_vector_client();
		String search = Funcions.menubox(client, Llenguatge.getInstance().getProperty("seleccio_opcio"),
				Llenguatge.getInstance().getProperty("menu"));
		if (search != "") {
			for (int i = 0; i < 9; i++) {
				ID += search.charAt(i);
			}
			c1 = new Client(ID);
		}
		return c1;
	}

	public static Normal IDnormal() {
		Normal u1 = null;
		String ID = "";
		String[] normal = generate_vector_normal();
		String search = Funcions.menubox(normal, Llenguatge.getInstance().getProperty("seleccio_opcio"),
				Llenguatge.getInstance().getProperty("menu"));
		if (search != "") {
			for (int i = 0; i < 9; i++) {
				ID += search.charAt(i);
			}
			u1 = new Normal(ID);
		}
		return u1;
	}

}
