package com.nadhem.medicaments.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedicament;
    private String nomMedicament;
    private Double prixMedicament;

    @Temporal(TemporalType.DATE)
    private Date dateExpiration;

    private Boolean ordonnance;
    private Integer stock;

    @ManyToOne
    private Types type;

    public Medicament(String nomMedicament, Double prixMedicament, Date dateExpiration, Boolean ordonnance, Integer stock, Types type) {
        this.nomMedicament = nomMedicament;
        this.prixMedicament = prixMedicament;
        this.dateExpiration = dateExpiration;
        this.ordonnance = ordonnance;
        this.stock = stock;
        this.type = type;
    }

    // Aliases pour compatibilité directe avec le frontend Angular
    public Long getId() {
        return idMedicament;
    }

    public void setId(Long id) {
        this.idMedicament = id;
    }

    public String getNom() {
        return nomMedicament;
    }

    public void setNom(String nom) {
        this.nomMedicament = nom;
    }

    public Double getPrixMillimes() {
        return prixMedicament;
    }

    public void setPrixMillimes(Double prixMillimes) {
        this.prixMedicament = prixMillimes;
    }

    public Types getTypes() {
        return type;
    }

    public void setTypes(Types types) {
        this.type = types;
    }

    public Types getCategorie() {
        return type;
    }

    public void setCategorie(Types categorie) {
        this.type = categorie;
    }
}
