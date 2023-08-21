package com.goaltracker.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Ganavi") && password.equals("Ganavi");
	}

}