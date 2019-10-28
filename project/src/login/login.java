package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class login {
	private String username;
	private String password;
	
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
	
	public ResultSet createQuery(Connection cn) throws SQLException {
		String query = "select username, password from users where username"
				+ " = "+this.username+ " and password = "+this.password+";";
		Statement s = cn.createStatement();
		JOptionPane.showMessageDialog(null, query);
		return s.executeQuery(query);
	}
	
	
	public login() {
		
		// TODO Auto-generated constructor stub
		username = null;
		password = null;
	}

}
