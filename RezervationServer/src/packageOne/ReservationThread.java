package packageOne;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ReservationThread extends Thread {

	private Socket socket;
	private PrintWriter out;
	private Scanner in;
	private User user;

	public ReservationThread(Socket socket, User user) throws IOException {
		this.socket = socket;
		this.user = user;
		this.out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		this.in = new Scanner(socket.getInputStream());
	}

	public void Reservation() {

		synchronized (Server.offers) {

			out.println("Enter destination");
			out.flush();
			String clientDestination = in.nextLine();
			for (Offerts of1 : Server.offers) {
				if (of1.getDestination().equals(clientDestination)) {
					out.println("NAME OF HOTEL " + of1.getNameOfHotel() + " OFFER ID " + of1.getOfferid());
					out.flush();
				}
			}

			out.println("Chose a hotel by sending its offerId");
			out.flush();
			int clientOferID = in.nextInt();

			for (int i = 0; i < user.getGrades().size(); i++) {

				if ((user.getGrades().get(i).getOfferid() == 0)
						&& (user.getGrades().get(i).getOfferid() != clientOferID)) {
					user.getGrades().get(i).setOfferid(clientOferID);
					out.println("Reservation created!");
					out.flush();

				}
			}
		}

	}

	@Override
	public void run() {
		Reservation();
	}
}
