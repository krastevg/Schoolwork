
public class TruckPark extends Parking {

	public TruckPark(String id, int parkingSlots) {
		super(id, parkingSlots);
	}

	@Override
	public void Park(String MPC, int trailer) throws FullParkingException, CarNotValidException {
		if (freeSlots > takenSlots) {

			if (!CheckString(MPC)) {
				throw new CarNotValidException();
			}

			if (trailer == 0) {
				ParkedMPC[takenSlots] = MPC;
				System.out.println("Pakred !" + MPC);
				takenSlots++;

				allTakenSlots++;

			} else if (trailer == 1 && freeSlots >= 2) {
				ParkedMPC[takenSlots] = MPC;
				System.out.println("Pakred !" + MPC);
				takenSlots += 2;

				allTakenSlots += 2;
			} else if (trailer == 2 && freeSlots >= 3) {
				ParkedMPC[takenSlots] = MPC;
				System.out.println("Pakred !" + MPC);
				takenSlots += 3;

				allTakenSlots += 3;
			}

		}

		else
			throw new FullParkingException();

	}

	@Override
	public void UnPark(String MPC, int trailer) {

		if (trailer == 0) {
			for (int i = 0; i < ParkedMPC.length; i++) {
				if (MPC.equals(ParkedMPC[i])) {
					ParkedMPC[i] = "";

					takenSlots--;
					allTakenSlots--;
				}
			}

		} else if (trailer == 1) {

			for (int i = 0; i < ParkedMPC.length; i++) {
				if (MPC.equals(ParkedMPC[i])) {
					ParkedMPC[i] = "";

					freeSlots += 2;
					takenSlots -= 2;
					allTakenSlots -= 2;
				}
			}

		} else if (trailer == 2) {
			for (int i = 0; i < ParkedMPC.length; i++) {
				if (MPC.equals(ParkedMPC[i])) {
					ParkedMPC[i] = "";

					freeSlots += 3;
					takenSlots -= 3;
					allTakenSlots -= 3;
				}
			}

		}
	}

}
