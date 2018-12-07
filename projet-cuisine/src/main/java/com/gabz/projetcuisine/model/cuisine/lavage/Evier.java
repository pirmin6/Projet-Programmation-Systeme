package com.gabz.projetcuisine.model.cuisine.lavage;

import com.gabz.projetcuisine.model.cuisine.materiel.Materiel;

import java.util.ArrayList;
import java.util.List;

public class Evier {

    private static Evier instance = new Evier();
    private List<Materiel> materiels;

    private Evier() {
        this.materiels = new ArrayList<>();
    }

    public static Evier getInstance() {
        return instance;
    }

    public List<Materiel> getMateriels() {
        return materiels;
    }

    public List<Materiel> demarrerLavage() throws InterruptedException {

        for (Materiel materiel: materiels) {
            Thread.sleep((long) materiel.getTempsLavage());
            materiel.setPropre(true);
        }

        List<Materiel> materielOut = materiels;
        materiels.clear();
        return materielOut;
    }

    public void ajouterMateriel(Materiel materiel) {
        this.materiels.add(materiel);
    }

}
