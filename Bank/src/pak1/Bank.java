package pak1;

public class Bank {
private String name;
private String city;
private int branchNumber;

public Bank(String name,String city,int branchNumber)
{
	this.name=name;
	this.city=city;
	this.branchNumber=branchNumber;
}

public String getName()
{
	return this.name;
}

public String getCity()
{
	return this.city;
}

public int getBranchNumber()
{
	return this.branchNumber;
}


public void SetBranchNumber(int branchNumber)
{
	this.branchNumber=branchNumber;
}

public void Print()
{
	System.out.println(getCity()+" "+getName()+" "+getBranchNumber());
}

}
