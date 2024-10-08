
public class TestBankAccount {
	public static void main(String [] args) {
		BankAccount account1 = new BankAccount(1001, 500.0);
		
		account1.deposit(30.50);
		account1.withdrawal(50.0);
		
		System.out.println("The current balance is: " + account1.getBalance());
	}
}
