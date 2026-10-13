package tn.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.entities.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}
