package tn.autoloc.services.impl;

import org.springframework.stereotype.Service;
import tn.autoloc.entities.Vehicule;
import tn.autoloc.repositories.VehiculeRepository;
import tn.autoloc.services.VehiculeService;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeServiceImpl implements VehiculeService {

    private final VehiculeRepository vehiculeRepository;

    public VehiculeServiceImpl(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public Vehicule ajouter(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> lister() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Optional<Vehicule> chercherParId(Long id) {
        return vehiculeRepository.findById(id);
    }

    @Override
    public Vehicule modifier(Long id, Vehicule vehicule) {
        if (!vehiculeRepository.existsById(id)) {
            throw new IllegalArgumentException(
                    "Véhicule introuvable : " + id
            );
        }

        vehicule.setIdVehicule(id);
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void supprimer(Long id) {
        vehiculeRepository.deleteById(id);
    }
}

