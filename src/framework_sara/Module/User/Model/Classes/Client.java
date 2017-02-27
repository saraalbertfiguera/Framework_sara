package framework_sara.Module.User.Model.Classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import framework_sara.Main_dummies;
import framework_sara.main_exer3;
import framework_sara.Module.User.Model.Funcions.Funcions_altres_dades_user;
import framework_sara.Module.User.Model.Funcions.Funcions_fecha_user;
import framework_sara.classes.Fecha;
import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;

@XStreamAlias("Client")
public class Client extends User { // User+
									// email,usuari,password,movil,localitat,provincia,codipost,telefon

	@XStreamAlias("email")
	private String email;
	@XStreamAlias("usuari")
	private String usuari;
	@XStreamAlias("password")
	private String password;
	@XStreamAlias("movil")
	private String movil;
	@XStreamAlias("localitat")
	private String localitat;
	@XStreamAlias("provincia")
	private String provincia;
	@XStreamAlias("codipost")
	private String codipost;
	@XStreamAlias("telefon")
	private String telefon;
	@XStreamAlias("fechaAlta")
	private String fechaAlta;
	@XStreamAlias("num_compres")
	private int num_compres;
	@XStreamAlias("descompte")
	private int descompte;

	// constructors -----------------------------------------------------------

	public Client(String dni, String nom, String adreca, String sexe, Fecha fechaNacimiento, String email,
			String usuari, String password, String movil, String localitat, String provincia, String codipost,
			String telefon, int num_compres) {

		super(dni, nom, adreca, sexe, fechaNacimiento);

		this.email = email;
		this.usuari = usuari;
		this.password = password;
		this.movil = movil;
		this.localitat = localitat;
		this.provincia = provincia;
		this.codipost = codipost;
		this.telefon = telefon;
		this.num_compres = num_compres;

	}// public admin

	public Client(String dni) {
		super(dni);

	}

	public Client() {

	}

	// getters -----------------------------------------------------------------

	public String getemail() {
		return this.email;
	}

	public String getusuari() {
		return this.usuari;
	}

	public String getpassword() {
		return this.password;
	}

	public String getmovil() {
		return this.movil;
	}

	public String getlocalitat() {
		return this.localitat;
	}

	public String getprovincia() {
		return this.provincia;
	}

	public String getcodipost() {
		return this.codipost;
	}

	public String gettelefon() {
		return this.telefon;
	}

	public String getFechaAlta() {
		String fecha;
		fecha = Funcions_fecha_user.ask_FechaAlta();

		this.fechaAlta = fecha;
		return this.fechaAlta;
	}

	public int getdescompte() {
		// int descompte;
		descompte = Funcions_altres_dades_user.descompte(this.num_compres);
		// this.num_compres = descompte;
		return descompte;
	}

	public int getnum_compres() {
		return this.num_compres;

	}

	// setters -----------------------------------------------------------------

	public void setemail(String email) {
		this.email = email;
	}

	public void setusuari(String usuari) {
		this.usuari = usuari;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public void setmovil(String movil) {
		this.movil = movil;
	}

	public void setlocalitat(String localitat) {
		this.localitat = localitat;
	}

	public void setprovincia(String provincia) {
		this.provincia = provincia;
	}

	public void setcodipost(String codipost) {
		this.codipost = codipost;
	}

	public void settelefon(String telefon) {
		this.telefon = telefon;
	}

	public void setnum_compres(int num_compres) {
		this.num_compres = num_compres;
	}

	// tostring -------------------------------------------------------------

	public String tostring() {
		String cad = "";
		int dummies = Settings.getInstance().getdummies();

		cad = Llenguatge.getInstance().getProperty("dni") + ": " + this.getdni() + "\n"
				+ Llenguatge.getInstance().getProperty("nom") + ":" + this.getnom() + "\n"
				+ Llenguatge.getInstance().getProperty("adreca") + ":" + this.getadreca() + "\n"
				+ Llenguatge.getInstance().getProperty("sexe") + ": " + this.getsexe() + "\n"
				+ Llenguatge.getInstance().getProperty("fechaNaixement") + ": " + this.getfechaNaixement() + "\n"
				+ Llenguatge.getInstance().getProperty("edat") + ": " + this.getedat() + "\n"
				+ Llenguatge.getInstance().getProperty("email") + ": " + this.getemail() + "\n"
				+ Llenguatge.getInstance().getProperty("usuari") + ": " + this.getusuari() + "\n"
				+ Llenguatge.getInstance().getProperty("password") + ": " + this.getpassword() + "\n"
				+ Llenguatge.getInstance().getProperty("movil") + ": " + this.getmovil() + "\n"
				+ Llenguatge.getInstance().getProperty("localitat") + ": " + this.getlocalitat() + "\n"
				+ Llenguatge.getInstance().getProperty("provincia") + ": " + this.getprovincia() + "\n"
				+ Llenguatge.getInstance().getProperty("codipost") + ": " + this.getcodipost() + "\n"
				+ Llenguatge.getInstance().getProperty("telefon") + ": " + this.gettelefon() + "\n"
				+ Llenguatge.getInstance().getProperty("fechaAlta") + ": " + this.getFechaAlta() + "\n"
				+ Llenguatge.getInstance().getProperty("num_compres") + ": " + this.getnum_compres() + "\n"
				+ Llenguatge.getInstance().getProperty("descompte") + ": " + this.getdescompte() + "%";

		return cad;
	}

}
