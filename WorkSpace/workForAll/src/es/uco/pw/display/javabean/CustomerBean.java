package es.uco.pw.display.javabean;

import java.io.Serializable;

public class CustomerBean implements Serializable
{
	private int userID = 0;
	private String userName = "";
	private String userPassword = "";
	private String userNameR = "";
	private String userSurname = "";
	private int userGender = 0;
	
	public CustomerBean() {}
	
	// Respecto al ID del usuario
	public int getuserID() {
		return userID;
	}
	public void setuserID(int id) {
		userID = id;
	}
	
	// Respecto al nombre de usuario (email)
	public String getuserName()
	{
		return userName;
	}
	public void setuserName(String name)
	{
		userName = name;
	}

	// Respecto a la contraseña del usuario
	public String getuserPassword()
	{
		return userPassword;
	}
	public void setuserPassword(String password)
	{
		userPassword = password;
	}
	
	// Respecto al nombre real del usuario
	public String getuserNameR()
	{
		return userNameR;
	}
	public void setuserNameR(String nameR)
	{
		userNameR = nameR;
	}
	
	// Respecto a los apellidos del usuario
	public String getuserSurname()
	{
		return userSurname;
	}
	public void setuserSurname(String surname)
	{
		userSurname = surname;
	}
	
	// Respecto al género del usuario
	public int getuserGender()
	{
		return userGender;
	}
	public void setuserGender(int gender)
	{
		userGender = gender;
	}

}
