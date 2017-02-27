package framework_sara.Module.User.Model.Funcions;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.swing.JOptionPane;

import framework_sara.classes.Fecha;
import framework_sara.classes.Settings;

public class Funcions_dummies {

	public static String dni(int dni) {
		String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";
		return String.valueOf(dni) + NIF_STRING_ASOCIATION.charAt(dni % 23);
	}

	public static String DNI() {
		String cad = "";
		long time = new java.util.GregorianCalendar().getTimeInMillis();
		Random random = new Random(time);
		while (cad.length() < 8) {
			char c = (char) random.nextInt(255);
			if ((c >= '1' && c <= '9')) {
				cad += c;
			}
		}
		int numberdni = Integer.parseInt(cad);
		return dni(numberdni);
	}

	public static String usuari() {
		String user = "";
		String[] users = { "vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe", "jaume",
				"sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina", "pepe", "oscar",
				"lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria", "elena", "beltran",
				"pablo", "juanjo" };

		int position = (int) (Math.random() * 222) % 10;
		return user = users[position];
	}

	public static String password() {
		String pass = "";
		String[] passwords = { "vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe",
				"jaume", "sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina", "pepe",
				"oscar", "lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria", "elena",
				"beltran", "pablo", "juanjo" };

		int position = (int) (Math.random() * 222) % 10;
		return pass = passwords[position];
	}

	public static String nom() {
		String name = "";
		String[] names = { "vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe", "jaume",
				"sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina", "pepe", "oscar",
				"lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria", "elena", "beltran",
				"pablo", "juanjo" };

		int position = (int) (Math.random() * 222) % 10;
		return name = names[position];
	}

	public static String adreca() {
		String surname = "";
		String[] surnames = { "alfonso", "aliaga", "bas", "bataller", "boluda", "conesa", "camarena", "cucart", "doria",
				"ferrero", "garcia", "figuera", "tormo", "montagud", "gramage", "ubeda", "revert", "cordoba", "sempere",
				"martinez", "lopez", "albuixech", "torro", "belda", "mateu", "ribera", "satorres", "rubio", "cifuentes",
				"frances", "gomez", "mico", "ferrandiz", "casanova" };

		int position = (int) (Math.random() * 222) % 10;
		return surname = surnames[position];
	}

	public static String cognoms() {
		String surname = "";
		String[] surnames = { "alfonso", "aliaga", "bas", "bataller", "boluda", "conesa", "camarena", "cucart", "doria",
				"ferrero", "garcia", "figuera", "tormo", "montagud", "gramage", "ubeda", "revert", "cordoba", "sempere",
				"martinez", "lopez", "albuixech", "torro", "belda", "mateu", "ribera", "satorres", "rubio", "cifuentes",
				"frances", "gomez", "mico", "ferrandiz", "casanova" };

		int position = (int) (Math.random() * 222) % 10;
		return surname = surnames[position];
	}

	public static String localitat() {
		String surname = "";
		String[] surnames = { "alfonso", "aliaga", "bas", "bataller", "boluda", "conesa", "camarena", "cucart", "doria",
				"ferrero", "garcia", "figuera", "tormo", "montagud", "gramage", "ubeda", "revert", "cordoba", "sempere",
				"martinez", "lopez", "albuixech", "torro", "belda", "mateu", "ribera", "satorres", "rubio", "cifuentes",
				"frances", "gomez", "mico", "ferrandiz", "casanova" };

		int position = (int) (Math.random() * 222) % 10;
		return surname = surnames[position];
	}

	public static String provincia() {
		String surname = "";
		String[] surnames = { "alfonso", "aliaga", "bas", "bataller", "boluda", "conesa", "camarena", "cucart", "doria",
				"ferrero", "garcia", "figuera", "tormo", "montagud", "gramage", "ubeda", "revert", "cordoba", "sempere",
				"martinez", "lopez", "albuixech", "torro", "belda", "mateu", "ribera", "satorres", "rubio", "cifuentes",
				"frances", "gomez", "mico", "ferrandiz", "casanova" };

		int position = (int) (Math.random() * 222) % 10;
		return surname = surnames[position];
	}

	public static String sexe() {

		String[] sexe = { "W", "M" };
		Random random = new Random();
		int select = random.nextInt(sexe.length);
		return sexe[select];
	}

	public static String email() {
		String email = "";
		String[] emails = { "vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe", "jaume",
				"sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina", "pepe", "oscar",
				"lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria", "elena", "beltran",
				"pablo", "juanjo" };

		int position = (int) (Math.random() * 222) % 10;
		return email = emails[position] + "@gmail.com";
	}

	public static String movil() {
		String mobilephone = "";
		long time = new java.util.GregorianCalendar().getTimeInMillis();
		Random random = new Random(time);
		while (mobilephone.length() < 9) {
			char c = (char) random.nextInt(255);
			if ((c >= '0' && c <= '9')) {
				mobilephone += c;
			}
		}
		return mobilephone;
	}

	public static String telefon() {
		String mobilephone = "";
		long time = new java.util.GregorianCalendar().getTimeInMillis();
		Random random = new Random(time);
		while (mobilephone.length() < 9) {
			char c = (char) random.nextInt(255);
			if ((c >= '0' && c <= '9')) {
				mobilephone += c;
			}
		}
		return mobilephone;
	}

	public static String codipost() {
		String cp = "";
		long time = new java.util.GregorianCalendar().getTimeInMillis();
		Random random = new Random(time);
		while (cp.length() < 9) {
			char c = (char) random.nextInt(255);
			if ((c >= '0' && c <= '5')) {
				cp += c;
			}
		}
		return cp;
	}

	public static Fecha fechaNacimiento() {
		// String [] years = {"19", "20"};
		Calendar date = new GregorianCalendar();
		String fecha = "";
		int anyactual = date.get(Calendar.YEAR);
		int day = (int) (Math.random() * (1 - 31) + 31);
		int month = (int) (Math.random() * (1 - 12) + 12);
		int year = (int) (Math.random() * (1940 - (anyactual - 16)) + (anyactual - 16));
		String format = Settings.getInstance().getformat_fecha();

		switch (format) {
		case "dd/mm/yyyy":
			fecha = day + "/" + month + "/" + year;
			break;
		case "dd-mm-yyyy":
			fecha = day + "-" + month + "-" + year;
			break;
		case "yyyy/mm/dd":
			fecha = year + "/" + month + "/" + day;
			break;
		case "yyyy-mm-dd":
			fecha = year + "-" + month + "-" + day;
			break;
		}

		return new Fecha(fecha, format);

	}
	
	
	
	
	

	public static Fecha fechaContratacion(Fecha fnaix) {

		// Calendar date = new GregorianCalendar();
		String fnacString = fnaix.toStringFormat();
		
		Calendar date = new GregorianCalendar();
		String fecha = "";
		int anynaix = 0;
		String[] SplitArray=null;
		SplitArray = fnacString.split("/");
		anynaix=Integer.parseInt(SplitArray [2]);
		int day = (int) (Math.random() * (1 - 31) + 31);
		int month = (int) (Math.random() * (1 - 12) + 12);
		int anyactual = date.get(Calendar.YEAR);
		
		String format = Settings.getInstance().getformat_fecha();
		int year = (int) (Math.random() * ((anynaix + 18) - anyactual) + anyactual);

		switch (format) {
		case "dd/mm/yyyy":
			fecha = day + "/" + month + "/" + year;
			break;
		case "dd-mm-yyyy":
			fecha = day + "-" + month + "-" + year;
			break;
		case "yyyy/mm/dd":
			fecha = year + "/" + month + "/" + day;
			break;
		case "yyyy-mm-dd":
			fecha = year + "-" + month + "-" + day;
			break;
		}

		return new Fecha(fecha, format);

	}

	public static int num_compres() {
		float shopping = (int) (Math.random() * (50 - 1000) + 1000);
		return (int) Math.rint(shopping * 100) / 100;
	}

	public static int comentaris() {
		float shopping = (int) (Math.random() * (50 - 1000) + 1000);
		return (int) Math.rint(shopping * 100) / 100;
	}

}
