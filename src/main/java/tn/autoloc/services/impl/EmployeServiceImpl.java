package tn.autoloc.services.impl;

import org.springframework.stereotype.Service;
import tn.autoloc.entities.Employe;
import tn.autoloc.repositories.EmployeRepository;
import tn.autoloc.services.EmployeService;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeServiceImpl implements EmployeService {

    private final EmployeRepository employeRepository;

    public EmployeServiceImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public Employe ajouter(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> lister() {
        return employeRepository.findAll();
    }

    @Override
    public Optional<Employe> chercherParId(Long id) {
        return employeRepository.findById(id);
    }

    @Override
    public Employe modifier(Long id, Employe employe) {
        if (!employeRepository.existsById(id)) {
            throw new RuntimeException("Employé introuvable : " + id);
        }

        employe.setIdEmploye(id);
        return employeRepository.save(employe);
    }

    @Override
    public void supprimer(Long id) {
        employeRepository.deleteById(id);
    }
}

