package org.example.Users;

import org.example.Comptes.Compte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conseille extends Client{

    List<Client> clients = new ArrayList<>(

    );

    public Conseille(String nom, String prenom, String adresse, String telephone, Integer age) {
        super(nom, prenom, adresse, telephone, age);
    }


    public void ajouterClient(Client b){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le nom du possesseur du compte : ");
        b.setNom(scanner.nextLine());
        System.out.print("Entrez le prénom du possesseur du compte : ");
        b.setPrenom(scanner.nextLine());
        System.out.print("Entrez l'adresse du possesseur du compte : ");
        b.setAdresse(scanner.nextLine());
        System.out.print("Entrez le numéro de téléphone du possesseur du compte : ");
        b.setTelephone(scanner.nextLine());
        System.out.print("Entrez l'âge du possesseur du compte : ");
        b.setAge(scanner.nextInt());
        System.out.println("-------------------------------------------");
        clients.add(b);
    }

    public void addListCLient(Client j){
        clients.add(j);
    }

    public void affichageClient(){
        for (Client item : clients
             ) {
            System.out.println("Nom du client : " + item.getNom());
            System.out.println("Prénom du client : " + item.getPrenom());
            System.out.println("Adresse du client : " + item.getAdresse());
            System.out.println("Numéro de téléphone du client : " + item.getTelephone());
            System.out.println("Age du client : " + item.getAge());
            System.out.println("-------------------------------------------");
        }
    }
}
