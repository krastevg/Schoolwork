package pack1;

public class Car {

	private String id;
	private String brand;
	private double pricePerDay;
	private String model;
	private String city;
	private String date;

	public Car(String id, String brand, double pricePerDay, String model, String city, String date) {
		super();
		this.id = id;
		this.brand = brand;
		this.pricePerDay = pricePerDay;
		this.model = model;
		this.city = city;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Car:");
		sb.append(this.brand);
		sb.append(this.city);
		sb.append(this.model);
		sb.append(this.pricePerDay);
		sb.append(this.id);
		
		return sb.toString();
		
		
		//return "Car [id=" + id + ", brand=" + brand + ", pricePerDay=" + pricePerDay + ", model=" + model + ", city="
				//+ city + ", date=" + date + "]";
	}
	
	

}
