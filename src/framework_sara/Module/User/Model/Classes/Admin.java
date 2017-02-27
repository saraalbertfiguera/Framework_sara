package framework_sara.Module.User.Model.Classes;

//import java.text.Format;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import framework_sara.Main_dummies;
import framework_sara.main_exer3;
import framework_sara.Funcions.Format;
import framework_sara.Module.User.Model.Funcions.Funcions_altres_dades_user;
import framework_sara.classes.Fecha;
import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;

@XStreamAlias("Admin")
public class Admin extends User { // User+email,usuai,password,movil,localitat,provincia,codipost

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
	@XStreamAlias("fechaContratacion")
	private Fecha fechaContratacion;
	@XStreamAlias("antiguetat")
	private int antiguetat;
	@XStreamAlias("salari")
	private float salari;
	@XStreamAlias("moneda")
	private char moneda = ' ';

	// constructors ------------------------------------------------------

	public Admin(String dni, String nom, String adreca, String sexe, Fecha fechaNacimiento, String email, String usuari,
			String password, String movil, String localitat, String provincia, String codipost,
			Fecha fechaContratacion) {

		super(dni, nom, adreca, sexe, fechaNacimiento);

		this.email = email;
		this.usuari = usuari;
		this.password = password;
		this.movil = movil;
		this.localitat = localitat;
		this.provincia = provincia;
		this.codipost = codipost;
		this.fechaContratacion = fechaContratacion;
		this.salari = Funcions_altres_dades_user.salari(antiguetat);

	}// public admin

	public Admin(String dni) {
		super(dni);
	}

	public Admin() {
		super();
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

	public Fecha getFechaContratacion() {
		return fechaContratacion;
	}

	public int getantiguetat() {
		int result = this.calculaAntiguetat();
		this.antiguetat = result;
		return this.antiguetat;
	}

	public String getsalari() {

		String salari1 = Format.formatSalari(Settings.getInstance().getmoneda(), this.salari,
				Settings.getInstance().getdecimal());

		return salari1;
	}

	public char getmoneda() {
		char moneda1 = Settings.getInstance().getmoneda();
		this.moneda = moneda1;
		return this.moneda;
	}

	// setters -----------------------------------------------------------------

	public void setFechaContratacion(Fecha fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

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

	public int calculaAntiguetat() {
		int antiguetat = this.fechaContratacion.Restafecha();
		return antiguetat;
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
				+ Llenguatge.getInstance().getProperty("fechaCont") + ": " + this.getFechaContratacion().toString()
				+ "\n" + Llenguatge.getInstance().getProperty("antiguitat") + ": " + this.getantiguetat()
				+ Llenguatge.getInstance().getProperty("anys") + "\n" + Llenguatge.getInstance().getProperty("salari")
				+ ": " + this.getsalari() + this.getmoneda();

		return cad;

	}

}
