
public class EnduranceDriver extends Driver {

	public EnduranceDriver(String name, double totalTime, Car car, double fuelConsumption, double speed) {
		super(name, totalTime, car, fuelConsumption, speed);
		this.setFuelConsumptionPerKm(1.5);	}

}
