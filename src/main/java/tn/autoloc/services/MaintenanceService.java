
package tn.autoloc.services;

import tn.autoloc.entities.Maintenance;
import java.util.List;
import java.util.Optional;

public interface MaintenanceService {

    Maintenance ajouter(Maintenance maintenance);

    List<Maintenance> lister();

    Optional<Maintenance> chercherParId(Long id);

    Maintenance modifier(Long id, Maintenance maintenance);

    void supprimer(Long id);
}
