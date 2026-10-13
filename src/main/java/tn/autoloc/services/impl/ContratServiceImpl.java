package tn.autoloc.services.impl;

import org.springframework.stereotype.Service;
import tn.autoloc.entities.Contrat;
import tn.autoloc.repositories.ContratRepository;
import tn.autoloc.services.ContratService;

import java.util.List;
import java.util.Optional;

@Service
public class ContratServiceImpl implements ContratService {

    private final ContratRepository contratRepository;

    public ContratServiceImpl(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    public Contrat ajouter(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> lister() {
        return contratRepository.findAll();
    }

    @Override
    public Optional<Contrat> chercherParId(Long id) {
        return contratRepository.findById(id);
    }

    @Override
    public Contrat modifier(Long id, Contrat contrat) {
        if (!contratRepository.existsById(id)) {
            throw new RuntimeException("Contrat introuvable : " + id);
        }
        contrat.setIdContrat(id);
        return contratRepository.save(contrat);
    }

    @Override
    public void supprimer(Long id) {
        contratRepository.deleteById(id);
    }
}

