package com.vi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
 public Connection getConnection() {
	 Connection con =null;
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	try {
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","akram97ulla");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	return con;
 }
}
