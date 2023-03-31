package Modele;

/**
 * Classe représentant le taux à appliquer pour les transactions
 * @author Alexis RAVAYROL
 * @version 1.0.0
 */
public class Taux {

    //Variable en String car problème au moment de convertir de String à int ou double
    String tauxApplique;

    //Variable en String car problème au moment de convertir de String à int ou double
    String borneInferieur;

    //Variable en String car problème au moment de convertir de String à int ou double
    String borneSuperieur;
    String nomTaux;

    public Taux(String borneInferieur, String borneSuperieur, String tauxApplique, String nomTaux) {
        this.borneInferieur = borneInferieur;
        this.borneSuperieur = borneSuperieur;
        this.tauxApplique = tauxApplique;
        this.nomTaux = nomTaux;
    }

    /**
     * Renvoie le taux
     * @return le taux
     */
    public Double getTaux() {
        return Double.valueOf(tauxApplique);
    }

    /**
     * Renvoie le nom du taux
     * @return le nom du taux
     */
    public String getNomTaux() {
        return nomTaux;
    }

    /**
     * Renvoie la borne inférieur
     * @return la borne inférieur
     */
    public int getBorneInferieur() {
        return Integer.valueOf(borneInferieur);
    }

    /**
     * Renvoie la borne supérieur
     * @return la borne supérieur
     */
    public int getBorneSuperieur() {
        return Integer.valueOf(borneSuperieur);
    }


}
