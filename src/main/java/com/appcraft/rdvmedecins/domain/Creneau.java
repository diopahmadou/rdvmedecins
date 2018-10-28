package com.appcraft.rdvmedecins.domain;

import javax.persistence.*;

@Entity
@Table(name="creneaux")
public class Creneau extends AbstractEntity {
    private static  final long serialVersionUID = 1L;

    private int hdebut;
    private int mdebut;
    private int hfin;
    private int mfin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="id_medecin")
    private Medecin medecin;

    @Column(name = "id_medecin", insertable = false, updatable = false)
    private  long idMedecin;

    public Creneau() {
    }

    public Creneau(int hdebut, int mdebut, int hfin, int mfin, Medecin medecin) {
        this.hdebut = hdebut;
        this.mdebut = mdebut;
        this.hfin = hfin;
        this.mfin = mfin;
        this.medecin = medecin;
    }

    @Override
    public String toString() {
        return "Creneau{" +
                "hdebut=" + hdebut +
                ", mdebut=" + mdebut +
                ", hfin=" + hfin +
                ", mfin=" + mfin +
                ", medecin=" + medecin +
                ", idMedecin=" + idMedecin +
                ", id=" + id +
                ", version=" + version +
                '}';
    }

    public long getIdMedecin() {
        return idMedecin;
    }

    public int getHdebut() {
        return hdebut;
    }

    public void setHdebut(int hdebut) {
        this.hdebut = hdebut;
    }

    public int getMdebut() {
        return mdebut;
    }

    public void setMdebut(int mdebut) {
        this.mdebut = mdebut;
    }

    public int getHfin() {
        return hfin;
    }

    public void setHfin(int hfin) {
        this.hfin = hfin;
    }

    public int getMfin() {
        return mfin;
    }

    public void setMfin(int mfin) {
        this.mfin = mfin;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}