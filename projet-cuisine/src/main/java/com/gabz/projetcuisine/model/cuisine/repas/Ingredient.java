package com.gabz.projetcuisine.model.cuisine.repas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private TypeIngredient type;

    public Ingredient(String nom, TypeIngredient type) {
        this.nom = nom;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public TypeIngredient getType() {
        return type;
    }
}
