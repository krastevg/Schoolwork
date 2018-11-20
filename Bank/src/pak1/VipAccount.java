package pak1;

public class VipAccount extends Account {

	public VipAccount(String numberOfAccount, Bank Bank) {
		super(numberOfAccount, Bank);
	}
	@Override
	void reduceMoney(double newSum) 
	{
		super.moneyInAccount=super.moneyInAccount-newSum;
		
	}

}
