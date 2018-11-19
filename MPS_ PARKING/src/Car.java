
public class Car {

	String Licence;
	int year;
	String model;

	public Car(String licence, int year, String model) {

		this.Licence = licence;
		this.year = year;
		this.model = model;

	}

	public String getLicence() {
		return Licence;
	}

	public void setLicence(String licence) {
		Licence = licence;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	@Override
	public String toString()
	{
		
		return Licence+"@"+model+"$"+year;
		
	}

}
