package tn.autoloc.services.impl;

import org.springframework.stereotype.Service;
import tn.autoloc.entities.Client;
import tn.autoloc.repositories.ClientRepository;
import tn.autoloc.services.ClientService;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client ajouter(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> lister() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> chercherParId(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client modifier(Long id, Client client) {
        if (!clientRepository.existsById(id)) {
            throw new IllegalArgumentException("Client introuvable : " + id);
        }

        client.setIdClient(id);
        return clientRepository.save(client);
    }

    @Override
    public void supprimer(Long id) {
        if (!clientRepository.existsById(id)) {
            throw new IllegalArgumentException("Client introuvable : " + id);
        }

        clientRepository.deleteById(id);
    }
}

