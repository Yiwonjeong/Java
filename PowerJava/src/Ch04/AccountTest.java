package Ch04;

class Account{
	
	String owner;
	int accountnumber;
	int balance;
	
	void deposit(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		balance -= amount;
	}
	@Override
	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}
}


public class AccountTest {

	public static void main(String[] args) {
		
		Account myA = new Account();
		
		myA.deposit(10000);
		System.out.println(myA);
		
		myA.withdraw(8000);
		System.out.println(myA);
	}
	
	
}
