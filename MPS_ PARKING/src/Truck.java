
public class Truck {

	String Licence;
	int year;
	String model;
	int trailer;

	public Truck(String licence, int year, String model, int trailer) {

		this.Licence = licence;
		this.year = year;
		this.model = model;
		this.trailer = trailer;

	}

	public int GetSize() {
		return this.trailer;
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

	public String toString() {
		return this.Licence + "@" + this.model + "$" + this.year;
	}

}
