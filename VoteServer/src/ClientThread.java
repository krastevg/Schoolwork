import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class ClientThread extends Thread {
	
	private Socket socket;
	private PrintWriter out;
	private Scanner in;
	private String[] Candidates;
	private String checkedEGN;
	private HashMap<Integer,Integer> votes;
	private LinkedList<Citizen> votedCitizens;
	
	public ClientThread(Socket socket,String[]Candidates,String check, HashMap<Integer,Integer> votes ) throws IOException {
		this.socket=socket;
		this.out= new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		this.in=new Scanner(socket.getInputStream());
		this.Candidates=Candidates;
		this.checkedEGN=check;
		this.votes=votes;
		
	}
	
	public synchronized void  Vote() throws IOException {
		
		out.println("The candidates are :");
		out.flush();
		for(int i=0;i<Candidates.length;i++) {
			out.println("Candidate number "+i+Candidates[i]);
			out.flush();
		}
		out.println("Please enter your NAME,ADDRES, NUMBER OF CANDIDATE you support in the given order ");
		out.flush();
		Citizen c1= new Citizen();
		c1.setName(in.nextLine());
		c1.setAddres(in.nextLine());
		c1.setNumberofC(in.nextInt());
		c1.setEGN(checkedEGN);
		int count=votes.get(c1.getNumberofC());
		votes.put(c1.getNumberofC(),count+1);
		votedCitizens.add(c1);
		out.println("Your vote has been processed");
		out.flush();
		
		
		
	}
	
	public void run()
	{
		try {
			Vote();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}
