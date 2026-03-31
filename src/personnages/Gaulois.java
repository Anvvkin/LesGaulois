package personnages;

import village_gaulois.Village;
import objets.Equipement;

public class Gaulois {

	private String nom;
//    private int force;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	private Village village;
	private int effetPotion = 1;

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Gaulois Obelix = new Gaulois("Obelix", 16);
		System.out.println(Asterix.getNom());
	}

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.setForce(force);
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

//    @Override
//    public String toString() {
//        return nom;
//    }

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

//    private String prendreParole() {
//        return "Le gaulois " + nom + " : ";
//    }

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
		}
		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}

//    public void frapper(Romain romain) {
//        String nomRomain = romain.getNom();
//        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
//        int forceCoup = (force * effetPotion) / 3;
//        romain.recevoirCoup(forceCoup);
//        if (effetPotion > 1) {
//            effetPotion--;
//        }
//    }

	public void boirePotion(int forcePotion) {
		this.force += force;
	}

	public void sePresenter(Gaulois gaulois) {
		if (village == null) {
			parler("Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.");
		} else if (this == village.getChef()) {
			parler("Bonjour, je m'appelle " + nom + ". Je suis le chef du village : " + village.getNom() + ".");
		} else {
			parler("Bonjour, je m'appelle " + nom + ". J'habite le village : " + village.getNom() + ".");
		}
	}
}