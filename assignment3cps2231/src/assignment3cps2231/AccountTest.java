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

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setID(1122);
		account1.setBalance(20000);
		account1.setAnnualInterestRate(0.045);
		account1.withdraw(2500);
		System.out.println(account1);
	}
}
