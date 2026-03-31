package personnages;

import objets.Equipement;

public class Romain {

	private final String nom;
	private int force;
	private final Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);

	}

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
//		assert isInvariantVerified() : "Invariant violé à la création d'un Romain !";
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

//	public void setForce(int force) {
//		this.force = force;
//		assert isInvariantVerified() : "Invariant violé après setForce !";
//	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		switch (force) {
		case 0:
			parler("Aïe");
			break;
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
		}
		return equipementEjecte;
	}

	private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte = +resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + " s'envole sous la force du coup.");
		// TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
			} else {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	private String texte;

}

//	public void recevoirCoup(int forceCoup) {
//		assert forceCoup > 0 : "Précondition violée : la force du coup doit être positive !";
//
//		int forceAvantCoup = force;
//
//		force -= forceCoup;
//		if (force < 0) {
//			force = 0;
//		}
//
//		assert isInvariantVerified() : "Invariant violé après recevoirCoup !";
//
//		assert force <= forceAvantCoup : "Postcondition violée : la force du Romain n'a pas diminué !";
//
//		if (force == 0) {
//			parler("J'abandonne !");
//		} else {
//			parler("Aie");
//		}
//	}
//
//	private boolean isInvariantVerified() {
//		return force >= 0;
//	}
