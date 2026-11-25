package com.nadhem.medicaments.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Types {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTypes;
    private String nomTypes;
    private String descriptionTypes;

    @JsonIgnore
    @OneToMany(mappedBy = "type")
    private List<Medicament> medicaments;

    public Types(String nomTypes, String descriptionTypes) {
        this.nomTypes = nomTypes;
        this.descriptionTypes = descriptionTypes;
    }

    // Alias pour compatibilité
    public Long getIdType() { return idTypes; }
    public void setIdType(Long idType) { this.idTypes = idType; }
    public String getNomType() { return nomTypes; }
    public void setNomType(String nomType) { this.nomTypes = nomType; }

    public Long getIdCat() { return idTypes; }
    public void setIdCat(Long idCat) { this.idTypes = idCat; }
    public String getNomCat() { return nomTypes; }
    public void setNomCat(String nomCat) { this.nomTypes = nomCat; }
    public String getDescriptionCat() { return descriptionTypes; }
    public void setDescriptionCat(String descriptionCat) { this.descriptionTypes = descriptionCat; }
}
