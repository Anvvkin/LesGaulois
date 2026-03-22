package personnages;

public class Romain {

	private String nom;
	private int force;

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		
	}

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified() : "Invariant violé à la création d'un Romain !";
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
		assert isInvariantVerified() : "Invariant violé après setForce !";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0 : "Précondition violée : la force du coup doit être positive !";

		int forceAvantCoup = force;

		force -= forceCoup;
		if (force < 0) {
			force = 0;
		}

		assert isInvariantVerified() : "Invariant violé après recevoirCoup !";

		assert force <= forceAvantCoup : "Postcondition violée : la force du Romain n'a pas diminué !";

		if (force == 0) {
			parler("J'abandonne !");
		} else {
			parler("Aie");
		}
	}

	private boolean isInvariantVerified() {
		return force >= 0;
	}
}