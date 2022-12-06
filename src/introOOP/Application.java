package introOOP;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Applicatie is gestart.");
		
		// Person
		Person Joshua = new Person();
		Joshua.naam = "Joshua";
		Joshua.beroep = "Myrmidon";
		Joshua.leeftijd = 27;
		Joshua.geslacht = false;
		
		Person Sarah = new Person();
		Sarah.naam = "Sarah";
		Sarah.beroep = "Cleric";
		Sarah.leeftijd = 25;
		Sarah.geslacht = true;
		
		String sarahsName = Sarah.watIsJouwNaam();
		System.out.println(sarahsName);
		//Sarah.actie();
		
		// Evenement
		Evenement Soenda = new Evenement();
		//Soenda.naam = "Soenda";
		Soenda.nameChange("Soenda");
		//Soenda.uitverkocht = false;
		Soenda.statusChange(false);
		//Soenda.prijskaartje = 50;
		Soenda.priceChange(60);
		//Soenda.locatie = "Utrecht";
		Soenda.locationChange("Eindhoven");
		//Soenda.bezoekers = 12000;
		Soenda.sizeChange(10000);
		//Soenda.myFields();

		
		String ticket = Soenda.prijskaartjeEvenement();
		System.out.println(ticket);
		
		String soldOut = Soenda.uitverkochtEvenement();
		System.out.println(soldOut);
		
		//Rekenmachine calc = new Rekenmachine();
		//int optelling = calc.optellen(4,8);
		//System.out.println(optelling);
		
		Soenda.nameChange("Awakenings");
		System.out.println(Soenda.naamEvenement());
		
		Landen land_01 = new Landen();
		land_01.setNaam("Nicaragua");
		System.out.println(land_01.getNaam());
		
		// Constructor testing
		Boek boek = new Boek();
		// titel = " harry potter"
		System.out.println(boek.getTitel());
		Boek boek2 = new Boek(743, "sci-fi", "Lord of the rings");
		System.out.println(boek2.getTitel());
		
		// input/output lezen/schrijven
		Person kyle = new Person();
		Scanner scanner = new Scanner(System.in);
		// "Wat is de persoon zijn naam?"
		
		String verkrijgNaam = scanner.next();
		kyle.naam = verkrijgNaam;
		System.out.println("De persoon heet: " +kyle.naam);
		//"Wat is de persoon zijn beroep?"
		
		String verkrijgBeroep = scanner.next();
		kyle.beroep = verkrijgBeroep;
		System.out.println("De persoon beoefent het beroep: "+kyle.beroep);
		
		int verkrijgLeeftijd = scanner.nextInt();
		kyle.leeftijd = verkrijgLeeftijd;
		System.out.println("De persoon is "+kyle.leeftijd+" jaar.");
	}

}
