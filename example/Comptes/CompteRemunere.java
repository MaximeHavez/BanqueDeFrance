package org.example.Comptes;

import org.example.Interfaces.Transaction;

import java.util.Scanner;

public class CompteRemunere extends Compte implements Transaction {

    private String Numero;
    private Double montant;

    private Double taux = 0.02;

    private Double solde = 100.0;

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
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
        System.out.print("Compte Rémunéré : Veuillez indiquer le montant que vous souhaitez retirer : ");
        montant = scanner.nextDouble();

        if (montant > solde){
            System.out.println("Compte Rémunéré : Vous n'avez pas les fonds suffisant pour retirer " + montant + " €");
        } else {
            solde = solde - montant;
            Double interet = solde*taux;
            System.out.println("Compte Rémunéré : Votre nouveau solde est desormais de " + getSolde() + " € " +
                    " à un taux variable de " + taux*100 + " % soit " + interet + " € d'interêt ce mois-ci");
        }
    }

    //fonction qui permet, via un scanner, d'entrer un montant à créditer
    //et de calculer le nouveau solde du compte courant
    @Override
    public void crediterCompte() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Compte Rémunéré : Veuillez indiquer le montant que vous souhaitez créditer : ");
        montant = scanner.nextDouble();
        solde = solde + montant;
        Double interet = solde*taux;
        System.out.println("Compte Rémunéré : Votre nouveau solde est maintenant de " + getSolde() + " € à un taux Variable de " + taux*100 + " % soit " + interet + " € d'interêt ce mois-ci");
    }
}
