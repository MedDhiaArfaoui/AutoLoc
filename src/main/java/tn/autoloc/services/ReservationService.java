
package tn.autoloc.services;

import tn.autoloc.entities.Reservation;
import java.util.List;
import java.util.Optional;

public interface ReservationService {

    Reservation ajouter(Reservation reservation);

    List<Reservation> lister();

    Optional<Reservation> chercherParId(Long id);

    Reservation modifier(Long id, Reservation reservation);

    void supprimer(Long id);
}

