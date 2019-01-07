package packageOne;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class RateThread extends Thread {

	private Socket socket;
	private PrintWriter out;
	private Scanner in;
	private User user;

	public RateThread(Socket socket, User user) throws IOException {
		this.socket = socket;
		this.out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		this.in = new Scanner(socket.getInputStream());
	}

	public void RateHotel() {
		out.println("Enter Id of Hotel you want to rate");
		out.flush();
		int idToRate = in.nextInt();

		synchronized (Server.offers) {

			for (int i = 0; i < user.getGrades().size(); i++) {
				if (user.getGrades().get(i).getOfferid() == idToRate) {
					if (user.getGrades().get(i).getEvaluation() == false) {
						user.getGrades().get(i).setEvaluation(true);
						out.println("Enter your grade! MUSTE BE BETWEEN 0 AND 6 !");

						int raiting = in.nextInt();
						if ((raiting < 0) || (raiting > 6)) {
							out.println("Error WRONG RAITING");
							out.flush();
							break;
						} else
							out.println("Raiting accepted!");
						for (int n = 0; Server.offers.size() < n; n++) {
							if (Server.offers.get(i).getOfferid() == idToRate) {
								Server.offers.get(i).setEvaluation(raiting);
							}
						}

					} else
						out.println("You have already voted for this hotel!");

				}
			}
		}
	}

	@Override
	public void run() {
		RateHotel();
	}

}
