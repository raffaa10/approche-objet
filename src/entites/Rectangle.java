package entites;

public class Rectangle {
	
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur){
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double perimetre() {
		return (longueur + largeur)*2;
	}
	
	public double surface() {
		return longueur * largeur;
	}
	
	
	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
