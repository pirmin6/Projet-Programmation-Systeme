package com.gabz.projetcuisine.model.cuisine.repas;

import javax.persistence.*;
import java.util.List;

@Entity
public class IngredientRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Ingredient ingredients;
    private int quantité;
    private int joursAvantPeremption;

    public int getId() {
        return id;
    }

    public IngredientRecord(Ingredient ingredients, int quantité, int joursAvantPeremption) {
        this.ingredients = ingredients;
        this.quantité = quantité;
        this.joursAvantPeremption = joursAvantPeremption;
    }

    public Ingredient getIngredients() {
        return ingredients;
    }

    public int getQuantité() {
        return quantité;
    }

    public int getJoursAvantPeremption() {
        return joursAvantPeremption;
    }

}
