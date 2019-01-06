package idk;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
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

	public synchronized void ClientCheck() throws IOException {
		out.println("Hello please enter EGN or admin password!");
		out.flush();
		String check = in.nextLine();
		out.println("Checking ....");
		out.flush();
		if(ServerVote.ListOfEgn.contains(check)) {
			System.out.println("Starting client thread ..");
			out.println("Logged in as Client");
			out.flush();
			Thread t;
			t = new ClientThread(socket,check);
			t.start();
			
		} else {
			out.println("REFUSED!");
			out.flush();
		}
		
		
		out.close();
		in.close();
		
	}

	@Override
	public void run() {
		try {
		ClientCheck();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
