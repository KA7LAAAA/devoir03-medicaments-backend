package com.nadhem.medicaments.service;

import java.util.List;
import com.nadhem.medicaments.entities.Categorie;
import com.nadhem.medicaments.entities.Medicament;

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
    List<Medicament> findByCategorie(Categorie categorie);
    List<Medicament> findByCategorieIdCat(Long id);
    List<Medicament> findByOrderByNomMedicamentAsc();
    List<Medicament> trierMedicamentsNomsPrix();
}
