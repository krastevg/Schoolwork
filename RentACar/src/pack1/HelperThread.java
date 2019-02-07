package pack1;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class HelperThread extends Thread {

	private Socket socket;
	private PrintWriter out;
	private Scanner in;

	public HelperThread(Socket socket) throws IOException {
		this.socket = socket;
		this.out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		this.in = new Scanner(socket.getInputStream());
	}

	@Override
	public void run() {
		int num = 0;

		out.println("Enter a number to use following functionality 1.City Search 2.Reservation 3.Return ");
		out.flush();
		num = in.nextInt();

		switch (num) {
		case (1): {
			String city;
			out.println("Enter city you want to search");
			out.flush();
			city = in.nextLine();
			CarSearch(city);
			break;
		}

		case (2): {

			String id;
			out.println("Enter the id of the car you want to reserve");
			out.flush();
			id = in.nextLine();
			CarReserve(id);
			break;

		}

		case (3): {

			CarReturn();
			break;

		}

		default: {
			out.println("Error");
			out.flush();
			break;
		}
		}
	}

	private void CarSearch(String city) {
		for (int i = 0; i < Server.cars.size(); i++) {
			if (Server.cars.get(i).getCity().equals(city)) {
				out.println(Server.cars.get(i).toString());
				out.flush();
			}
		}
	}

	private void CarReserve(String id) {

		out.println("Enter the dates you wish to reserve for");
		out.flush();
		String date1 = in.nextLine(); // client enters the dates like xx.xx.xx/xx.xx.xx ......

		String[] datesClient = date1.split("/");

		for (int i = 0; i < Server.cars.size(); i++) {

			if (Server.cars.get(i).getId().equals(id)) {
				String[] datesServer = Server.cars.get(i).getDate().split("/");

				for (int j = 0; j < datesClient.length; j++) {
					
					
					for (int h = 0; h < datesServer.length; h++) 
					{

						if (datesClient[j].equals(datesServer[h])) {
							out.println("Car is taken for this date " + datesClient[j]);
							out.flush();
							break;

						}
					}

				}

				Server.cars.get(i).setDate(date1 + Server.cars.get(i).getDate());
				out.println("Car reserved for the period " + date1);
				out.flush();
			}
		}
	}

	

	public void CarReturn() {
		out.println("Enter id of the car you want to return!");
		out.flush();
		String id = in.nextLine();
		out.println("Enter the City you want to return the car to!");
		out.flush();
		String city = in.nextLine();

		for (int i = 0; i < Server.cars.size(); i++) {
			if (Server.cars.get(i).getId().equals(id)) {
				Server.cars.get(i).setCity(city);
				out.println("Car with id:" + id + " is returned in " + city);
				out.flush();
			}
		}

	}

}
