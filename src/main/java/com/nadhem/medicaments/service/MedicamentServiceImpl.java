package com.nadhem.medicaments.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nadhem.medicaments.entities.Medicament;
import com.nadhem.medicaments.entities.Types;
import com.nadhem.medicaments.repos.MedicamentRepository;

@Service
public class MedicamentServiceImpl implements MedicamentService {

    @Autowired
    MedicamentRepository medicamentRepository;

    @Override
    public Medicament saveMedicament(Medicament m) {
        return medicamentRepository.save(m);
    }

    @Override
    public Medicament updateMedicament(Medicament m) {
        return medicamentRepository.save(m);
    }

    @Override
    public void deleteMedicament(Medicament m) {
        medicamentRepository.delete(m);
    }

    @Override
    public void deleteMedicamentById(Long id) {
        medicamentRepository.deleteById(id);
    }

    @Override
    public Medicament getMedicament(Long id) {
        return medicamentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Medicament> getAllMedicaments() {
        return medicamentRepository.findAll();
    }

    @Override
    public List<Medicament> findByNomMedicament(String nom) {
        return medicamentRepository.findByNomMedicament(nom);
    }

    @Override
    public List<Medicament> findByNomMedicamentContains(String nom) {
        return medicamentRepository.findByNomMedicamentContains(nom);
    }

    @Override
    public List<Medicament> findByNomPrix(String nom, Double prix) {
        return medicamentRepository.findByNomPrix(nom, prix);
    }

    @Override
    public List<Medicament> findByType(Types type) {
        return medicamentRepository.findByType(type);
    }

    @Override
    public List<Medicament> findByTypeIdTypes(Long id) {
        return medicamentRepository.findByTypeIdTypes(id);
    }

    @Override
    public List<Medicament> findByOrderByNomMedicamentAsc() {
        return medicamentRepository.findByOrderByNomMedicamentAsc();
    }

    @Override
    public List<Medicament> trierMedicamentsNomsPrix() {
        return medicamentRepository.trierMedicamentsNomsPrix();
    }
}
