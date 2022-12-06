package introOOP;

public class Person {
	public String naam;
	public int leeftijd;
	public boolean geslacht;
	// true = female / false = male
	public String beroep;
	// public char geslacht;
	
	public void actie() {
		System.out.println("De method 'actie' is aangeroepen.");
	}
	
	public String watIsJouwNaam() {
		String antwoord = "Mijn naam is "+naam+".";
		return antwoord;
	}
}