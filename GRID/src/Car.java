
public class Car {

	private int horsepower;
	private double fuel; //max 160L
	private Tyre tyre;
	
	public Car(int hp , double fuel,  Tyre tyre)
	{
		this.horsepower=hp;
		this.fuel=fuel;
		this.tyre=tyre;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	
}
