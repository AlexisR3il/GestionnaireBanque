package Modele;

public class Taux {
    Seuils seuils;
    Double tauxApplique;
    String nomTaux;
    public Taux(Seuils seuils, Double tauxApplique, String nomTaux) {
        this.seuils = seuils;
        this.tauxApplique = tauxApplique;
        this.nomTaux = nomTaux;
    }

    public Seuils getSeuils() {
        return seuils;
    }

    public Double getTaux() {
        return tauxApplique;
    }
    public String getNomTaux() {
        return nomTaux;
    }
}
