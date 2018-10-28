package com.appcraft.rdvmedecins.repositories;

import com.appcraft.rdvmedecins.domain.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {
}
