package com.gabz.projetcuisine.repository;

import com.gabz.projetcuisine.model.cuisine.stockage.IngredientRecordStockage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<IngredientRecordStockage, Integer> {
}
