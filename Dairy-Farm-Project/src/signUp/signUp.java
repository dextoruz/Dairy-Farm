package signUp;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import database.sql;

public class signUp {
	private String cnic;
	private String name;
	private String address;
	private String gender;
	private String role;
	private String password;
	private String phoneNo;
	private sql db;
	
	
	public signUp() {
		cnic = null;
		name = null;
		address = null;
		gender = null;
		role = null;
		password = null;
		phoneNo = null;
		// TODO Auto-generated constructor stub
	
	}


	public String getCnic() {
		return cnic;
	}


	public void setCnic(String cnic) {
		this.cnic = cnic;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void serialization() {
		//TO Do serilization for password
		return;
	}
	
	public boolean insertData(String cnic, String name, String address,
			String gender, String phone, String role, String password) {
		String query = "INSERT INTO Customers VALUES ('"+cnic+"', '"+name+"',"
			+ " '"+gender+"','"+role+"', '"+phone+"', '"+address+"','"+password+"');";
		try {
			db = new sql();
			db.makeConnection().createStatement().execute(query);
//			JOptionPane.showMessageDialog(null, "Oh yeah!");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Didn't insert the data");
			e.getMessage();
			return false;
		}	
	}
}
