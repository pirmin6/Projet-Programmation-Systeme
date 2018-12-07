package com.gabz.projetcuisine.model.cuisine.stockage;

import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecord;

import java.util.List;

public class Stockage {

    private int tempsStockage;
    private List<IngredientRecord> ingredients;

    public int getTempsStockage() {
        return tempsStockage;
    }

    public List<IngredientRecord> getIngredients() {
        return ingredients;
    }

    public void addIngredientRecordToStockage(IngredientRecord ingredientRecord) {
        this.ingredients.add(ingredientRecord);
    }

}
