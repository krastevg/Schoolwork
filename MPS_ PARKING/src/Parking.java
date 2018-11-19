import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Parking {

	public static int allParkingSlots; // vsichki mesta nqkoga suzdadeni za vsichko PARKINGi
	public static int allTakenSlots; // vsichki mesta zaeti po vsichki parkingi
	private int parkingSlots;// mestata na 1 parking
	private String ID; // id na parkinga
	public String[] ParkedMPC;
	int takenSlots = 0; // zaetite mesta na 1 parking
	int freeSlots = parkingSlots; // svobodnite mesta na 1 parking

	public Parking(String id, int parkingSlots) {

		this.ID = id;
		this.parkingSlots = parkingSlots;
		allParkingSlots = allParkingSlots + parkingSlots;
		freeSlots = parkingSlots;
		ParkedMPC= new String[parkingSlots];

	}

	public abstract void Park(String MPC, int num) throws FullParkingException, CarNotValidException;

	public abstract void UnPark(String MPC, int num);

	public boolean CheckString(String MPC) throws CarNotValidException {
		final Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{4}[A-Z]{2}@[a-z0-9]{1,10}\\$[0-9]{4}$");
		final Matcher matcher;
		matcher = pattern.matcher(MPC);

		if (matcher.matches())
			return matcher.matches();
		else
			throw new CarNotValidException();

	}

	public int getParkingSlots() {
		return parkingSlots;
	}

	public void setParkingSlots(int parkingSlots) {
		this.parkingSlots = parkingSlots;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String[] getParkedMPC() {
		return ParkedMPC;
	}

	public void setParkedMPC(String[] parkedMPC) {
		ParkedMPC = parkedMPC;
	}

}
