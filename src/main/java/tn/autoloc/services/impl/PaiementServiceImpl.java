package tn.autoloc.services.impl;

import org.springframework.stereotype.Service;
import tn.autoloc.entities.Paiement;
import tn.autoloc.repositories.PaiementRepository;
import tn.autoloc.services.PaiementService;

import java.util.List;
import java.util.Optional;

@Service
public class PaiementServiceImpl implements PaiementService {

    private final PaiementRepository paiementRepository;

    public PaiementServiceImpl(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    @Override
    public Paiement ajouter(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> lister() {
        return paiementRepository.findAll();
    }

    @Override
    public Optional<Paiement> chercherParId(Long id) {
        return paiementRepository.findById(id);
    }

    @Override
    public Paiement modifier(Long id, Paiement paiement) {
        if (!paiementRepository.existsById(id)) {
            throw new RuntimeException("Paiement introuvable : " + id);
        }

        paiement.setIdPaiement(id);
        return paiementRepository.save(paiement);
    }

    @Override
    public void supprimer(Long id) {
        paiementRepository.deleteById(id);
    }
}

