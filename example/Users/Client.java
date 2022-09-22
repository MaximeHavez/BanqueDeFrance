package org.example.Users;

import org.example.Comptes.Compte;

import java.util.ArrayList;
import java.util.List;

public class Client {
    protected Integer numeroCompte;
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String telephone;
    protected Integer age;

    public Client(String nom, String prenom, String adresse, String telephone, Integer age) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.age = age;
    }

    List<Compte> comptes = new ArrayList<>();

    public void ajouterCompte(Compte a) {
        comptes.add(a);
    }

    public void afficherCompte(){
        for (Compte item : comptes
             ) {
            item.consulterCompte();
        }
    }



    public Integer getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(Integer numeroCompte) {
        this.numeroCompte = numeroCompte;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
