package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	private final static String URL = "jdbc:postgresql://localhost:5432/policeWoop";
	private final static String USER = "postgres";
	private final static String PASSWORD = "postgres" ;
	
	void connect() {
		try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);){
			if(connection != null) {
				System.out.println("Connected");
			} else {
				System.out.println("Error");
			}
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT VERSION()");
			if(resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
