package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[30];
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois (Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
	    gaulois.setVillage(this);
	    nbVillageois++;

	}
	
	public void trouverVillageois (Gaulois numVillageois) {
		
	}
	
	public void afficherVillage() {
		
	}
}