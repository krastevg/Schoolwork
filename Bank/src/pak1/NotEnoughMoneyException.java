package pak1;

public class NotEnoughMoneyException extends Exception {
@Override
public String getMessage() {
	return "You don`t have enough money in this account";
}
}
