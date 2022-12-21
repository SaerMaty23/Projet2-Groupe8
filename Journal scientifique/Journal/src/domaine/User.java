package domaine;

public class User {
	private int userId;
	private String nom;
	private String prenom;
	private String mdp;
	

	public User(int id, String nom, String prenom, String mdp) {
		super();
		this.userId = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int id) {
		this.userId = id;
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
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	

}
