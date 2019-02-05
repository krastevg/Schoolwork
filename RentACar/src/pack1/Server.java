package pack1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	
	static ArrayList<Car> cars = new ArrayList<Car>();
	
	public static void main(String args[]) throws IOException 
	{
		ServerSocket sSocket= new ServerSocket(6070);
		System.out.println("SERVER STARTED!");
		while(true)
		{
			Socket socket=sSocket.accept();
			new HelperThread(socket).start();
			
		}
		
		
	}

}




