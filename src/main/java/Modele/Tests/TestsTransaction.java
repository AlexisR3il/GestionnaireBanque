package Modele.Tests;

import Modele.Transaction;
import Modele.Type;

public class TestsTransaction {

    String nom = "RAVAYROL";
    Type type = Type.c;
    Double montant = 133.3;
    public void testConstructeur() {
        Transaction transaction = new Transaction(nom, type, montant);
    }

    public String testGetNom() {
        Transaction transaction = new Transaction(nom, type, montant);
        transaction.getNom();
    }

    public static void main(String[] args) {
        testConstructeur();
    }
}


