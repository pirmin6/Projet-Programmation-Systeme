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
    private Ingredient ingredient;
    private int quantité;
    private int joursAvantPeremption;

    public int getId() {
        return id;
    }

    public IngredientRecord(Ingredient ingredient, int quantité, int joursAvantPeremption) {
        this.ingredient = ingredient;
        this.quantité = quantité;
        this.joursAvantPeremption = joursAvantPeremption;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public int getQuantité() {
        return quantité;
    }

    public int getJoursAvantPeremption() {
        return joursAvantPeremption;
    }

}
