package framework_sara.Module.User.Model.Classes;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import framework_sara.classes.Fecha;

@XStreamAlias("User")
public abstract class User implements Comparable<User>, Serializable {

	// ATRIBUTS:

	@XStreamAlias("dni")
	private String dni;
	@XStreamAlias("nom")
	private String nom;
	@XStreamAlias("adreca")
	private String adreca;
	@XStreamAlias("sexe")
	private String sexe;
	@XStreamAlias("fechaNacimiento")
	private Fecha fechaNacimiento;
	@XStreamAlias("edat")
	private int edat;

	// METODES:

	// CONSTRUCTORS

	public User(String dni, String nom, String adreca, String sexe, Fecha fechaNaixement) {
		this.dni = dni;
		this.nom = nom;
		this.adreca = adreca;
		this.sexe = sexe;
		this.fechaNacimiento = fechaNaixement;

	}

	public User(String dni) {
		this.dni = dni;
	}

	// GETTERS

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getdni() {
		return this.dni;
	}

	public String getnom() {
		return this.nom;
	}

	public String getadreca() {
		return this.adreca;
	}

	public int getedat() {
		int resultat = this.calculaedat();
		this.edat = resultat;
		return this.edat;

	}

	public String getsexe() {
		return this.sexe;
	}

	public Fecha getfechaNaixement() {
		return fechaNacimiento;
	}

	// SETTERS

	public void setdni(String dni) {
		this.dni = dni;
	}

	public void setnom(String nom) {
		this.nom = nom;
	}

	public void setadreca(String adreca) {
		this.adreca = adreca;
	}

	public void setsexe(String sexe) {
		this.sexe = sexe;
	}

	public void setfechaNaixement(Fecha fechaNaixement) {
		this.fechaNacimiento = fechaNaixement;
	}

	public int calculaedat() {
		int result = this.fechaNacimiento.Restafecha();
		return result;
	}

	public int compareTo(User param) {// para ordenar los empleados por nombre
		if (this.getdni().compareTo(param.getdni()) > 0)
			return 1;
		if (this.getdni().compareTo(param.getdni()) < 0)
			return -1;
		return 0;
	}

	public boolean equals(Object param) {
		return getdni().equals(((User) param).getdni());
	}

	// TOSTRING

	public abstract String tostring();

}// end class user
