package banque;

public class TestBanque {

	public static void main(String[] args) {
		
	Compte[] tabCompte = new Compte[2];	
		
	// Compte cmt = new Compte(124578963, 10_000_005);
	// System.out.println(cmt);
	 
	tabCompte[0] = new CompteTaux(99845, 542, 0.75);
	tabCompte[1] = new CompteTaux(112215, 2514, 0.45);

	for (int i=0; i < tabCompte.length; i++) {
		System.out.println(tabCompte[i]);
	}
	
		
	
	}

}
