
public class AgresiveDriver extends Driver {

	public AgresiveDriver(String name, double totalTime, Car car, double fuelConsumption, double speed) {
		super(name, totalTime, car, fuelConsumption, speed);
		this.setFuelConsumptionPerKm(2.7);
		this.setSpeed(speed*1.3);
		
		
	}
	
	

}
