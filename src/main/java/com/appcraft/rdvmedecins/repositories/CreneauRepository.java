package com.appcraft.rdvmedecins.repositories;

import com.appcraft.rdvmedecins.domain.Creneau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CreneauRepository extends JpaRepository<Creneau, Long> {
    @Query("select c from Creneau c where c.medecin.id=?1")
    Iterable<Creneau> getAllCreneaux(long idMedecin);
}
