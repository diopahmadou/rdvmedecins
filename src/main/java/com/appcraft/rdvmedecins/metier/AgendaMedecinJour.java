package com.appcraft.rdvmedecins.metier;

import com.appcraft.rdvmedecins.domain.Medecin;

import java.util.Arrays;
import java.util.Date;

public class AgendaMedecinJour {

    private static final long serialVersionUID = 1L;

    private Medecin medecin;
    private Date jour;
    private CreneauMedecinJour[] creneauMedecinJours;

    public AgendaMedecinJour() {
    }

    public AgendaMedecinJour(Medecin medecin, Date jour, CreneauMedecinJour[] creneauMedecinJours) {
        this.medecin = medecin;
        this.jour = jour;
        this.creneauMedecinJours = creneauMedecinJours;
    }

    @Override
    public String toString() {
        return "AgendaMedecinJour{" +
                "medecin=" + medecin +
                ", jour=" + jour +
                ", creneauMedecinJours=" + Arrays.toString(creneauMedecinJours) +
                '}';
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Date getJour() {
        return jour;
    }

    public void setJour(Date jour) {
        this.jour = jour;
    }

    public CreneauMedecinJour[] getCreneauMedecinJours() {
        return creneauMedecinJours;
    }

    public void setCreneauMedecinJours(CreneauMedecinJour[] creneauMedecinJours) {
        this.creneauMedecinJours = creneauMedecinJours;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
