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
    String montant;
    public Transaction(String nom, Type type, String montant) {
        this.nom = nom;
        this.type = type;
        this.montant = montant;
    }

    public String getNom() {
        return this.nom;
    }

    public Type getType() {
        return this.type;
    }

    public Double getMontant() {
        Double mont = Double.valueOf(montant);
        return mont;
    }

}
