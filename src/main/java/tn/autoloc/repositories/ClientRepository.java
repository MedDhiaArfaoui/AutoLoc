package tn.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
