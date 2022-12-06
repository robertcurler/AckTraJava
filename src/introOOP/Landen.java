package introOOP;

public class Landen {
	private String naam;
	private int aantalInwoners;
	private String continent;

	public void setNaam(String newName) {
		naam = newName;
	}

	public void setInwoners(int populatie) {
		aantalInwoners = populatie;
	}

	public void setContinent(String newContinent) {
		continent = newContinent;
	}

	public String getNaam() {
		return naam;
	}

	public int getInwoners() {
		return aantalInwoners;
	}

	public String getContinent() {
		return continent;
	}
}
