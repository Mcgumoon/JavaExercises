//***************************************************************
//****************
//*
//* Kean University
//* Fall 2023
/* Course: CPS2231 - Computer Programming
/*
/* Author: Ashley Davila, Section 03
//*
//* Homework 1
//* Program Description:
//****************************************************************
//*********/

//import scanner
import java.util.*;

public class AD_Assignment1 {
	public static void main(String[] args) {
		//open scanner
		Scanner input = new Scanner(System.in);
		
		//initialize loop to input the name of 5 students
		for (int i = 0; i < 5; i++) {
			//ask user to input their first name
			System.out.print("Enter your First Name: ");
			String FirstName = input.nextLine();
			
			//ask user to input their last name
			System.out.print("Enter your Last Name: ");
			String LastName = input.nextLine();
			
			//initialize table
			System.out.println();
			
			//print description of the student's full name, their kean email, and their temporarily password
			System.out.printf("%-30s%-35s%-15s\n", "FULL NAME: ", "KEAN EMAIL: ", "PASSWORD: ");
			
			//call methods and generate the given information of full name, kean email, and password. 
			System.out.printf("%-30s%-35s%-15s\n", FirstName + " " + LastName, generateEmail(FirstName, LastName) + "@kean.edu", generatePassword());
			System.out.println();
			
		}
		//close scanner
		input.close();
	}
	
	
	//method that generate the email and returns a string variable
	public static String generateEmail(String FirstName, String LastName) {
		//Takes the first character of their first name
		String firstName = FirstName.substring(0,1);
		
		//Makes a string variable that combines the first charater of their first name with their last name
		//this will generate the email
		String email =  firstName.toLowerCase() + LastName.toLowerCase();
		
		//returns a string type variable
		return email;
	}
	
	//method that generate a random number and returns an integer variable
	public static int generatePassword() {
		//will give random numbers from 100000 and 999999, which will be their password
		int password = 100000 + (int)(Math.random() * 899999);
		
		//returns an integer type variable
		return password;
	}
}
