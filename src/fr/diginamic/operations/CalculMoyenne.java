package fr.diginamic.operations;

public class CalculMoyenne {

	private double tabl[];

	/**
	 * 
	 */
	public CalculMoyenne() {
		super();
		this.tabl = new double[0];
	}

	public void ajout(double elem) {
		double[] newTabl = new double[tabl.length + 1];
		newTabl[newTabl.length - 1] = elem;
		this.tabl = newTabl;
	}
	
	public void calcul() {
		double somme = 0;
		int i = 0;
		for (int i = 0, i < newTabl.length, i++) {
			somme = somme + this.tabl[i];
		}
		return (somme / this.tabl.length);
	}
}
