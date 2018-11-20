package pak1;

public class Account {

	private String numberOfAccount;
	private Bank Bank;
	protected double moneyInAccount;

	public Account(String numberOfAccount, Bank Bank) {
		this.numberOfAccount = numberOfAccount;
		this.Bank = Bank;
		this.moneyInAccount = 0;
	}

	public Bank getBank() {
		return this.Bank;
	}

	public String getNumberOfAccount() {
		return this.numberOfAccount;
	}

	protected double getBalance() {
		return this.moneyInAccount;
	}

	private void changeAmount(double newSum) {
		this.moneyInAccount = newSum;
	}

	protected void addMoney(double newSum) throws InvalidSumException {
		if (newSum > 0) {
			changeAmount(moneyInAccount + newSum);
		} else
			throw new InvalidSumException();

	}

	void reduceMoney(double newSum)throws NotEnoughMoneyException {
		if (newSum <= moneyInAccount) {
			changeAmount(moneyInAccount - newSum);
		} else throw new NotEnoughMoneyException();
            
	
	
	

}
}
