package module_1_test_lab_question_2;

public abstract class Account {
	 Owner owner;
	 float balance;
	 String number;
	
	public Account() {
		owner=null;
		balance=0;
		number="";
	}

	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}
	public Account(Account a) {
		this.owner=a.owner;
		this.balance=a.balance;
		this.number=a.number;
		
		}
	public void input() {
	}
	
	public void print() {
	    System.out.println(toString());
	}
	@Override
	public String toString() {
	    return number + " " + balance;
	}
	
	public void deposit(double amount) {
	    balance += amount;
	}
	public abstract void withdraw(double amount);
	
	public double getBalance() {
	    return balance;
	}

}




