package com.gabz.projetcuisine.model.cuisine.repas;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recette {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    @OneToMany(cascade = CascadeType.ALL)
    private List<EtapeRecette> etapes;
    @OneToMany(cascade = CascadeType.ALL)
    private List<IngredientRecord> ingredients;
    private boolean prepEnAmont;
    private TypeRecette typeRecette;
    private int nbrPersonne;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public List<EtapeRecette> getEtapes() {
        return etapes;
    }

    public boolean isPrepEnAmont() {
        return prepEnAmont;
    }

    public TypeRecette getTypeRecette() {
        return typeRecette;
    }

    public int getNbrPersonne() {
        return nbrPersonne;
    }

    public List<IngredientRecord> getIngredients() {
        return ingredients;
    }

    public Recette(String nom, List<EtapeRecette> etapes, List<IngredientRecord> ingredients, boolean prepEnAmont,
                   TypeRecette typeRecette, int nbrPersonne) {
        this.nom = nom;
        this.etapes = etapes;
        this.ingredients = ingredients;
        this.prepEnAmont = prepEnAmont;
        this.typeRecette = typeRecette;
        this.nbrPersonne = nbrPersonne;
    }
}
