package com.gabz.projetcuisine.model.cuisine.materiel;

import com.gabz.projetcuisine.model.cuisine.lavage.Evier;

import java.util.concurrent.Semaphore;

public class Poele extends Materiel {

    private static Semaphore nbrInstance = new Semaphore(10);

    public Poele() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
        this.tempsLavage = 60;
    }

    @Override
    public void remettreEnService() {
        if (this.propre == true) {
            this.nbrInstance.release();
        }
    }

    @Override
    public void poserSurEvier() {
        Evier.getInstance().ajouterMateriel(this);
    }

    @Override
    public void monopoliserMateriel() throws InterruptedException {
        nbrInstance.acquire();
    }
}
