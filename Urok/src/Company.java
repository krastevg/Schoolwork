
public class Company {

	private String nameOfCompany;
	private String dateOfEstablishment;
	private String bulstat;

	public Company() {

		this.nameOfCompany = "";
		this.dateOfEstablishment = "";
		this.bulstat = "";

	}
	
	public Company(String nameOfCompany,String dateOfEstablishment,String bulstat) {

		this.nameOfCompany = nameOfCompany;
		this.dateOfEstablishment = dateOfEstablishment;
		this.bulstat = bulstat;

	}
//Name of company
	public String getNameOfCompany() {
		return this.nameOfCompany;
	}

	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
//Date of establishment
	public String getDateOfEstablishment() {
		return this.dateOfEstablishment;
	}

	public void setDateOfEstablishment(String dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}
// Bulstat
	public String getBulstat() {
		return this.bulstat;
	}

	public void setBulstat(String bulstat) {
		if (bulstat.length() < 10) {
			System.out.println("Error! Bulstat must be 10 charecters long");
		}

		else
			this.bulstat = bulstat;
	}

}



 
