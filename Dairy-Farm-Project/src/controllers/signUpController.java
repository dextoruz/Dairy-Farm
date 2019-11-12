package controllers;

import signUp.signUp;

public class signUpController {
	private signUp newUser;
	
	public boolean insertUserData(String cnic, String name, String address,
			String gender, String phoneNo, String role, String password) { //get it from view

		newUser = new signUp();
		newUser.setCnic(cnic);
		newUser.setAddress(address);
		newUser.setGender(gender);
		newUser.setName(name);
		newUser.setPassword(password);
		newUser.setPhoneNo(phoneNo);
		newUser.setRole(role);
		return newUser.insertData(newUser.getCnic(), newUser.getName(),
				newUser.getAddress(), newUser.getGender(),newUser.getPhoneNo(),
				newUser.getRole(), newUser.getPassword());
		
	}
	
	public signUpController() {
		// TODO Auto-generated constructor stub
		newUser = null;
	}

}
