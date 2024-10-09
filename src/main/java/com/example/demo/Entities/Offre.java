package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Offre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long code;
    private String intitule;
    private String specialite;
    private String societe;
    private int nbPostes;
    private String pays;

    public Offre() {
    }

    public Offre(long code, String intitule, String specialite, String societe, int nbPostes, String pays) {
        this.code = code;
        this.intitule = intitule;
        this.specialite = specialite;
        this.societe = societe;
        this.nbPostes = nbPostes;
        this.pays = pays;
    }

    public Offre(String intitule, String specialite, String societe, int nbPostes, String pays) {
        this.intitule = intitule;
        this.specialite = specialite;
        this.societe = societe;
        this.nbPostes = nbPostes;
        this.pays = pays;
    }

}
