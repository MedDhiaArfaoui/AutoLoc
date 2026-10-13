package tn.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
