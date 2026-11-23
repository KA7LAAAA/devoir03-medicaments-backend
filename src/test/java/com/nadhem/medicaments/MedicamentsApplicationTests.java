package com.nadhem.medicaments;

import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.nadhem.medicaments.entities.Medicament;
import com.nadhem.medicaments.repos.MedicamentRepository;

@SpringBootTest
class MedicamentsApplicationTests {

    @Autowired
    private MedicamentRepository medicamentRepository;

    @Test
    public void testCreateMedicament() {
        Medicament med = new Medicament("Doliprane", 2500.0, new Date(), false, 120, null);
        medicamentRepository.save(med);
    }

    @Test
    public void testFindMedicament() {
        Medicament m = medicamentRepository.findById(1L).orElse(null);
        System.out.println(m);
    }

    @Test
    public void testUpdateMedicament() {
        Medicament m = medicamentRepository.findById(1L).orElse(null);
        if (m != null) {
            m.setPrixMedicament(3000.0);
            medicamentRepository.save(m);
        }
    }

    @Test
    public void testListerTousMedicaments() {
        List<Medicament> meds = medicamentRepository.findAll();
        for (Medicament m : meds) {
            System.out.println(m);
        }
    }

    @Test
    public void testFindByNomMedicament() {
        List<Medicament> meds = medicamentRepository.findByNomMedicament("Doliprane");
        for (Medicament m : meds) {
            System.out.println(m);
        }
    }

    @Test
    public void testFindByNomMedicamentContains() {
        List<Medicament> meds = medicamentRepository.findByNomMedicamentContains("oli");
        for (Medicament m : meds) {
            System.out.println(m);
        }
    }

    @Test
    public void testTrierMedicamentsNomsPrix() {
        List<Medicament> meds = medicamentRepository.trierMedicamentsNomsPrix();
        for (Medicament m : meds) {
            System.out.println(m);
        }
    }
}
