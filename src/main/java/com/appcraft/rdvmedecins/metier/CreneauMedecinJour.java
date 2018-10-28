package com.appcraft.rdvmedecins.metier;

import com.appcraft.rdvmedecins.domain.Creneau;
import com.appcraft.rdvmedecins.domain.Rv;

import java.io.Serializable;

public class CreneauMedecinJour implements Serializable {

    private static final long serialVersionUID = 1L;

    private Creneau creneau;
    private Rv rv;

    public CreneauMedecinJour() {
    }

    public CreneauMedecinJour(Creneau creneau, Rv rv) {
        this.creneau = creneau;
        this.rv = rv;
    }

    @Override
    public String toString() {
        return "CreneauMedecinJour{" +
                "creneau=" + creneau +
                ", rv=" + rv +
                '}';
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public Rv getRv() {
        return rv;
    }

    public void setRv(Rv rv) {
        this.rv = rv;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
