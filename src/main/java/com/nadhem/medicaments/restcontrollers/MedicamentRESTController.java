package com.nadhem.medicaments.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nadhem.medicaments.entities.Medicament;
import com.nadhem.medicaments.service.MedicamentService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MedicamentRESTController {

    @Autowired
    MedicamentService medicamentService;

    @GetMapping
    public List<Medicament> getAllMedicaments() {
        return medicamentService.getAllMedicaments();
    }

    @GetMapping("/{id}")
    public Medicament getMedicamentById(@PathVariable("id") Long id) {
        return medicamentService.getMedicament(id);
    }

    @PostMapping
    public Medicament createMedicament(@RequestBody Medicament medicament) {
        return medicamentService.saveMedicament(medicament);
    }

    @PutMapping
    public Medicament updateMedicament(@RequestBody Medicament medicament) {
        return medicamentService.updateMedicament(medicament);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicament(@PathVariable("id") Long id) {
        medicamentService.deleteMedicamentById(id);
    }

    @GetMapping("/medscat/{idCat}")
    public List<Medicament> getMedicamentsByCatId(@PathVariable("idCat") Long idCat) {
        return medicamentService.findByCategorieIdCat(idCat);
    }
}
