import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class ServerVote {

	public static ArrayList<String> ListOfEgn;
	public static String[] Candidates;
	public static HashMap<Integer, Integer> votes;

	public static void main(String[] args) throws IOException {

		ServerSocket Ssocket = new ServerSocket(1211);
		System.out.println("Server started !");
		while (true) {
			Socket socket = Ssocket.accept();
			new HelperThread(socket, ListOfEgn, Candidates, votes).start();

		}

	}

}
