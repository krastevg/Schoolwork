package packageOne;

import java.util.ArrayList;

public class Offerts {

	private int offerid;
	private String nameOfHotel;
	private double price;
	private double raiting; // between 0 and 6
	private String destination;
	public ArrayList<Integer> evaluation;

	public Offerts(int offerid, String nameOfHotel, double price, double raiting, ArrayList<Integer> evaluation,String destination) {

		this.offerid = offerid;
		this.nameOfHotel = nameOfHotel;
		this.price = price;
		this.raiting = raiting;
		this.evaluation = evaluation;
		this.destination=destination;
	}

	public int getOfferid() {
		return offerid;
	}

	public void setOfferid(int offerid) {
		this.offerid = offerid;
	}

	public String getNameOfHotel() {
		return nameOfHotel;
	}

	public void setNameOfHotel(String nameOfHotel) {
		this.nameOfHotel = nameOfHotel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRaiting() {
		
		for(int eval:evaluation)
		{
			raiting+=eval;
		}
		
		raiting=raiting/evaluation.size();
		return raiting;
	}

	public void setRaiting(double raiting) {
		this.raiting = raiting;
	}

	public ArrayList<Integer> getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(int raiting) {
		this.evaluation.add(raiting);
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	

}
