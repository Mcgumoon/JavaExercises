
public class BankAccount {
	private int accountNumber;
	private double balance;
	
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double deposit(double deposit) {
		balance += deposit;
		return balance;
	}
	
	public double withdrawal(double withdrawal) {
		balance -= withdrawal;
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
}
