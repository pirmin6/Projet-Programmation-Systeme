package com.gabz.projetcuisine.model.common.repas;

import com.gabz.projetcuisine.model.cuisine.repas.Recette;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Recette recette;
    private String nom;

    public Plat(Recette recette, String nom) {
        this.recette = recette;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public Recette getRecette() {
        return recette;
    }

    public String getNom() {
        return nom;
    }
}
