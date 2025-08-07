package Ufc;


public class Combattants {
    private String id;
    private String nom;
    private String prenom;
    private String nomCombattant;
    private float poids;
    private String listeTitres;

    public Combattants(String id, String nom, String prenom, String nomCombattant, float poids, String listeTitres) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poids = poids;
        this.listeTitres = listeTitres;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomCombattant() {
        return nomCombattant;
    }

    public float getPoids() {
        return poids;
    }

    public String getListeTitres() {
        return listeTitres;
    }
}

