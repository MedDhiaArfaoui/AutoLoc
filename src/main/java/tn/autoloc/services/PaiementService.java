package tn.autoloc.services;

import tn.autoloc.entities.Paiement;
import java.util.List;
import java.util.Optional;

public interface PaiementService {

    Paiement ajouter(Paiement paiement);

    List<Paiement> lister();

    Optional<Paiement> chercherParId(Long id);

    Paiement modifier(Long id, Paiement paiement);

    void supprimer(Long id);
}

