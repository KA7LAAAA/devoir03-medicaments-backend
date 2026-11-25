package com.nadhem.medicaments.service;

import java.util.List;
import com.nadhem.medicaments.entities.Medicament;
import com.nadhem.medicaments.entities.Types;

public interface MedicamentService {
    Medicament saveMedicament(Medicament m);
    Medicament updateMedicament(Medicament m);
    void deleteMedicament(Medicament m);
    void deleteMedicamentById(Long id);
    Medicament getMedicament(Long id);
    List<Medicament> getAllMedicaments();

    List<Medicament> findByNomMedicament(String nom);
    List<Medicament> findByNomMedicamentContains(String nom);
    List<Medicament> findByNomPrix(String nom, Double prix);
    List<Medicament> findByType(Types type);
    List<Medicament> findByTypeIdTypes(Long id);
    List<Medicament> findByOrderByNomMedicamentAsc();
    List<Medicament> trierMedicamentsNomsPrix();
}
