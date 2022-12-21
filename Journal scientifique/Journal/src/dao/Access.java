package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Access {

	 {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:sqlite:/C:\\sqlite\\journal.db";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "select *from Article";
			
			Statement statement = connection.createStatement();
			ResultSet result= statement.executeQuery(sql);
			
			while(result.next()) {
				
				System.out.println(result.getString("articleId")+ " "+result.getString("titre"));
			}
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
		}

	}

}package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Access {

	 {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:sqlite:/C:\\sqlite\\journal.db";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "select *from Article";
			
			Statement statement = connection.createStatement();
			ResultSet result= statement.executeQuery(sql);
			
			while(result.next()) {
				
				System.out.println(result.getString("articleId")+ " "+result.getString("titre"));
			}
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
		}

	}

}