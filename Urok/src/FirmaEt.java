
public class FirmaEt extends Company {

	private String nameOfOwner;
	private double startingFunds;
	private double presentFunds;
//Constructor
	FirmaEt() {

	}

// Get methods
	public String getOwner() {

		return this.nameOfOwner;
	}

	public double getSFunds() {

		return this.startingFunds;
	}

	public double getPFunds() {

		return this.presentFunds;
	}

	public void setOwner(String nameOfOwner) {

		this.nameOfOwner = nameOfOwner;

	}

	// Set methods

	public void setSFunds(double startingFunds) {

		this.startingFunds = startingFunds;

	}

	public void setPFunds(double presentFunds) {

		this.presentFunds = presentFunds;

	}
	
	
public	double calcProfit()
	
	{
	   double profit = this.startingFunds - this.presentFunds;
      	return profit;
	}
	

}
