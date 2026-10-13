package tn.autoloc.services;

import tn.autoloc.entities.Client;
import java.util.List;
import java.util.Optional;

public interface ClientService {

    Client ajouter(Client client);

    List<Client> lister();

    Optional<Client> chercherParId(Long id);

    Client modifier(Long id, Client client);

    void supprimer(Long id);
}
