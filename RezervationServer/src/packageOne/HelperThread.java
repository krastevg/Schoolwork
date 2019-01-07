package packageOne;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class HelperThread extends Thread {
	
	private Socket socket;
	private PrintWriter out;
	private Scanner in;
	
	public HelperThread(Socket socket) throws IOException
	{
		this.socket=socket;
		this.out=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		this.in = new Scanner(socket.getInputStream());
		
}
	
	public void ReservationOrRating() 
	{
		out.println("Enter email and password please");
		out.flush();
		String email=in.nextLine();
		String password=in.nextLine();
		
		for(User us1:Server.users) {
			if(us1.getEmail().equals(email)&&us1.getPass().equals(password))
			{
				GiveMeUSER(us1);
				
			}
		}
	}
		
	public void GiveMeUSER(User user){
		out.println("Hello would you like to make a RESERVATION or RATE ?");
	
		out.flush();
		String client=in.nextLine();
		
		try {
		
		if(client.equals("RESERVATION")) {
			
			
			new ReservationThread(socket,user).start();
			
		} else if(client.equals("RATE")) {
			
			new RateThread(socket,user).start();
			
		} else out.println("Wrong input!");
		
		
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	public void run()
	{
		ReservationOrRating();
	}

}
