package tn.autoloc.services;

import tn.autoloc.entities.Vehicule;
import java.util.List;
import java.util.Optional;

public interface VehiculeService {

    Vehicule ajouter(Vehicule vehicule);

    List<Vehicule> lister();

    Optional<Vehicule> chercherParId(Long id);

    Vehicule modifier(Long id, Vehicule vehicule);

    void supprimer(Long id);
}

