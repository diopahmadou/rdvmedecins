package com.appcraft.rdvmedecins.metier;

import com.appcraft.rdvmedecins.domain.Client;
import com.appcraft.rdvmedecins.domain.Creneau;
import com.appcraft.rdvmedecins.domain.Medecin;
import com.appcraft.rdvmedecins.domain.Rv;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IMetier {

    public List<Client> getAllClients();

    public List<Medecin> getAllMedecins();

    public List<Creneau> getAllCrenaux(long idMedecin);

    public List<Rv> getRvMedecinJour(long idMedecin, Date jour);

    public Medecin getMedecinById(long id);

    public Client getClientById(long id);

    public Rv getRvById(long id);

    public Creneau getCreneauById(long id);

    public Rv ajouterRv(Date jour, Creneau creneau, Client client);

    public void supprimerRv(Rv rv);

    public AgendaMedecinJour getAgendaMedecinJour(long idMedecin, Date jour);

}
