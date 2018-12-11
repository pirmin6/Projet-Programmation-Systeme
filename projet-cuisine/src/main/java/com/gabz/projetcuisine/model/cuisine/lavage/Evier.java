package com.gabz.projetcuisine.model.cuisine.lavage;

import com.gabz.projetcuisine.model.cuisine.materiel.Materiel;
import com.gabz.projetcuisine.model.cuisine.personnel.Plongeur;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Evier extends Observable {

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

    public void demarrerLavage() throws InterruptedException {

        for (Materiel materiel: materiels) {
            Thread.sleep((long) materiel.getTempsLavage());
            materiel.remettreEnService();
        }

        materiels.clear();
    }

    public void ajouterMateriel(Materiel materiel) {
        this.materiels.add(materiel);

        new Thread(() -> {
            notifyObservers();
        }).start();
    }

}
