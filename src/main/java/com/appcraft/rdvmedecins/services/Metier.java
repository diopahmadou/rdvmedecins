package com.appcraft.rdvmedecins.services;

import com.appcraft.rdvmedecins.domain.Client;
import com.appcraft.rdvmedecins.domain.Creneau;
import com.appcraft.rdvmedecins.domain.Medecin;
import com.appcraft.rdvmedecins.domain.Rv;
import com.appcraft.rdvmedecins.metier.AgendaMedecinJour;
import com.appcraft.rdvmedecins.metier.CreneauMedecinJour;
import com.appcraft.rdvmedecins.metier.IMetier;
import com.appcraft.rdvmedecins.repositories.ClientRepository;
import com.appcraft.rdvmedecins.repositories.CreneauRepository;
import com.appcraft.rdvmedecins.repositories.MedecinRepository;
import com.appcraft.rdvmedecins.repositories.RvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("metier")
public class Metier implements IMetier {

    @Autowired
    private MedecinRepository medecinRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CreneauRepository creneauRepository;

    @Autowired
    private RvRepository rvRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public List<Medecin> getAllMedecins() {
        return medecinRepository.findAll();
    }

    @Override
    public List<Creneau> getAllCrenaux(long idMedecin) {
        return (List<Creneau>) creneauRepository.getAllCreneaux(idMedecin);
    }

    @Override
    public List<Rv> getRvMedecinJour(long idMedecin, Date jour) {
        return (List<Rv>) rvRepository.getRvMedecinJour(idMedecin, jour);
    }

    @Override
    public Medecin getMedecinById(long id) {
        return medecinRepository.getOne(id);
    }

    @Override
    public Client getClientById(long id) {
        return clientRepository.getOne(id);
    }

    @Override
    public Rv getRvById(long id) {
        return rvRepository.getOne(id);
    }

    @Override
    public Creneau getCreneauById(long id) {
        return creneauRepository.getOne(id);
    }

    @Override
    public Rv ajouterRv(Date jour, Creneau creneau, Client client) {
        return rvRepository.save(new Rv(jour, client, creneau));
    }

    @Override
    public void supprimerRv(Rv rv) {
        rvRepository.delete(rv);

    }

    @Override
    public AgendaMedecinJour getAgendaMedecinJour(long idMedecin, Date jour) {

        List<Creneau> creneauxHoraires = getAllCrenaux(idMedecin);

        List<Rv> reservations = getRvMedecinJour(idMedecin, jour);

        Map<Long, Rv> hReservations = new Hashtable<Long, Rv>();

        for (Rv resa : reservations) {
            hReservations.put(resa.getCreneau().getId(), resa);
        }

        AgendaMedecinJour agenda = new AgendaMedecinJour();

        agenda.setMedecin(getMedecinById(idMedecin));

        agenda.setJour(jour);

        CreneauMedecinJour[] creneauxMedecinJour = new CreneauMedecinJour[creneauxHoraires.size()];
        agenda.setCreneauMedecinJours(creneauxMedecinJour);

        for (int i = 0; i < creneauxHoraires.size(); i++) {
            creneauxMedecinJour[i] = new CreneauMedecinJour();

            Creneau creneau = creneauxHoraires.get(i);
            long idCreneau = creneau.getId();
            creneauxMedecinJour[i].setCreneau(creneau);
            if (hReservations.containsKey(idCreneau)) {
                Rv resa = hReservations.get(idCreneau);
                creneauxMedecinJour[i].setRv(resa);
            }
        }
        return agenda;
    }
}