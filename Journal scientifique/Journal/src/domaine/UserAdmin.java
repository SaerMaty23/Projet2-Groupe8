package domaine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.*;

public class UserAdmin extends User {
	private Connection con=null;
	private PreparedStatement st=null;
	private ResultSet rs=null;

	public UserAdmin(int id, String nom, String prenom, String mdp) {
		super(id, nom, prenom, mdp);
		// TODO Auto-generated constructor stub
	}
	
	public void ajouterArticle(Article li) {
		try
		{
			st=con.prepareStatement("insert into Article(articleId, titre, auteur, edition) values(?,?,?,?)");
			st.setInt(1, li.getArticleId());
			st.setString(2, li.getTitre());
			st.setString(3, li.getAuteur());
			st.setInt(4, li.getEdition());
			
			st.executeUpdate();
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public void modifierArticle(Article li)
	{
		try
		{
			st=con.prepareStatement("update Article set titre=?," +"auteur=?, edition=? where articleId = ?");
			st.setString(1, li.getTitre());
			st.setString(2, li.getAuteur());
			st.setInt(3, li.getEdition());
			st.setInt(4, li.getArticleId());
			
			st.executeUpdate();
		
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void supprimerArticle(int articleId)
	{
		try
		{
			st=con.prepareStatement("delete from Article where articleId=?");
			st.setInt(1,articleId);
			st.executeUpdate();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public Article rechercherArticle(int articleId)
	{
		Article li =null;
		try
		{
			st=con.prepareStatement("select * from Article where articleId=?");
			st.setInt(1, articleId);
			rs=st.executeQuery();
			if (rs.next())
			{
				int num=rs.getInt("articleId");
				String titre=rs.getString("titre");
				String auteur=rs.getString("auteur");
				int edition=rs.getInt("edition");
				li = new Article(num, titre, auteur, edition);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return li;
		
	}
	
	public ArrayList<Article> obtenirArticles()
	{
		ArrayList<Article> liste=null;
		Article li =null;
		try
		{
			st=con.prepareStatement("select * from Article");
			rs=st.executeQuery();
			article = new ArrayArticle<Article>();
			while (rs.next())
			{
				int num=rs.getInt("articleId");
				String titre=rs.getString("titre");
				String auteur=rs.getString("auteur");
				int edition=rs.getInt("edition");
				li = new Article(num, titre, auteur, edition);
				article.add(li);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return article;
	}
	
	
}
}
