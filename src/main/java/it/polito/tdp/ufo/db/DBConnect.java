package it.polito.tdp.ufo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
		
	public static Connection getConnection() throws SQLException {
		String jdbcURL = "jdbc:mysql://localhost/ufo_sightings?user=root&password=5djeru38cj4nx38us@eu";
		return DriverManager.getConnection(jdbcURL) ;
	}

}
