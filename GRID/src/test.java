
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HardTyre tyre1 = new HardTyre( "" ,30);
		
		System.out.println(tyre1.getName());
		
		
		Car car1= new Car(200,160,tyre1);
		
		AgresiveDriver driver1= new AgresiveDriver("Pesho", 0, car1, 0, 200);
		 
		System.out.println(driver1.getCar());
	

	}

}
