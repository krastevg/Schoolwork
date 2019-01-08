package one;

import java.io.IOException;
import java.io.OutputStreamWriter;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CustomerThread extends Thread {

	private PrintWriter out;
	private Scanner in;
	//private Socket socket;

	public CustomerThread(Socket socket) throws IOException {
		//this.socket = socket;
		out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		in = new Scanner(socket.getInputStream());

	}

	public void Authentication() {
		String clientCode = "";
		out.println("GET_BULSTAT");
		out.flush();
		String bulstaToChek = in.nextLine();
		for (int i = 0; i < Server.bulstats.length; i++) {
			if (bulstaToChek.equals(Server.bulstats[i])) {
				out.println("GETCODE");
				out.flush();
				clientCode = in.nextLine();

			} else if (i == Server.bulstats.length)
				out.println("Wrong BULLSTAT");

		}

		if (bulstaToChek.equals(Server.bulstats[0])) {
			Server.isRequestAvailable(clientCode, bulstaToChek, out, Server.firma);
		} else if (bulstaToChek.equals(Server.bulstats[1])) {
			Server.isRequestAvailable(clientCode, bulstaToChek, out, Server.firma1);
		} else
			out.println("Error Occured");

	}

	public void run() {
		Authentication();
	}
}
