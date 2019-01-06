package idk;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ServerVote {

	static  ArrayList<String> ListOfEgn= new ArrayList<String>();
	static  String[] Candidates= new String[8];
	static HashMap<Integer, Integer> votes=new HashMap();
	static LinkedList<Citizen> votedCitizens=new LinkedList<Citizen>();

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		ServerSocket Ssocket = new ServerSocket(1211);
		System.out.println("Server started !");
		while (true) {
			Socket socket = Ssocket.accept();
			new HelperThread(socket/* ListOfEgn, Candidates, votes*/).start();

		}
		
		

	}

}
