package tn.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}

