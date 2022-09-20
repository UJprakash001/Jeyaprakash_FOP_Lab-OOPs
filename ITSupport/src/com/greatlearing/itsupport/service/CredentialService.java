package com.greatlearing.itsupport.service;
import java.util.Random;
import com.greatlearning.itsupport.model.Empolyee;

public class CredentialService {

	public char[] generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmopqrstuwxyz";
		String numbers = "1234567890";
		String specialCharacters = "!@#$%^?><+-()";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();
		
		char[] password = new char[8];
		
		for (int i = 0; i < 8; i++) {
			
			password[i] = values.charAt(random.nextInt(values.length()));
		}return password;
	}
	public String generateEmailAddress(String firstname, String lastname, String department)
	{
		return firstname+lastname+"@"+department+".abc.com";
	}
	public void showCredentials(Empolyee empolyee, String email, char[] genratedPassword) {
	    System.out.println("Dear "+  empolyee.getFirstname() +  "your generated credentials are as follows");
	    System.out.println("Email....."+email);
	    System.out.print("Password....." +"");
		System.out.print(""+genratedPassword);
		
		}	
	}