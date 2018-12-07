package com.gabz.projetcuisine.model.common.repas;

import com.gabz.projetcuisine.model.cuisine.repas.Recette;

import javax.persistence.*;

@Entity
public class Plat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    @JoinColumn(name = "recette_id")
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
