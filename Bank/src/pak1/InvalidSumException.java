package pak1;

public class InvalidSumException extends Exception{
@Override 
public String getMessage()
{
	return "Sum is eaqual to or less than 0";
}
}
