package com.gabz.projetcuisine.model.cuisine.stockage;

import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecordEtapeRecette;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Stockage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int tempsStockage;
    @OneToMany
    private List<IngredientRecordEtapeRecette> ingredients;

    public Stockage() {
        this.ingredients = new ArrayList<>();
    }

    public int getTempsStockage() {
        return tempsStockage;
    }

    public List<IngredientRecordEtapeRecette> getIngredients() {
        return ingredients;
    }

    public void addIngredientRecordToStockage(IngredientRecordEtapeRecette ingredientRecordEtapeRecette) {
        this.ingredients.add(ingredientRecordEtapeRecette);
    }

}
