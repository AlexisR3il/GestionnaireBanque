package Modele.Tests;

import Modele.GestionnaireBanque;
import Modele.Taux;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Classe qui va effectuer les tests unitaires sur la classe GestionnaireBanque
 * @author Alexis RAVAYROL
 * @version 1.0.0
 */
public class TestsGestionnaireBanque {
    public static void testRetrieveData() throws FileNotFoundException {
        GestionnaireBanque gestBanque = new GestionnaireBanque();
        ArrayList<Taux> listeTaux = new ArrayList<Taux>();
        listeTaux = gestBanque.recuperationDataTaux();
        for(int i = 0; i < listeTaux.size(); i++) {
            System.out.println("Taux: " + listeTaux.get(i).getTaux() + " Borne inférieur: " + listeTaux.get(i).getBorneInferieur() + " Borne supérieur: " + listeTaux.get(i).getBorneSuperieur() + " Nom: " + listeTaux.get(i).getNomTaux() + "\n");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        testRetrieveData();
    }
}
