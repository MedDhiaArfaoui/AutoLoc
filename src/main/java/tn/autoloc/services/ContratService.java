package tn.autoloc.services;

import tn.autoloc.entities.Contrat;
import java.util.List;
import java.util.Optional;

public interface ContratService {

    Contrat ajouter(Contrat contrat);

    List<Contrat> lister();

    Optional<Contrat> chercherParId(Long id);

    Contrat modifier(Long id, Contrat contrat);

    void supprimer(Long id);
}

