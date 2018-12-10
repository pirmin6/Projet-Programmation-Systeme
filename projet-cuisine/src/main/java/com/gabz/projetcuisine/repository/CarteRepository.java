package com.gabz.projetcuisine.repository;

import com.gabz.projetcuisine.model.common.repas.Carte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteRepository extends JpaRepository<Carte, Integer> {
}
