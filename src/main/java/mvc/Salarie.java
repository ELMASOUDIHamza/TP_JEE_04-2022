package mvc;

public class Salarie {
// Variables :
	private int id;
	private String nom, prenom, tache, msg;
// Constructors :
	public Salarie(int id, String nom, String prenom, String tache) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.tache = tache;
	}
	public Salarie(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Salarie( String nom, String prenom, String tache) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tache = tache;
	}
	public Salarie(int id) {
		super();
		this.id = id;
	}
	public Salarie() {
		super();
	}
// Getters and Setters :
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTache() {
		return tache;
	}
	public void setTache(String tache) {
		this.tache = tache;
	}
// Methods :
	public String notif () {
		msg = "Le salarié "+nom+" "+prenom+" est bien ajouté !";
		return msg;
	}
}
