
public class UltrasoftTyre extends Tyre {
    //if degradation<30 game over
	private double grip;
	
	public UltrasoftTyre(String name, double hardness,  double grip) {
		super(name, hardness);
		this.setName("Ultrasoft");
		this.grip=grip;
	}

	public double getGrip() {
		return grip;
	}

	public void setGrip(double grip) {
		this.grip = grip;
	}
	
	
	

}
