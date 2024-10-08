/***************************************************************
****************
* Kean University
* Semester Fall 23
* Course: CPS*2231 - Computer Programming
* Section 03
* Author: Ashley Davila
* Assignment: 2
* Task # 1
* Program Description: Create a program that will randomly
select four cards from a deck of cards. (for example)
****************************************************************
*********/

public class deckOfCards {
	public static void main(String[] args) {
		int[] cardDeck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamons", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8","9","10","Jack","Queen","King"};
		
		for (int i = 0; i < cardDeck.length; i++) {
			cardDeck[i] = i;
		}
		
		for (int i = 0; i < cardDeck.length; i++) {
			int index = (int)(Math.random() * cardDeck.length);
			int temp = cardDeck[i];
			cardDeck[i]= cardDeck[index];
			cardDeck[index] = temp;
		}
		
		for (int i = 0; i < 4; i++) {
			String suit = suits[cardDeck[i]/13];
			String rank = ranks[cardDeck[i]%13];
			System.out.println("Card number " + cardDeck[i] + ": " + rank + " of " + suit);
		}
	}
}
