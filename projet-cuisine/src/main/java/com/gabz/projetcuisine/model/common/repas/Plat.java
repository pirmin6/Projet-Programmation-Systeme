package com.gabz.projetcuisine.model.common.repas;

import com.gabz.projetcuisine.model.cuisine.repas.Recette;

import javax.persistence.*;

public class Plat {

    private Recette recette;
    private String nom;

    public Plat(Recette recette, String nom) {
        this.recette = recette;
        this.nom = nom;
    }

    public Recette getRecette() {
        return recette;
    }

    public String getNom() {
        return nom;
    }
}
