package Ufc;

public class LigueCombattants {
    private String nom;
    private Combattants combattants;
    private Matchs EnsembleMatchs;


    public LigueCombattants(String nom, Combattants combattants, Matchs matchs) {
        this.nom = nom;
        this.combattants = combattants;
        this.EnsembleMatchs = EnsembleMatchs;
    }

    public String getNom() {
        return nom;
    }

    public Combattants getCombattants() {
        return combattants;
    }

    public Matchs getEnsembleMatchs() {
        return EnsembleMatchs;
    }
}

