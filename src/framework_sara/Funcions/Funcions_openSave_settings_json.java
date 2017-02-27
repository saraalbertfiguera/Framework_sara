package framework_sara.Funcions;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;

public class Funcions_openSave_settings_json {

	public static void guardar_Json_auto() {

		String PATH = null;
		try {

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/framework_sara/Fitxer_settings/Fitxer_settings.json";
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error_guardar_json"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

		try {

			XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
			xstreamjson.setMode(XStream.NO_REFERENCES);
			xstreamjson.alias("Settings", Settings.class);

			Gson gson = new Gson();
			String json = gson.toJson(Settings.getInstance());
			FileWriter fileXml = new FileWriter(PATH);

			fileXml = new FileWriter(PATH);
			fileXml.write(json.toString());
			fileXml.close();

			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("set_guardats"),
					Llenguatge.getInstance().getProperty("arxiu_json"), JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("set_no_guardats"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}

	}

	public static void obrir_json_auto() {
		String PATH = null;
		Settings settings = null;
		try {

			XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
			xstreamjson.setMode(XStream.NO_REFERENCES);
			xstreamjson.alias("Settings", Settings.class);

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/framework_sara/Fitxer_settings/Fitxer_settings.json";

			JsonReader lector = new JsonReader(new FileReader(PATH));
			JsonParser parseador = new JsonParser();
			JsonElement raiz = parseador.parse(lector);

			Gson JSON = new Gson();
			settings = JSON.fromJson(raiz, Settings.class);
			Settings.getInstance().setmoneda(settings.getmoneda());
			Settings.getInstance().setdecimal(settings.getdecimal());
			Settings.getInstance().setformat_fecha(settings.getformat_fecha());
			Settings.getInstance().setidioma(settings.getidioma());
			Settings.getInstance().setdummies(settings.getdummies());
			Settings.getInstance().setfitxers(settings.getfitxers());
			Settings.getInstance().setTheme(settings.gettema());

			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("set_carregats"),
					Llenguatge.getInstance().getProperty("arxiu_json"), JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("set_no_carregats"),
					Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);

		}

	}

}
