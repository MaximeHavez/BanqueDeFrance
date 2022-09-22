package org.example.Comptes;

import org.example.Interfaces.Transaction;

import java.util.Scanner;

public class CompteEpargne extends Compte implements Transaction {

    private String nom;
    private Double montant;

    private Double taux = 0.02;


    private Double solde = 100.0;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    @Override
    public void consulterCompte() {
        System.out.println("Solde compte épargne : " + getSolde() + " €");
    }


    //fonction qui permet, via un scanner, d'entrer un montant à retirer, de vérifier si les fonds sont suffisant
    //et de calculer le nouveau solde du compte Epargne
    @Override
    public void retraitCompte() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Compte Epargne : Veuillez indiquer le montant que vous souhaitez retirer : ");
        montant = scanner.nextDouble();

        if (montant > solde){
            System.out.println("Compte Epargne : Vous n'avez pas les fonds suffisant pour retirer " + montant + " €");
        } else {
            solde = solde - montant;
            Double interet = solde*taux;
            System.out.println("Compte Epargne : Votre nouveau solde est desormais de " + getSolde() + " € " +
                               " à un taux fixe de " + taux*100 + " % soit " + interet + " € d'interêt ce mois-ci");
        }
    }

    //fonction qui permet, via un scanner, d'entrer un montant à créditer
    //et de calculer le nouveau solde du compte courant
    @Override
    public void crediterCompte() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Compte Epargne : Veuillez indiquer le montant que vous souhaitez créditer : ");
        montant = scanner.nextDouble();
        solde = solde + montant;
        Double interet = solde*taux;
        System.out.println("Compte Epargne : Votre nouveau solde est maintenant de " + getSolde() + " € à un taux fixe de " + taux*100 + " % soit " + interet + " € d'interêt ce mois-ci");
    }
}
