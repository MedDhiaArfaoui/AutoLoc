package tn.autoloc.services;

import tn.autoloc.entities.Agence;
import java.util.List;
import java.util.Optional;

public interface AgenceService {

    Agence ajouter(Agence agence);

    List<Agence> lister();

    Optional<Agence> chercherParId(Long id);

    Agence modifier(Long id, Agence agence);

    void supprimer(Long id);
}
