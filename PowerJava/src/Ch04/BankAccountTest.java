package Ch04;

class BankAccount{
	
	int accountNumber; //계좌번호
	String owner; //예금주
	int balance; //잔액
	
	void deposit (int amount) { balance += amount;}
	void withdraw (int amount) { balance -= amount;}
	
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
}

public class BankAccountTest {
	public static void main(String[] args) {
		
		BankAccount myAccount = new BankAccount();
		
		myAccount.deposit(1000000);
		System.out.println(myAccount);
		
		myAccount.withdraw(80000);
		System.out.println(myAccount);
	}

}
