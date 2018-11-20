package pak1;

public class AccountNotFoundException extends Exception {
	@Override 
	public String getMessage()
	{
		return "Account not Found!";
	}

}
