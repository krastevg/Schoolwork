package one;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server {

	static LinkedList<String> firma;
	static LinkedList<String> firma1;
	static String[] bulstats = { "1454743", "3432656" };

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		ServerSocket Ssocket = new ServerSocket(1211);
		System.out.println("Server started!");
		while (true) {
			Socket socket = Ssocket.accept();
			new CustomerThread(socket).start();
		}

	}

	public static void isRequestAvailable(String code, String bulstat, PrintWriter out, LinkedList<String> firm) {
		synchronized (firm) {
			for (int i = 0; i < firm.size(); i++) {
				if (code.equals(firm.get(i))) {
					out.println("REFUSED!");
				}

				else if (i == firm.size()) {
					firm.add(code);
					out.println("OK!");

				}

			}

		}
	}

}
