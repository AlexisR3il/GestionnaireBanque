package Modele.Tests;

import Modele.Taux;
import Modele.Seuils;

public class TestTaux {


    public static void testConstructeur() {
        Seuils seuil = Seuils.inferieur;
        Double tauxApplique = 13.0;
        String nomTaux = "niveau1";

        Taux taux = new Taux(seuil, tauxApplique, nomTaux);
    }

    public static void testGetSeuils() {
        Seuils seuil = Seuils.inferieur;
        Double tauxApplique = 13.0;
        String nomTaux = "niveau1";

        Taux taux = new Taux(seuil, tauxApplique, nomTaux);
        System.out.println(taux.getSeuils());

    }

    public static void testGetTaux() {
        Seuils seuil = Seuils.inferieur;
        Double tauxApplique = 13.0;
        String nomTaux = "niveau1";

        Taux taux = new Taux(seuil, tauxApplique, nomTaux);
        System.out.println(taux.getTaux());

    }

    public static void testGetNomTaux() {
        Seuils seuil = Seuils.inferieur;
        Double tauxApplique = 13.0;
        String nomTaux = "niveau1";

        Taux taux = new Taux(seuil, tauxApplique, nomTaux);
        System.out.println(taux.getNomTaux());

    }


    public static void main(String[] args) {
        testConstructeur();
        testGetSeuils();
        testGetTaux();
        testGetNomTaux();
    }
}
