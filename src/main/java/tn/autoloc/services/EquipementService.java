
package tn.autoloc.services;

import tn.autoloc.entities.Equipement;
import java.util.List;
import java.util.Optional;

public interface EquipementService {

    Equipement ajouter(Equipement equipement);

    List<Equipement> lister();

    Optional<Equipement> chercherParId(Long id);

    Equipement modifier(Long id, Equipement equipement);

    void supprimer(Long id);
}

