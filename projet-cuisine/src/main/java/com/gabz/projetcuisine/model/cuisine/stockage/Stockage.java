package com.gabz.projetcuisine.model.cuisine.stockage;

import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;
import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecord;

import java.util.List;

public abstract class Stockage {

    protected int tempsStockage;
    protected List<IngredientRecord> ingredients;
    protected int temperature;

    public int getTempsStockage() {
        return tempsStockage;
    }

    public List<IngredientRecord> getIngredients() {
        return ingredients;
    }

    public int getTemperature() {
        return temperature;
    }
}
