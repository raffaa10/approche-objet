package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adresse = new AdressePostale(4, "rue des Pradiers", 34000, "Montpellier");
		Personne pers = new Personne("Trump", "Donald", adresse);
		
		System.out.println(pers.nom);
		System.out.println(pers.prenom);
		System.out.println(pers.adresse);
				
		
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
		
		Personne personne_1 = new Personne();
		personne_1.nom = "Macron" ;
		personne_1.prenom = "Emmanuel";
		personne_1.adresse = adresse_1;
		
		Personne personne_2 = new Personne();
		personne_2.nom = "Trump";
		personne_2.prenom = "Donald"  ;
		personne_2.adresse = adresse_2;
		*/
	}

}
