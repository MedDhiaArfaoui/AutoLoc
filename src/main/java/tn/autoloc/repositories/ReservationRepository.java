
package tn.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.autoloc.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

