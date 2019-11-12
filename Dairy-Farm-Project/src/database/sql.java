package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.Statement;

public class sql {
	private String dbName;
	private String dbUser;
	private String dbPass;
	
	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbpass() {
		return dbPass;
	}

	public void setDbpass(String dbpass) {
		this.dbPass = dbpass;
	}
									
	public Connection makeConnection() throws SQLException { 
		 return DriverManager.getConnection("jdbc:mysql://localhost/"+this.dbName,this.dbUser,this.dbPass);
	}
	

	
	public sql() {
		dbName = "Dairy-farm";
		dbUser = "phpmyadmin";
		dbPass = "root";
		// TODO Auto-generated constructor stub
	}

}
