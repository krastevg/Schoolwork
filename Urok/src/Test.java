import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car c1 = new Car("BMW","M3","blue",200,"V8","gearbox","12.12.1998");
      Car c2 = new Car("MAZDA","X7","green",200,"V8","gearbox","12.12.1998");
      Car c3 = new Car("Mercedes","Benz","red",200,"V8","gearbox","12.12.1998");
      Car c4 = new Car("Lada","Niva","white",100,"V8","gearbox","12.12.1998");
      Car c5 = new Car("Lada","Niva","white",100,"V8","gearbox","12.12.1998");
      
     Car[] test = new Car[] {c1,c2,c3,c4,c5};
    
     
      Car.sortFromAtoZ(test, 1);
      Car.sortFromAtoZ(test, 0);
      System.out.println(Arrays.asList(Car.sortByFirstLetter(test, "N")));
      System.out.println(Arrays.asList(Car.noDoubling(test)));
     
      
      
	}
}
