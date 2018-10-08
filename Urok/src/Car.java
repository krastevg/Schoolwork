import java.util.Arrays;
import java.util.Collections;

public class Car implements Comparable<Car> {

	private String brand;
	private String color;
	private String model;
	private int horsePower;
	private String engineType;
	private String gearboxType;
	private String dateOfManufacture;

	public Car() {
		this.brand = "";
		this.color = "";
		this.model = "";
		this.horsePower = 0;
		this.engineType = "";
		this.gearboxType = "";
		this.dateOfManufacture = "";

	}

	public Car(String brand, String model, String color, int horsePower, String engineType, String gearboxType,
			String dateOfManufacture)

	{
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.horsePower = horsePower;
		this.engineType = engineType;
		this.gearboxType = gearboxType;
		this.dateOfManufacture = dateOfManufacture;
	}

	public String toString() {
		return ("(" + brand + ", " + color + ", " + model + ", " + horsePower + " , " + engineType + ", " + gearboxType
				+ ", " + dateOfManufacture + ")");
	}

	@Override
	public int compareTo(Car car) {

		return toString().compareTo(car.toString());
	}

	// Get methods

	public String getBrand() {
		return this.brand;
	}

	public String getColor() {
		return this.color;
	}

	public String getModel() {
		return this.model;
	}

	public int getHorsePower() {
		return this.horsePower;
	}

	public String getEngineType() {
		return this.engineType;
	}

	public String getGearbox() {
		return this.gearboxType;
	}

	public String getDateOfManufacture() {
		return this.dateOfManufacture;
	}

	// Set methods

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public void setGearbox(String gearboxType) {
		this.gearboxType = gearboxType;
	}

	public void setDateOfManucature(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public static Car[] sortByFirstLetter(Car[] cars, String a) {
		int i = 0;
		Car[] compatible = new Car[cars.length];
		for (Car car : cars) {
			if (car.model.startsWith(a)) {
				if (i > cars.length) {
					System.out.println("Error!");
					break;
				}

				compatible[i] = car;
				i++;

			}

		}

		return compatible;

	}
// use 1 from a-z 0 from z-a
	public static void sortFromAtoZ(Car[] cars, int order) {
		if (order == 1) {
			Arrays.sort(cars);
			System.out.println(Arrays.asList(cars));
		} else if (order == 0) {
			Arrays.sort(cars,Collections.reverseOrder());
			System.out.println(Arrays.asList(cars));
		}
		
		else System.out.println("ERROR! WRONG ORDER!");
	}

	public static Car[] noDoubling(Car[] cars) {
		Car[] compatible = new Car[cars.length];
		int i = 0;
		int b = 0;
		int a = 0;
		String[] model = new String[cars.length];

		for (Car car : cars) {

			if (i > cars.length) {
				System.out.println("Error!");
				break;
			}

			model[i] = car.model;
			i++;

		}

		for (Car car : cars) {
			b = 0;

			for (i = 0; i < model.length; i++) {
				if (car.model.equals(model[i])) {
					b++;
				}
			}

			if (b == 1 && a < cars.length) {

				compatible[a] = car;
				a++;
				

			} 
				
			

		}

		return compatible;
	}

}
