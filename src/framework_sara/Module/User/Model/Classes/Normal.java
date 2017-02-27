package framework_sara.Module.User.Model.Classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import framework_sara.Main_dummies;
import framework_sara.main_exer3;
import framework_sara.Module.User.Model.Funcions.Funcions_altres_dades_user;
import framework_sara.classes.Fecha;
import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;

@XStreamAlias("Normal")
public class Normal extends User { // User+ cognoms, localitat
	@XStreamAlias("cognoms")
	private String cognoms;
	@XStreamAlias("localitat")
	private String localitat;
	@XStreamAlias("comentaris")
	private int comentaris;
	@XStreamAlias("punts")
	private int punts;
	@XStreamAlias("karma")
	private String karma;

	// constructors
	// -----------------------------------------------------------------

	public Normal(String dni, String nom, String adreca, String sexe, Fecha fechaNacimiento, String cognoms,
			String localitat, int comentaris) {

		super(dni, nom, adreca, sexe, fechaNacimiento);

		this.cognoms = cognoms;
		this.localitat = localitat;
		this.comentaris = comentaris;

	}// public client

	public Normal(String dni) {
		super(dni);
	}

	public Normal() {
		super();
	}

	// getters -----------------------------------------------------------------

	public String getcognoms() {
		return this.cognoms;
	}

	public String getlocalitat() {
		return this.localitat;
	}

	public int getcomentaris() {
		return this.comentaris;
	}

	public int getpunts() {
		punts = Funcions_altres_dades_user.punts(this.comentaris);
		return punts;
	}

	public String getkarma() {
		karma = Funcions_altres_dades_user.karma(this.punts);
		return karma;
	}

	// setters -----------------------------------------------------------------

	public void setcognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public void setlocalitat(String localitat) {
		this.localitat = localitat;
	}

	public void setcomentaris(int comentaris) {
		this.comentaris = comentaris;
	}
	// to string -------------------------------------------------------------

	public String tostring() {
		String cad = ""; // dni, nom, adreca, sexe, fechaNacimiento
		int dummies = Settings.getInstance().getdummies();

		cad = Llenguatge.getInstance().getProperty("dni") + ": " + this.getdni() + "\n"
				+ Llenguatge.getInstance().getProperty("nom") + ": " + this.getnom() + "\n"
				+ Llenguatge.getInstance().getProperty("adreca") + ": " + this.getadreca() + "\n"
				+ Llenguatge.getInstance().getProperty("sexe") + ": " + this.getsexe() + "\n"
				+ Llenguatge.getInstance().getProperty("fechaNaixement") + ": " + this.getfechaNaixement() + "\n"
				+ Llenguatge.getInstance().getProperty("edat") + ": " + this.getedat() + "\n"
				+ Llenguatge.getInstance().getProperty("cognoms") + ": " + this.getcognoms() + "\n"
				+ Llenguatge.getInstance().getProperty("localitat") + ": " + this.getlocalitat() + "\n"
				+ Llenguatge.getInstance().getProperty("comentaris") + ": " + this.getcomentaris() + "\n"
				+ Llenguatge.getInstance().getProperty("punts") + ": " + this.getpunts() + "\nKarma: "
				+ this.getkarma();

		return cad;
	}
}
