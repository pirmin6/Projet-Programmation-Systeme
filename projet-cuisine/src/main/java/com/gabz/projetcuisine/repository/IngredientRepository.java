package com.gabz.projetcuisine.repository;

import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
