package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale adresse = new AdressePostale(4, "rue des Pradiers", 34000, "Montpellier");
		
		System.out.println(adresse.numeroRue);
		System.out.println(adresse.libelleRue);
		System.out.println(adresse.codePostal);
		System.out.println(adresse.ville);
		
		
		/**
		AdressePostale adresse_1 = new AdressePostale();
		adresse_1.numeroRue = 4;
		adresse_1.libelleRue = "rue des Pradiers";
		adresse_1.codePostal = 34000;
		adresse_1.ville = "Montpellier";
		
		AdressePostale adresse_2 = new AdressePostale();
		adresse_2.numeroRue = 15;
		adresse_2.libelleRue = "rue Mot";
		adresse_2.codePostal = 63000;
		adresse_2.ville = "Nimes";
		*/

	}

}
