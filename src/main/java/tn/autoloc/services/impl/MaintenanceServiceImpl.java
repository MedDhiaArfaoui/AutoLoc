package tn.autoloc.services.impl;

import org.springframework.stereotype.Service;
import tn.autoloc.entities.Maintenance;
import tn.autoloc.repositories.MaintenanceRepository;
import tn.autoloc.services.MaintenanceService;

import java.util.List;
import java.util.Optional;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    public MaintenanceServiceImpl(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    @Override
    public Maintenance ajouter(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public List<Maintenance> lister() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Optional<Maintenance> chercherParId(Long id) {
        return maintenanceRepository.findById(id);
    }

    @Override
    public Maintenance modifier(Long id, Maintenance maintenance) {
        if (!maintenanceRepository.existsById(id)) {
            throw new RuntimeException("Maintenance introuvable : " + id);
        }

        maintenance.setIdMaintenance(id);
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void supprimer(Long id) {
        maintenanceRepository.deleteById(id);
    }
}

