package controllers;

import database.sql;
import login.login;

//
//import net.proteanit.sql.DbUtils;

public class LoginController {
	private sql db;
	private login lo;

	
	public boolean validateUser(String user, String pass) {  // get these from view 
		db = new sql();
		lo = new login(); 
		lo.setUser(user);
		lo.setPass(pass);
		return lo.verifyUser();	//return true/false	
	}
	
	public LoginController() {
		// TODO Auto-generated constructor stub
		db = null;
		lo = null;
	}

}
