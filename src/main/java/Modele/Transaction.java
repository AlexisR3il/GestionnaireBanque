package Modele;

import java.io.Serializable;

/**
 * Classe représentant la transaction
 * @author Alexis RAVAYROL
 * @version 1.0.0
 */
public class Transaction implements Serializable {

    String nom;
    Type type;
    Double montant;
    public Transaction(String nom, Type type, Double montant) {
        this.nom = nom;
        this.type = type;
        this.montant = montant;
    }
}
