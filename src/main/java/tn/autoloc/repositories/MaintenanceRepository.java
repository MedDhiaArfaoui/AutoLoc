package tn.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.entities.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}

