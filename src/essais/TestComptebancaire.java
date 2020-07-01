package essais;

import entites.CompteBancaire;
import entites.Personne;

public class TestComptebancaire {

	public static void main(String[] args) {
		
		CompteBancaire cmtb = new CompteBancaire("32001526B17", 250.0, new Personne("Dupont", "Francois")); 
		
		System.out.println(cmtb.toString());
		cmtb.crediterMontant(150.0);
		System.out.println(cmtb.toString());
		cmtb.debiterMontant(20);
		System.out.println(cmtb.toString()); 
		
	}

}
