
public class Citizen {
	
	 protected String name;
	 protected String addres;
	 protected int numberofC;
	 protected String EGN;
	 
	 public Citizen()
	 {
		 
	 }
	 
	 public Citizen(String name,String addres,int NumberofC,String EGN)
	 {
		 this.name=name;
		 this.addres=addres;
		 this.numberofC=NumberofC;
		 this.EGN=EGN;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int getNumberofC() {
		return numberofC;
	}

	public void setNumberofC(int numberofC) {
		this.numberofC = numberofC;
	}
	
	public String getEGN()
	{
		return this.EGN;
	}
	
	public void setEGN(String EGN)
	{
		this.EGN=EGN;
	}
	 
	 
	

}
