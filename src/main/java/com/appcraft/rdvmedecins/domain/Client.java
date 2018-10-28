package com.appcraft.rdvmedecins.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class Client extends Personne{

    public Client(){
    }

    public Client(String titre, String nom, String prenom) {
        super(titre, nom, prenom);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}