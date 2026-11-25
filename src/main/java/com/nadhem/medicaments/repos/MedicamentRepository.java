package com.nadhem.medicaments.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.nadhem.medicaments.entities.Medicament;
import com.nadhem.medicaments.entities.Types;

@RepositoryRestResource(path = "rest")
public interface MedicamentRepository extends JpaRepository<Medicament, Long> {
    List<Medicament> findByNomMedicament(String nom);
    List<Medicament> findByNomMedicamentContains(String nom);

    @Query("select m from Medicament m where m.nomMedicament like %:nom and m.prixMedicament > :prix")
    List<Medicament> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);

    @Query("select m from Medicament m where m.type = ?1")
    List<Medicament> findByType(Types type);

    List<Medicament> findByTypeIdTypes(Long id);

    List<Medicament> findByOrderByNomMedicamentAsc();

    @Query("select m from Medicament m order by m.nomMedicament ASC, m.prixMedicament DESC")
    List<Medicament> trierMedicamentsNomsPrix();
}
