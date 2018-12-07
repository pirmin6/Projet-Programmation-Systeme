package com.gabz.projetcuisine.model.cuisine.stockage;

import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecord;
import com.gabz.projetcuisine.repository.IngredientRepository;
import com.gabz.projetcuisine.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.OneToMany;
import java.util.List;

public class Stockage {

    @Autowired
    private StockRepository stockRepository;

    private int tempsStockage;
    @OneToMany
    private List<IngredientRecord> ingredients;

    public int getTempsStockage() {
        return tempsStockage;
    }

    public List<IngredientRecord> getIngredients() {
        return ingredients;
    }

    public void addIngredientRecordToStockage(IngredientRecord ingredientRecord) {
        this.ingredients.add(ingredientRecord);
        stockRepository.save(this);
    }

}
