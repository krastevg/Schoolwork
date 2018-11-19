
public class AutoParking extends Parking {

	int personal = 5;

	AutoParking(String id, int parkingSlots) {
		super(id, parkingSlots);
	}

	@Override
	public void Park(String MPC, int num) throws FullParkingException,CarNotValidException {
		if (freeSlots > takenSlots && personal>0  ) {
            if(!CheckString(MPC))
            {
            	throw new CarNotValidException();
            }
			ParkedMPC[takenSlots] = MPC;
			personal--;
			takenSlots++;
			
			allTakenSlots++;
			System.out.println("Pakred !"+MPC);

		}

		else {
			System.out.println("No available personnel");
			throw new FullParkingException();
			
		}

	}

	@Override
	public void UnPark(String MPC,int num) {

		for (int i = 0; i < ParkedMPC.length; i++) {
			if (MPC.equals(ParkedMPC[i])) {
				ParkedMPC[i] = "";
				personal++;
				
				takenSlots--;
				allTakenSlots--;
			}
		}

	}

}
