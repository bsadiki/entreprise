package com.sadiki.badreddine.entreprise.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Entreprise implements Serializable {
    @Id @GeneratedValue
    private Long entrepriseId;
    private String entrepriseNom;
    private String raisonSociale;

    public Entreprise() {
    }

    public Entreprise(String entrepriseNom, String raisonSociale) {

        this.entrepriseNom = entrepriseNom;
        this.raisonSociale = raisonSociale;
    }

    public Long getEntrepriseId() {
        return entrepriseId;
    }

    public void setEntrepriseId(Long entrepriseId) {
        this.entrepriseId = entrepriseId;
    }

    public String getEntrepriseNom() {
        return entrepriseNom;
    }

    public void setEntrepriseNom(String entrepriseNom) {
        this.entrepriseNom = entrepriseNom;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }
}
