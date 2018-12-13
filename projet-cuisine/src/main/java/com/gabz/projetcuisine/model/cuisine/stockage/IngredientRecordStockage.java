package com.gabz.projetcuisine.model.cuisine.stockage;

import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;
import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecordEtapeRecette;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stock")
public class IngredientRecordStockage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int tempsStockage;
    @ManyToOne(cascade = CascadeType.ALL)
    private Ingredient ingredient;
    private int quantité;

    public IngredientRecordStockage(int tempsStockage, Ingredient ingredient, int quantité) {
        this.tempsStockage = tempsStockage;
        this.ingredient = ingredient;
        this.quantité = quantité;
    }

    public int getId() {
        return id;
    }

    public int getTempsStockage() {
        return tempsStockage;
    }

    public void setTempsStockage(int tempsStockage) {
        this.tempsStockage = tempsStockage;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }
}
