package village_gaulois;

import personnages.Gaulois;

public class Village {
    private String nom;
    private int nbVillageois = 0;
    private Gaulois chef;
    private Gaulois[] villageois = new Gaulois[30];

    public Village(String nom, Gaulois chef) {
        this.nom = nom;
        this.chef = chef;
    }

    public static void main(String[] args) {

        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);

        Village village = new Village("Village des Irréductibles", abraracourcix);

        village.trouverVillageois(30);

        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);

        Gaulois gaulois = village.trouverVillageois(1);
        System.out.println(gaulois);

        gaulois = village.trouverVillageois(2);
        System.out.println(gaulois);
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
            gaulois.setVillage(this);
        } else {
            System.out.println("Le village est plein !");
        }
    }

    public Gaulois trouverVillageois(int numVillageois) {
        if (numVillageois <= 0 || numVillageois > nbVillageois) {
            System.out.println("Il n’y a pas autant d'habitants dans notre village !");
            return null;
        }
        return villageois[numVillageois - 1];
    }

    public void afficherVillage() {
        System.out.println("Village : " + nom);
        System.out.println("Chef : " + chef);

        for (int i = 0; i < nbVillageois; i++) {
            System.out.println(villageois[i]);
        }
    }
}