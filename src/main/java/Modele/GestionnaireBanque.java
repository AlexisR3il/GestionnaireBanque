package Modele;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe qui va permettre d'effectuer les différents calculs et enregistrer / récupérer
 * les données des taux et transactions.
 * @author Alexis RAVAYROL
 * @version 1.0.0
 */

public class GestionnaireBanque {
    ArrayList<Transaction> listeTransaction = new ArrayList<>();
    ArrayList<Taux> listeTaux = new ArrayList<>();
    Double solde;

    /**
     * On construit un objet en dé-sérializant sa sauvegarde
     * @param pathTransaction le chemin de la sauvegarde de la liste transaction(un fichier au format xml)
     */
    public GestionnaireBanque(String pathTransaction) throws FileNotFoundException {
        ArrayList<Taux> listTransaction = null;

        try (FileInputStream fis = new FileInputStream(pathTransaction);
             ObjectInputStream ois = new ObjectInputStream(fis);) {

            listTransaction= (ArrayList) ois.readObject();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Classe non trouve");
            c.printStackTrace();
        }
    }

    /**
     * On construit un objet avec des liste vide au début
     */
    public GestionnaireBanque() {
        this.listeTaux = new ArrayList<Taux>();
        this.listeTransaction = new ArrayList<Transaction>();
        this.solde = 0.0;
    }

    /**
     * Construit la liste des taux et leurs différents paramètres et la renvoie
     * @return la la liste des taux
     */
    public ArrayList<Taux> recuperationDataTaux() throws FileNotFoundException {
        Scanner fileTaux = new Scanner(new File("src/main/resources/Data/taux.txt"));
        while(fileTaux.hasNext()) {
            String nomTaux = fileTaux.next();
            String borneSuperieur = fileTaux.next();
            String borneInferieur = fileTaux.next();
            String tauxApplique = fileTaux.next();

            Taux taux = new Taux(borneInferieur, borneSuperieur, tauxApplique, nomTaux);

            listeTaux.add(taux);
        }
        return listeTaux;
    }


}
