package framework_sara.Module.User.Model.Funcions.Funcions_generics_open_save;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;

import framework_sara.Funcions.Funcions;
import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.Client;
import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.Singleton;
import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;

public class Funcions_openSave_demand {

	private static final String ENCODING = "UTF-8";

	// ---- ADMIN
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// **************** XML ****************

	public static void guarda_xml_admin() {
		String PATH = null;
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

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".xml";

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("xml_guardat"),
						Llenguatge.getInstance().getProperty("arxiu_xml"), JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static ArrayList<Admin> obri_xml_admin() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, Admin.class);

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				Singleton.useradmin = (ArrayList<Admin>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return Singleton.useradmin;
	}

	// **************** TXT ****************

	public static ArrayList<Admin> obri_txt_admin_demand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				f = new File(PATH);

				FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi);
				Singleton.useradmin = (ArrayList<Admin>) oi.readObject();
				oi.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return Singleton.useradmin;
	}

	public static void guarda_txt_admin_demand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".txt";
				f = new File(PATH);

				FileOutputStream fo = new FileOutputStream(f);
				ObjectOutputStream o = new ObjectOutputStream(fo);
				o.writeObject(Singleton.useradmin);
				o.close();
				JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// ---- CLIENT
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// **************** XML ****************

	public static void guarda_xml_client() {
		String PATH = null;
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

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".xml";

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
				JOptionPane.showMessageDialog(null, "Archivo XML guardado con exito", "Archivo XML",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static ArrayList<Client> obri_xml_client() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, Admin.class);

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				Singleton.userclient = (ArrayList<Client>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return Singleton.userclient;
	}

	// **************** TXT ****************

	public static ArrayList<Client> obri_txt_client_demand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				f = new File(PATH);

				FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi);
				Singleton.userclient = (ArrayList<Client>) oi.readObject();
				oi.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return Singleton.userclient;
	}

	public static void guarda_txt_client_demand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".txt";
				f = new File(PATH);

				FileOutputStream fo = new FileOutputStream(f);
				ObjectOutputStream o = new ObjectOutputStream(fo);
				o.writeObject(Singleton.userclient);
				o.close();
				JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// ---- NORMAL
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// **************** XML ****************

	public static void guarda_xml_normal() {
		String PATH = null;
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

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".xml";

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
				JOptionPane.showMessageDialog(null, "Archivo XML guardado con exito", "Archivo XML",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static ArrayList<Normal> obri_xml_normal() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, Normal.class);

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				Singleton.usernormal = (ArrayList<Normal>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return Singleton.usernormal;
	}

	// **************** TXT ****************

	public static ArrayList<Normal> obri_txt_normal_demand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				f = new File(PATH);

				FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi);
				Singleton.usernormal = (ArrayList<Normal>) oi.readObject();
				oi.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return Singleton.usernormal;
	}

	public static void guarda_txt_normal_demand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".txt";
				f = new File(PATH);

				FileOutputStream fo = new FileOutputStream(f);
				ObjectOutputStream o = new ObjectOutputStream(fo);
				o.writeObject(Singleton.usernormal);
				o.close();
				JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// GENERIQUES
	// ***********************************************************************************************************

	public static void Funcions_fitxers_demand() {
		String[] opcions = { "XML", "txt" };
		int fitx = 0;

		fitx = Funcions.menu(opcions, "Selecciona un format", "Fitxers");

		switch (fitx) {

		case 0:// xml
			Settings.getInstance().setfitxers(0);
			break;
		case 1:// txt
			Settings.getInstance().setfitxers(1);
			break;
		}

	}

	public static void Funcions_generic_obrir_demand() {
		int set = Settings.getInstance().getfitxers();

		switch (set) {
		case 0:
			Singleton.useradmin = Funcions_openSave_demand.obri_xml_admin();
			Singleton.userclient = Funcions_openSave_demand.obri_xml_client();
			Singleton.usernormal = Funcions_openSave_demand.obri_xml_normal();
			break;
		case 1:
			Singleton.useradmin = Funcions_openSave_demand.obri_txt_admin_demand();
			Singleton.userclient = Funcions_openSave_demand.obri_txt_client_demand();
			Singleton.usernormal = Funcions_openSave_demand.obri_txt_normal_demand();
			break;
		}
	}

	public static void Funcions_generic_guardar() {
		int set = Settings.getInstance().getfitxers();

		switch (set) {
		case 0:
			Funcions_openSave_demand.guarda_xml_admin();
			Funcions_openSave_demand.guarda_xml_client();
			Funcions_openSave_demand.guarda_xml_normal();

			break;
		case 1:
			Funcions_openSave_demand.guarda_txt_admin_demand();
			Funcions_openSave_demand.guarda_txt_client_demand();
			Funcions_openSave_demand.guarda_txt_normal_demand();
			break;
		}
	}

}
