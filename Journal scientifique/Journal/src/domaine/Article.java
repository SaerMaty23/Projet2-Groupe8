package domaine;

public class Article {
private int ArticleId;
private String titre;
private String auteur;
private int edition;
public Article(int ArticleId, String titre, String auteur, int edition) {
	super();
	this.ArticleId = articleId;
	this.titre = titre;
	this.auteur = auteur;
	this.edition = edition;
}
public int getArticleId() {
	return articleId;
}
public void setArticleId(int articleId) {
	this.articleId = articleId;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public int getEdition() {
	return edition;
}
public void setEdition(int edition) {
	this.edition = edition;
}

}
