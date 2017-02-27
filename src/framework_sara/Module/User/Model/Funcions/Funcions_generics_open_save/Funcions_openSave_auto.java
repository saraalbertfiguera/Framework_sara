package framework_sara.Module.User.Model.Funcions.Funcions_generics_open_save;

import java.awt.HeadlessException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import framework_sara.main_exer3;
import framework_sara.Funcions.Funcions;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.Singleton;
import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;

//---ADMIN----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Funcions_openSave_auto {

	private static final String ENCODING = "UTF-8";

	// JSON
	// ***********************************************************************************************************

	public static ArrayList<Admin> obrir_json_auto_admin() {
		String PATH = null;
		Admin e1 = new Admin("");

		try {

			JsonReader lector = new JsonReader(new FileReader(PATH));
			JsonParser parseador = new JsonParser();
			JsonElement raiz = parseador.parse(lector);

			Gson json = new Gson();
			JsonArray lista = raiz.getAsJsonArray();
			for (JsonElement elemento : lista) {
				e1 = json.fromJson(elemento, Admin.class);
				Singleton.useradmin.clear();
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_llegir_json"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);

		}
		return Singleton.useradmin;
	}

	public static void guardarJson_auto_Admin() {

		String PATH = null;
		try {

			PATH = new java.io.File(".").getCanonicalPath() + "/src/framework_sara/utils/Admin_fitxers/Admin.json";
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_json"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		try {

			// XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
			// streamjson.setMode(XStream.NO_REFERENCES);
			// xstreamjson.alias("Usuarios", Admin.class);

			Gson gson = new Gson();
			String json = gson.toJson(Singleton.useradmin.toString());
			FileWriter fileXml = new FileWriter(PATH);

			fileXml = new FileWriter(PATH);
			fileXml.write(json.toString());
			fileXml.close();

			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("json_guardat"),
					Llenguatge.getInstance().getProperty("arxiu_json"), JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_json"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

	}

	// XML
	// ***********************************************************************************************************

	// ******************** ADMIN

	public static void guardarXml_auto_admin() {

		String PATH = null;
		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/framework_sara/Module/User/Model/Arxius_user/Admin_fitxers/Admin.xml";

		} catch (IOException e) {

		}
		if (Singleton.useradmin.size() > 0) {
			try {

				OutputStream os = new ByteArrayOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				XStream xstream = new XStream();

				Annotations.configureAliases(xstream, Admin.class);
				String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
				xstream.toXML(Singleton.useradmin, osw);
				StringBuffer xml = new StringBuffer();
				xml.append(header);
				xml.append(os.toString());

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_xml"),
						Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
		} else {
			File path = new File(PATH);

		}

	}

	public static ArrayList<Admin> abrirxml_auto_admin() {
		String PATH;

		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, Admin.class);

			PATH = new java.io.File(".").getCanonicalPath() +"/src/framework_sara/Module/User/Model/Arxius_user/Admin_fitxers/Admin.xml";

			File path = new File(PATH);

			if (path.exists()) {
				Singleton.useradmin = (ArrayList<Admin>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_llegir_xml"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		return Singleton.useradmin;

	}

	// ******************** CLIENT

	public static void guardarXml_auto_client() {

		String PATH = null;
		try {
			PATH = new java.io.File(".").getCanonicalPath() +"/src/framework_sara/Module/User/Model/Arxius_user/Client_fitxers/Client.xml";

		} catch (IOException e) {

		}
		if (Singleton.userclient.size() > 0) {
			try {

				OutputStream os = new ByteArrayOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				XStream xstream = new XStream();

				Annotations.configureAliases(xstream, Client.class);
				String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
				xstream.toXML(Singleton.userclient, osw);
				StringBuffer xml = new StringBuffer();
				xml.append(header);
				xml.append(os.toString());

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_xml"),
						Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
		} else {
			File path = new File(PATH);

		}

	}

	public static ArrayList<Client> abrirxml_auto_client() {
		String PATH;

		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, Client.class);

			PATH = new java.io.File(".").getCanonicalPath() + "/src/framework_sara/Module/User/Model/Arxius_user/Client_fitxers/Client.xml";

			File path = new File(PATH);

			if (path.exists()) {
				Singleton.userclient = (ArrayList<Client>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_llegir_xml"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		return Singleton.userclient;

	}

	// ******************** NORMAL

	public static void guardarXml_auto_normal() {

		String PATH = null;
		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/framework_sara/Module/User/Model/Arxius_user/Normal_fitxers/Normal.xml";

		} catch (IOException e) {

		}
		if (Singleton.usernormal.size() > 0) {
			try {

				OutputStream os = new ByteArrayOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				XStream xstream = new XStream();

				Annotations.configureAliases(xstream, Normal.class);
				String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
				xstream.toXML(Singleton.usernormal, osw);
				StringBuffer xml = new StringBuffer();
				xml.append(header);
				xml.append(os.toString());

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_xml"),
						Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
		} else {
			File path = new File(PATH);

		}

	}

	public static ArrayList<Normal> abrirxml_auto_normal() {
		String PATH;

		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, Normal.class);

			PATH = new java.io.File(".").getCanonicalPath() + "/src/framework_sara/Module/User/Model/Arxius_user/Normal_fitxers/Normal.xml";

			File path = new File(PATH);

			if (path.exists()) {
				Singleton.usernormal = (ArrayList<Normal>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_llegir_xml"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		return Singleton.usernormal;

	}

	// TXT
	// ***********************************************************************************************************

	// ******************** ADMIN

	public static void guardartxt_auto_admin() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath() +"/src/framework_sara/Module/User/Model/Arxius_user/Admin_fitxers/Admin.txt";

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		try {

			File j;
			j = new File(PATH);
			FileOutputStream fitx = new FileOutputStream(j);
			ObjectOutputStream s = new ObjectOutputStream(fitx);
			s.writeObject(Singleton.useradmin);
			s.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
	}

	public static ArrayList<Admin> obri_txt_auto_admin() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/framework_sara/Module/User/Model/Arxius_user/Admin_fitxers/Admin.txt";

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_llegir_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		try {
			File f;

			f = new File(PATH);

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Singleton.useradmin = (ArrayList<Admin>) oi.readObject();
			oi.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_llegir_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		return Singleton.useradmin;
	}

	// ******************** CLIENT

	public static void guardartxt_auto_client() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/framework_sara/Module/User/Model/Arxius_user/Client_fitxers/Client.txt";

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		try {

			File j;
			j = new File(PATH);
			FileOutputStream fitx = new FileOutputStream(j);
			ObjectOutputStream s = new ObjectOutputStream(fitx);
			s.writeObject(Singleton.userclient);
			s.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
	}

	public static ArrayList<Client> obri_txt_auto_client() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/framework_sara/Module/User/Model/Arxius_user/Client_fitxers/Client.txt";

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_llegir_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		try {
			File f;

			f = new File(PATH);

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Singleton.userclient = (ArrayList<Client>) oi.readObject();
			oi.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_llegir_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		return Singleton.userclient;
	}

	// ******************** NORMAL

	public static void guardartxt_auto_normal() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/framework_sara/Module/User/Model/Arxius_user/Normal_fitxers/Normal.txt";

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		try {

			File j;
			j = new File(PATH);
			FileOutputStream fitx = new FileOutputStream(j);
			ObjectOutputStream s = new ObjectOutputStream(fitx);
			s.writeObject(Singleton.usernormal);
			s.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
	}

	public static ArrayList<Normal> obri_txt_auto_normal() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/framework_sara/Module/User/Model/Arxius_user/Normal_fitxers/Normal.txt";

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_llegir_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		try {
			File f;

			f = new File(PATH);

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Singleton.usernormal = (ArrayList<Normal>) oi.readObject();
			oi.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_llegir_txt"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		return Singleton.usernormal;
	}

	// GENERIQUES
	// ***********************************************************************************************************

	public static void Funcions_fitxers_auto() {
		String[] opcions = { "XML", "TXT " };
		int fitx = 0;

		fitx = Funcions.menu(opcions, Llenguatge.getInstance().getProperty("seleccio_format"),
				Llenguatge.getInstance().getProperty("fitxers"));

		switch (fitx) {

		case 0:// xml
			Settings.getInstance().setfitxers(0);
			break;
		case 1:// txt
			Settings.getInstance().setfitxers(1);
			break;
		}

	}

	public static void Funcions_generic_obrir() {
		int set = Settings.getInstance().getfitxers();

		switch (set) {
		case 0:
			Singleton.useradmin = Funcions_openSave_auto.abrirxml_auto_admin();
			Singleton.userclient = Funcions_openSave_auto.abrirxml_auto_client();
			Singleton.usernormal = Funcions_openSave_auto.abrirxml_auto_normal();
			break;
		case 1:
			Singleton.useradmin = Funcions_openSave_auto.obri_txt_auto_admin();
			Singleton.userclient = Funcions_openSave_auto.obri_txt_auto_client();
			Singleton.usernormal = Funcions_openSave_auto.obri_txt_auto_normal();
			break;
		}
	}

	public static void Funcions_generic_guardar() {
		int set = Settings.getInstance().getfitxers();

		switch (set) {
		case 0:
			Funcions_openSave_auto.guardarXml_auto_admin();
			Funcions_openSave_auto.guardarXml_auto_client();
			Funcions_openSave_auto.guardarXml_auto_normal();

			break;
		case 1:
			Funcions_openSave_auto.guardartxt_auto_admin();
			Funcions_openSave_auto.guardartxt_auto_client();
			Funcions_openSave_auto.guardartxt_auto_normal();
			break;
		}
	}

}
