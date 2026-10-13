package tn.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}

