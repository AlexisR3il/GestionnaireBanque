package Modele.Tests;

import Modele.Taux;

/**
 * Classe qui va effectuer les tests unitaires sur la classe Taux
 * @author Alexis RAVAYROL
 * @version 1.0.0
 */

public class TestTaux {

    public static void testConstructeur() {
        String borneInferieur = "0";
        String borneSuperieur = "1000";
        String tauxApplique = "13.0";
        String nomTaux = "niveau1";

        Taux taux = new Taux(borneInferieur, borneSuperieur, tauxApplique, nomTaux);
    }

    public static void testGetBorneInferieur() {
        String borneInferieur = "0";
        String borneSuperieur = "1000";
        String tauxApplique = "13.0";
        String nomTaux = "niveau1";

        Taux taux = new Taux(borneInferieur, borneSuperieur, tauxApplique, nomTaux);
        System.out.println(taux.getBorneInferieur());
    }

    public static void testGetBorneSuperieur() {
        String borneInferieur = "0";
        String borneSuperieur = "1000";
        String tauxApplique = "13.0";
        String nomTaux = "niveau1";

        Taux taux = new Taux(borneInferieur, borneSuperieur, tauxApplique, nomTaux);
        System.out.println(taux.getBorneSuperieur());
    }

    public static void testGetTaux() {
        String borneInferieur = "0";
        String borneSuperieur = "1000";
        String tauxApplique = "13.0";
        String nomTaux = "niveau1";

        Taux taux = new Taux(borneInferieur, borneSuperieur, tauxApplique, nomTaux);
        System.out.println(taux.getTaux());

    }

    public static void testGetNomTaux() {
        String borneInferieur = "0";
        String borneSuperieur = "1000";
        String tauxApplique = "13.0";
        String nomTaux = "niveau1";

        Taux taux = new Taux(borneInferieur, borneSuperieur, tauxApplique, nomTaux);
        System.out.println(taux.getNomTaux());

    }


    public static void main(String[] args) {
        testConstructeur();
        testGetBorneInferieur();
        testGetBorneSuperieur();
        testGetTaux();
        testGetNomTaux();
    }
}
