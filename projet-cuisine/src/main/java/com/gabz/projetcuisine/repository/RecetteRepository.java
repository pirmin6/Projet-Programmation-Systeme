package com.gabz.projetcuisine.repository;

import com.gabz.projetcuisine.model.cuisine.repas.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetteRepository extends JpaRepository<Recette, Integer> {
}
