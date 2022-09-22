package org.example.Comptes;

import org.example.Interfaces.Decouvert;
import org.example.Interfaces.Transaction;

import java.util.Scanner;

public class CompteCourant extends Compte implements Transaction, Decouvert {

    private String nom;
    private Double montant;
    private Double solde = 100.0;

    private Double decouvert = 100.0;

    public Double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(Double decouvert) {
        this.decouvert = decouvert;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    @Override
    public void consulterCompte() {
        System.out.println("Solde compte courant : " + getSolde() + " € avec une autorisation de découvert de " + getDecouvert() + " €");
    }

    //fonction qui permet, via un scanner, d'entrer un montant à retirer, de vérifier si les fonds sont suffisant
    //et de calculer le nouveau solde du compte courant
    public void retraitCompte(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Compte Courant : Veuillez indiquer le montant que vous souhaitez retirer : ");
        montant = scanner.nextDouble();

        if (montant > (solde+decouvert)){
            System.out.println("Compte Courant : Vous n'avez pas les fonds suffisant pour retirer " + montant + " €");
        } else {
            solde = solde - montant;
            setSolde(solde);
            System.out.println("Compte Courant : Votre nouveau solde est desormais de " + getSolde() + " €");
        }

    }

    //fonction qui permet, via un scanner, d'entrer un montant à créditer
    //et de calculer le nouveau solde du compte courant
    public void crediterCompte() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Compte Courant : Veuillez indiquer le montant que vous souhaitez retirer : ");
        montant = scanner.nextDouble();
        solde = solde + montant;
        setSolde(solde);
        System.out.println("Compte Courant : Votre nouveau solde est maintenant de " + getSolde() + " €");
    }

    //Fonction qui permet de setter l'autorisation de découvert via un Scanner
    @Override
    public void changerLeDecouvert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Compte Courant : A combien souhaitez-vous ajuster votre autorisation de découvert ? ");
        setDecouvert(scanner.nextDouble());
        System.out.println("Compte Courant : Votre autorisation de découvert est désormais de " + getDecouvert() + " €");
    }
}
