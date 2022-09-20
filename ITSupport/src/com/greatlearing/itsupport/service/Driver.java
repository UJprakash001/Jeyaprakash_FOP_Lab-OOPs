package com.greatlearing.itsupport.service;

import java.util.Scanner;

import com.greatlearning.itsupport.model.Empolyee;

public class Driver {

	public static void main(String[] args) {
		
		Empolyee empolyee = new Empolyee("Jeya","Prakash");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(empolyee.getFirstname().toLowerCase(),empolyee.getLastname().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(empolyee,generatedEmail,generatedPassword);
		}
		
		else if (option == 2) {
			generatedEmail = cs.generateEmailAddress(empolyee.getFirstname().toLowerCase(),empolyee.getLastname().toLowerCase(), "adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(empolyee,generatedEmail,generatedPassword);
		
		}
		
		else if (option == 3) {
			generatedEmail = cs.generateEmailAddress(empolyee.getFirstname().toLowerCase(),empolyee.getLastname().toLowerCase(), "hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(empolyee,generatedEmail,generatedPassword);

		}
		else if (option == 4) {
			generatedEmail = cs.generateEmailAddress(empolyee.getFirstname().toLowerCase(),empolyee.getLastname().toLowerCase(), "lg");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(empolyee,generatedEmail,generatedPassword);

		}
		else
			System.out.println("Enter a valid option");
			
		sc.close();
	}
	
	

}
