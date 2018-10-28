package com.appcraft.rdvmedecins.repositories;

import com.appcraft.rdvmedecins.domain.Creneau;
import com.appcraft.rdvmedecins.domain.Rv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.security.auth.login.CredentialException;
import java.util.Date;

@Repository
public interface RvRepository extends JpaRepository<Rv,Long> {

    @Query("select rv from Rv rv left join fetch rv.client c left join fetch rv.creneau cr where cr.medecin.id=?1 and rv.jour=?2")
    Iterable<Rv> getRvMedecinJour(long idMedecin, Date jour);
}
