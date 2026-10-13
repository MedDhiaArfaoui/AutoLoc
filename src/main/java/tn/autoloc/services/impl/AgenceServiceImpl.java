package tn.autoloc.services.impl;

import org.springframework.stereotype.Service;
import tn.autoloc.entities.Agence;
import tn.autoloc.repositories.AgenceRepository;
import tn.autoloc.services.AgenceService;

import java.util.List;
import java.util.Optional;

@Service
public class AgenceServiceImpl implements AgenceService {

    private final AgenceRepository agenceRepository;

    public AgenceServiceImpl(AgenceRepository agenceRepository) {
        this.agenceRepository = agenceRepository;
    }

    @Override
    public Agence ajouter(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> lister() {
        return agenceRepository.findAll();
    }

    @Override
    public Optional<Agence> chercherParId(Long id) {
        return agenceRepository.findById(id);
    }

    @Override
    public Agence modifier(Long id, Agence agence) {
        if (!agenceRepository.existsById(id)) {
            throw new IllegalArgumentException("Agence introuvable : " + id);
        }
        agence.setIdAgence(id);
        return agenceRepository.save(agence);
    }

    @Override
    public void supprimer(Long id) {
        if (!agenceRepository.existsById(id)) {
            throw new IllegalArgumentException("Agence introuvable : " + id);
        }
        agenceRepository.deleteById(id);
    }
}

