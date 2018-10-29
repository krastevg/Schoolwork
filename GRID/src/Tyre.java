
public class Tyre {
	
	private String name="";
	private double hardness=0;
	private double degradation=100; // if it reaches 0 the tyre explodes

public Tyre(String name,double hardness) {
	this.name=name;
	this.hardness=hardness;
	
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getHardness() {
	return hardness;
}

public void setHardness(double hardness) {
	this.hardness = hardness;
}

public double getDegradation() {
	return degradation;
}

public void setDegradation(double degradation) {
	this.degradation = degradation;
}	


	
}
