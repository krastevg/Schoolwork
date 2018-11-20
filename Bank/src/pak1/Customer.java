package pak1;

public class Customer {

	private String name;
	private String egn;
	private Account[] account;

	public Customer(String name, String egn) {
		this.name = name;
		this.egn = egn;
		this.account = new Account[10];
	}
	
	public  void CreateNewAccount(Account acc)
	{
		for(int i = 0;i<this.account.length;i++)
		{
			if(account[i]==null)
			{
				account[i]=acc;
				System.out.println("Account aded to the list");
				break;
			}else {
				System.out.println("This postion "+i+"is full");
			}
		}
	}
	
	public void DeleteAccount(Account acc)throws AccountNotFoundException
	{
		for(int i=0;i<this.account.length;i++)
		{
			if(acc.getNumberOfAccount().equals(account[i].getNumberOfAccount()))
			{
				account[i]=null;
				System.out.println("Account deleted");
			} else if(i==account.length) {
			     throw new AccountNotFoundException();
			}
		}
	}

}
