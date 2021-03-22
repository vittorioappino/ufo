package it.polito.tdp.ufo.db;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {

	public static void main(String[] args) {
	
		String jdbcURL = "jdbc:mysql://localhost/ufo_sightings?user=root&password=root" ;
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL) ;
			
			Statement st = conn.createStatement() ;
			
//			String sql = "SELECT DISTINCT shape FROM sighting WHERE shape<>'' ORDER BY shape ASC" ;

			String sql = "SELECT DISTINCT shape "
					+ "FROM sighting "
					+ "WHERE shape<>'' "
					+ "ORDER BY shape ASC" ;
			
			ResultSet res = st.executeQuery(sql) ;
			
			List<String> formeUFO = new ArrayList<>();
			while( res.next() ) {
				String forma = res.getString("shape") ;
				formeUFO.add(forma) ;
			}
			st.close();
			
			System.out.println(formeUFO) ;
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
