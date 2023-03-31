package Modele.Tests;

import Modele.Transaction;
import Modele.Type;

public class TestsTransaction {


    public static void testConstructeur() {
        String nom = "RAVAYROL";
        Type type = Type.c;
        Double montant = 133.3;

        Transaction transaction = new Transaction(nom, type, montant);
    }

    public static void testGetNom() {
        String nom = "RAVAYROL";
        Type type = Type.c;
        Double montant = 133.3;

        Transaction transaction = new Transaction(nom, type, montant);
        System.out.println(transaction.getNom());

    }

    public static void testGetType() {
        String nom = "RAVAYROL";
        Type type = Type.c;
        Double montant = 133.3;

        Transaction transaction = new Transaction(nom, type, montant);
        System.out.println(transaction.getType());

    }

    public static void testGetMontant() {
        String nom = "RAVAYROL";
        Type type = Type.c;
        Double montant = 133.3;

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


