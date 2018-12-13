package com.gabz.projetcuisine.model.cuisine.repas;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ingredient_recette")
public class IngredientRecordEtapeRecette {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Ingredient ingredient;
    private int quantité;

    public int getId() {
        return id;
    }

    public IngredientRecordEtapeRecette(Ingredient ingredient1, int quantité) {
        this.ingredient = ingredient1;
        this.quantité = quantité;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public int getQuantité() {
        return quantité;
    }

}
