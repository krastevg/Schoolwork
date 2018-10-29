
public class Driver {

	private String name = "";
	private double totalTime = 0;
	private Car car = null;
	private double fuelConsumptionPerKm = 0;
	private double speed = 0;

	public Driver(String name, double totalTime, Car car, double fuelConsumption, double speed) {
		this.name = name;
		this.totalTime = totalTime;
		this.car = car;
		this.fuelConsumptionPerKm = fuelConsumption;
		this.speed = speed;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}

	public String getCar() {
		return car.toString();
		
		
		
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public double getFuelConsumptionPerKm() {
		return fuelConsumptionPerKm;
	}

	public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
		this.fuelConsumptionPerKm = fuelConsumptionPerKm;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//Speed = “(car’s Hp + tyre’s degradation) / car’s fuelAmount”

	
	
}
