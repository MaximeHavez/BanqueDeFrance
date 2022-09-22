package org.example;

import org.example.Comptes.CompteCourant;
import org.example.Comptes.CompteEpargne;
import org.example.Users.Client;
import org.example.Users.Conseille;

public class Main {
    public static void main(String[] args) {

        CompteCourant c1 = new CompteCourant();
        CompteEpargne ce1 = new CompteEpargne();
        Conseille cons = new Conseille("Baldous","Gael","A 8km de la Boulangerie Petit Louis", "0000000000",25);

        Client cl = new Client("Havez","Maxime", "Dans une Galaxie lointaine, très lointaine","2222222222",25);
        Client cl1 = new Client("Bettembourg","Mathilde", "Quelque part à Ronchin","0000000000",20);

        cl.ajouterCompte(c1);
        cl.ajouterCompte(ce1);
        cl.afficherCompte();

        cons.addListCLient(cl);
        cons.addListCLient(cl1);
        cons.affichageClient();
    }
}