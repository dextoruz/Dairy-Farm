package login;
//
/*
 * @author linxnerd
 * 
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;
//
//import net.proteanit.sql.DbUtils;

public class handler {
	private JTable table;
	private Connection cn;
	private login lo;
	public void  checkConnection() throws SQLException {
		cn = DriverManager.getConnection("jdbc:mysql://localhost/Dairy-farm","phpmyadmin","root");
	}
	
	public void getQuery(String user, String pass) {
		try {
			checkConnection();	
			lo.setUser(user);
			lo.setPass(pass);
			JOptionPane.showMessageDialog(null, lo.createQuery(cn)); //return resultset 
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Not connected to database");
//			e.printStackTrace();
		}
			
	}

	public handler() {
		// TODO Auto-generated constructor stub
		cn = null;
		lo = null;
	}

}
