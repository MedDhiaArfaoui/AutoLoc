package tn.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.entities.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}

