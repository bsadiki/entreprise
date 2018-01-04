package com.sadiki.badreddine.entreprise.dao;

import com.sadiki.badreddine.entreprise.entities.Entreprise;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
    Page<Entreprise> findByEntrepriseNomContains(String entrepriseNom, Pageable pageable);
}
