package tn.autoloc.services.impl;

import org.springframework.stereotype.Service;
import tn.autoloc.entities.Reservation;
import tn.autoloc.repositories.ReservationRepository;
import tn.autoloc.services.ReservationService;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation ajouter(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> lister() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> chercherParId(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public Reservation modifier(Long id, Reservation reservation) {
        if (!reservationRepository.existsById(id)) {
            throw new IllegalArgumentException(
                    "Réservation introuvable : " + id
            );
        }

        reservation.setIdReservation(id);
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimer(Long id) {
        if (!reservationRepository.existsById(id)) {
            throw new IllegalArgumentException(
                    "Réservation introuvable : " + id
            );
        }

        reservationRepository.deleteById(id);
    }
}

