package entites;

public class Personne {
		
		public	String nom;
		public	String prenom;
		public	AdressePostale adresse;
		
		/** public Personne(String nom, String prenom) {
			this.nom = nom;
			this.prenom = prenom;
		
		} */
			
		public Personne(String nom, String prenom, AdressePostale adresse) {
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
		}
		
		
		
		public void getNomMaj() {
			System.out.println(nom.toUpperCase() + " " + prenom);
		}
		public void setNom(String nom2) {
			this.nom = nom2;
			System.out.println(nom2 + " " + this.prenom);
		}
		public void setPrenom(String prenom2) {
			this.prenom = prenom2;
		}
		public void setAdresse(AdressePostale adresse2) {
			this.adresse = adresse2;
		}
		
		
		public String getNom() {
			return this.nom;
		}
		public String getPrenom() {
			return this.prenom;
		}
		public AdressePostale getAdresse() {
			return this.adresse;
		}
		

}
