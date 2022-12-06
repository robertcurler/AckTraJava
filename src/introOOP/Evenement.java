package introOOP;

public class Evenement {
	private String naam;
	private boolean uitverkocht;
	private int prijskaartje;
	private String locatie;
	private int bezoekers;
	private char vak; // maar hoe werkt dat?
	
	public void myFields() {
		System.out.println("Het evenement heet "+naam+".");
		System.out.println("Is het evenement uitverkocht? "+uitverkocht+".");
		System.out.println("Een kaartje voor dit evenement kost €"+prijskaartje+".");
		System.out.println("Er kunnen maximaal "+bezoekers+" op het evenement aanwezig zijn.");
		System.out.println("Het evenement wordt gegeven in "+locatie+".");
	}
	
	public String naamEvenement() {
		String answer = "Naam van evenement is "+naam;
		return answer;
	}
	
	public String uitverkochtEvenement() {
		String answer = "het evenement is uitverkocht "+uitverkocht;
		return answer;
	}
	public String prijskaartjeEvenement() {
		String answer = "een kaartje voor het evenement kost €"+prijskaartje;
		return answer;
	}
	
	public void nameChange(String toName) {
		naam = toName;
	}
	public void statusChange(boolean toStatus) {
		uitverkocht = toStatus;
	}
	public void priceChange(int toPrice) {
		prijskaartje = toPrice;
	}
	public void locationChange(String toLocation) {
		locatie = toLocation;
	}
	public void sizeChange(int toSize) {
		bezoekers = toSize;
	}
}