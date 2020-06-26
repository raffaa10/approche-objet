package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		/**
		AdressePostale adresse = new AdressePostale(4, "rue des Pradiers", 34000, "Montpellier");
		Personne pers = new Personne("Trump", "Donald", adresse);
		
		System.out.println(pers.nom);
		System.out.println(pers.prenom);
		System.out.println(pers.adresse);
		*/
		
		AdressePostale adresse1 = new AdressePostale(4, "rue des Pradiers", 34000, "Montpellier");		
		AdressePostale adresse2 = new AdressePostale(201, "rue de la Liberte", 99500, "Paris");
		
		Personne pers1 = new Personne("Trump", "Donald", adresse1);
		Personne pers2 = new Personne("Putin", "Vladimir", adresse2);
		
		
				
		pers1.getNomMaj();
		pers2.getNomMaj();
		
		
		String nom1 = pers1.getNom();
		System.out.println(nom1);
						
		String nom2 = pers2.getNom();
		System.out.println(nom2);
		
		
		AdressePostale adrs1 = pers1.getAdresse();
		System.out.println(adrs1);
		
		AdressePostale adrs2 = pers2.getAdresse();
		System.out.println(adrs2);
		
		pers1.setNom("Duck");
		pers2.setNom("Shmutin");
		
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
