/*
**************************************************************
* Kean University
* Semester Fall 23
* Course: CPS-2231 - Section 3
* Authors: Ashley Davila
* Assignment 3
* Program Description: 
**************************************************************
*/

package assignment3cps2231;

import java.util.Date;

public class Account {
	//data fields
	 private int id = 0;
	 private double balance = 0;
	 private double annualInterestRate = 0.02;
	 private java.util.Date dateCreated = new java.util.Date();
	 
	 //constructors methods
	 public Account() {
		 
	 }
	 
	 public Account(int id, double balance) {
		 dateCreated = new java.util.Date();
		 this.id = id;
		 this.balance = balance;
	 }
	 
	 public void deposit(double depositAmount) {
			this.balance += depositAmount;
		}
		
		public void withdraw(double withdrawAmount) {
			this.balance -= withdrawAmount;
		}
	 
	//getters and setters
	 public int getID() {
		 return id;
	 }
	 
	 public void setID(int newId) {
		 this.id = newId;
	 }
	 
	 public double getBalance() {
		 return balance;
	 }
	 
	 public void setBalance(double newBalance) {
		 this.balance = newBalance;
	 }
	 
	 public double getAnnualInterestRate() {
		 return annualInterestRate;
	 }
	 
	 public void setAnnualInterestRate(double newRate) {
		 this.annualInterestRate = newRate;
	 }
	 
	 public Date getDateCreated() {
			return dateCreated; 
		}
	 
	 public double getMonthlyInterestRate(){
			return annualInterestRate / 12;
		}
		
	public double getMonthlyInterest() {
			return (1000 * annualInterestRate) / 12;
	}
	 
	@Override
	//toString method
	public String toString() {
		return "Id= " + id + "\nBalance= " + balance + "\nMonthly Interest= " + getMonthlyInterest()
				+ "\nDateCreated= " + dateCreated;
	}
	 
	
	
	
}
