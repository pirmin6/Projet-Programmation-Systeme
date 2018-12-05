package com.gabz.projetcuisine.model.cuisine.repas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class IngredientRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private List<Ingredient> ingredients;
    private int quantité;
    private int joursAvantPeremption;

    public int getId() {
        return id;
    }

    public IngredientRecord(List<Ingredient> ingredients, int quantité, int joursAvantPeremption) {
        this.ingredients = ingredients;
        this.quantité = quantité;
        this.joursAvantPeremption = joursAvantPeremption;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public int getQuantité() {
        return quantité;
    }

    public int getJoursAvantPeremption() {
        return joursAvantPeremption;
    }

}
