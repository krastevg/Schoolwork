
public class Test {

	public static void main(String[] args) {
		
		Car car1=new Car("CA1211BH",1988,"1413");
		Car car2=new Car("CA1211BH",1987,"1331");
		Car car3=new Car("CA1211BH",1518,"OPEL");
		Car car4=new Car("CA1211BH",1938,"Lada");
		Car ca51=new Car("CA1211BH",1976,"BMW");
		Truck truck1=new Truck("CA1211BH",1988,"Lada",1);
		Truck truck2=new Truck("CA1211BH",1988,"Lada",2);
		Truck truck3=new Truck("CA1211BH",1988,"Lada",0);
		Truck truck4=new Truck("CA1211BH",1988,"Lada",2);
		
		AutoParking park1 = new AutoParking("Tishina",4);
		TruckPark park2=new TruckPark("Viena",10);
		
		
		try {
			
			
			System.out.println(park1.freeSlots);
			System.out.println(park1.takenSlots);
			System.out.println(park1.personal);
			System.out.println(car1.toString());
			park1.Park(car1.toString(), 0);
			park1.Park(car2.toString(), 0);
			park1.Park(car2.toString(), 0);
			park1.Park(car2.toString(), 0);
			park1.Park(car2.toString(), 0);
			
			
			
			
			
			
		}
		
		catch(CarNotValidException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		catch(FullParkingException e)
		{
			System.out.println(e.getMessage());
		}
		
		

		

	}

}
