package module_1_test_lab_question_2;

public class CurrentAccount extends Account {
	public float minimumBalance; 
	public CurrentAccount(Owner owner, float balance, String number,float minimumBalance) {
      super(owner,balance,number);
      this.minimumBalance = minimumBalance;
  }


	public CurrentAccount(float minimumBalance) {
		super();
		this.minimumBalance = minimumBalance;
	}
	public CurrentAccount(CurrentAccount obj) {
		
	}


	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(minimumBalance>500) {
			balance-=amount;
		}
		
		
	}


	public float getMinimumBalance() {
		return minimumBalance;
	}


	public void setMinimumBalance(float minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	

}
