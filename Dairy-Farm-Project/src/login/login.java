package login;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import database.sql;

public class login {
	private String username;
	private String password;
	private sql db;
	
	public void setUser(String user) {
		this.username = user;
	}
	public void setPass(String pass) {
		this.password = pass;
	}
	
	public String getUser() {
		return this.username;
	}
	
	public String getPass() {
		return this.password;
	}
	public void deSerialization() {
		//TO Do serilization
		return;
	}
	
	
	
	public boolean verifyUser() { /// checking user and password in database
		try {
			String query = "select username, password from users where username"
				+ " = "+getUser()+ " and password = "+getPass()+";";
		/// create Statement instance and use Connection instance to create Statement
			db.makeConnection().createStatement().executeQuery(query);  
			return true;
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, getUser()+ " is not in database");
			e.getMessage();
			return false;
		}
	}
	public login() {
		
		// TODO Auto-generated constructor stub
		username = null;
		password = null;
	}

}
