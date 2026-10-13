package tn.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
