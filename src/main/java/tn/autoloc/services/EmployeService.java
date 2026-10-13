package tn.autoloc.services;

import tn.autoloc.entities.Employe;
import java.util.List;
import java.util.Optional;

public interface EmployeService {

    Employe ajouter(Employe employe);

    List<Employe> lister();

    Optional<Employe> chercherParId(Long id);

    Employe modifier(Long id, Employe employe);

    void supprimer(Long id);
}
