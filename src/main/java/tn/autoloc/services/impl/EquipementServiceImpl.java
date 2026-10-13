package tn.autoloc.services.impl;

import org.springframework.stereotype.Service;
import tn.autoloc.entities.Equipement;
import tn.autoloc.repositories.EquipementRepository;
import tn.autoloc.services.EquipementService;

import java.util.List;
import java.util.Optional;

@Service
public class EquipementServiceImpl implements EquipementService {

    private final EquipementRepository equipementRepository;

    public EquipementServiceImpl(EquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
    }

    @Override
    public Equipement ajouter(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> lister() {
        return equipementRepository.findAll();
    }

    @Override
    public Optional<Equipement> chercherParId(Long id) {
        return equipementRepository.findById(id);
    }

    @Override
    public Equipement modifier(Long id, Equipement equipement) {
        if (!equipementRepository.existsById(id)) {
            throw new RuntimeException("Equipement introuvable : " + id);
        }

        equipement.setIdEquipement(id);
        return equipementRepository.save(equipement);
    }

    @Override
    public void supprimer(Long id) {
        equipementRepository.deleteById(id);
    }
}
