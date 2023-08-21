package com.goaltracker.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Ganavi") && password.equals("Ganavi");
	}

}