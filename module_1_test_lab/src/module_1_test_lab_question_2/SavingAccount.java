package module_1_test_lab_question_2;

public class SavingAccount extends Account {
	private float interestRate;

	public SavingAccount(float interestRate) {
		super();
		this.interestRate = interestRate;
	}
	

	public SavingAccount(Owner owner, float balance, String number,float interestRate) {
		super(owner,balance,number);
		this.interestRate=interestRate;
	}
	public SavingAccount(SavingAccount a) {
		
	}
	@Override
	public void print() {
	    System.out.println(toString());
	}
	public float getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}


	@Override
	public String toString() {
	    return number + " " + balance;
	}


	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance-=amount;
		
	}
	
	

}
