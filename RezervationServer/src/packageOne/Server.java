package packageOne;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	static ArrayList<User> users;
	static ArrayList<Offerts> offers;
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		ServerSocket serverSocket=new ServerSocket(1234);
		System.out.println("Server started!");
		while(true) {
			Socket socket = serverSocket.accept();
			 new HelperThread(socket).start();
		}
		
		

	}

}
