package com.appcraft.rdvmedecins.domain;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Personne extends AbstractEntity{

    private String titre;
    private String nom;
    private String prenom;

    public Personne() {
    }

    public Personne(String titre, String nom, String prenom) {
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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

    @Override
    public String toString() {
        return "Personne{" +
                "titre='" + titre + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", id=" + id +
                '}';
    }
}