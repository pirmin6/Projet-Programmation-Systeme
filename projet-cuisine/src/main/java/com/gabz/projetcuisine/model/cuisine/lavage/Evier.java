package com.gabz.projetcuisine.model.cuisine.lavage;

import com.gabz.projetcuisine.model.cuisine.materiel.Materiel;

import java.util.List;

public class Evier {

    private static Evier instance = new Evier();
    private List<Materiel> materiels;

    private Evier() {

    }

    public static Evier getInstance() {
        return instance;
    }

    public void demarrerLavage() {

    }

    public void ajouterMateriel(Materiel materiel) {

    }
}
