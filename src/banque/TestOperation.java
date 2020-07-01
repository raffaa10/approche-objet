package banque;

public class TestOperation {

	public static void main(String[] args) {
		
		
		Operation[] tabOper = new Operation[4];
		
		tabOper[0] = new Credit("28/05/2009", 4550);
		tabOper[1] = new Debit("27/06/2009", 2500);
		tabOper[2] = new Credit("28/02/2010", 50);
		tabOper[3] = new Debit("27/12/2011", 120);
		
		
		double soldeGlobal = 0.0;
		
		for (int i=0; i < tabOper.length; i++) {
			System.out.println(tabOper[i]);
			
			if (tabOper[i].getType().equals("Credit")) {
				soldeGlobal += tabOper[i].getMontant();
									
				}
			else {
				soldeGlobal -= tabOper[i].getMontant();
			}
		}
		System.out.println("Solde global = " + soldeGlobal);

	}

}
