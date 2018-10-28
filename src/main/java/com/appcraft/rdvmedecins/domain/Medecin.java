package com.appcraft.rdvmedecins.domain;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="medecins")
public class Medecin extends Personne {

    public Medecin() {
    }

    public Medecin(String titre, String nom, String prenom) {
        super(titre, nom, prenom);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}