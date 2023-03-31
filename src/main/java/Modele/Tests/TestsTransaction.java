package Modele.Tests;

import Modele.Transaction;
import Modele.Type;

/**
 * Classe qui va effectuer les tests unitaires sur la classe Transaction
 * @author Alexis RAVAYROL
 * @version 1.0.0
 */

public class TestsTransaction {

    public static void testConstructeur() {
        String nom = "RAVAYROL";
        Type type = Type.c;
        String montant = "133.3";

        Transaction transaction = new Transaction(nom, type, montant);
    }

    public static void testGetNom() {
        String nom = "RAVAYROL";
        Type type = Type.c;
        String montant = "133.3";

        Transaction transaction = new Transaction(nom, type, montant);
        System.out.println(transaction.getNom());

    }

    public static void testGetType() {
        String nom = "RAVAYROL";
        Type type = Type.c;
        String montant = "133.3";

        Transaction transaction = new Transaction(nom, type, montant);
        System.out.println(transaction.getType());

    }

    public static void testGetMontant() {
        String nom = "RAVAYROL";
        Type type = Type.c;
        String montant = "133.3";

        Transaction transaction = new Transaction(nom, type, montant);
        System.out.println(transaction.getMontant());

    }


    public static void main(String[] args) {
        testConstructeur();
        testGetNom();
        testGetType();
        testGetMontant();
    }
}


