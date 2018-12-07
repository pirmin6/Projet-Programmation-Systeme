package com.gabz.projetcuisine.model.cuisine.repas;

import javax.persistence.*;
import java.util.List;

@Entity
public class IngredientRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Ingredient ingredient;
    private int quantité;
    private int joursAvantPeremption;

    public int getId() {
        return id;
    }

    public IngredientRecord(Ingredient ingredient1, int quantité, int joursAvantPeremption) {
        this.ingredient = ingredient1;
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
