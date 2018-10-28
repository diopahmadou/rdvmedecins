package com.appcraft.rdvmedecins.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rv")
public class Rv extends AbstractEntity {

    private static final long serialVesrionUID = 1L;

    @Temporal(TemporalType.DATE)
    private Date jour;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="id_client")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="id_creneau")
    private Creneau creneau;

    @Column(name = "id_client", insertable = false, updatable = false)
    private  long idClient;

    @Column(name = "id_creneau", insertable = false, updatable = false)
    private  long idCreneau;

    public Rv() {
    }

    public Rv(Date jour, Client client, Creneau creneau) {
        this.jour = jour;
        this.client = client;
        this.creneau = creneau;
    }

    public long getIdClient() {
        return idClient;
    }

    public long getIdCreneau() {
        return idCreneau;
    }

    public Date getJour() {
        return jour;
    }

    public void setJour(Date jour) {
        this.jour = jour;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }
}