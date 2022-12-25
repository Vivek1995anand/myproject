package com.sdet;

import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String in_user,String in_pwd)
	{
		ResourceBundle rb= ResourceBundle.getBundle("config");
		String userNane=rb.getString("username");
		String password=rb.getString("password");
		if(in_user.equals(userNane) && in_pwd.equals(password))
			return 1;
		else
			return 0;
	}

}
