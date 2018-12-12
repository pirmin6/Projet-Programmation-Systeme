package com.gabz.projetcuisine.model.cuisine.materiel;

import com.gabz.projetcuisine.model.cuisine.lavage.Evier;

import java.util.concurrent.Semaphore;

public class Entonoir extends Materiel {

    private static Semaphore nbrInstance = new Semaphore(1);

    Entonoir() throws InterruptedException {
        super();
        this.tempsLavage = 30;
    }

    @Override
    public void remettreEnService() {
        if (this.propre == true) {
            this.nbrInstance.release();
        }
    }

    @Override
    public void monopoliserMateriel() throws InterruptedException {
        nbrInstance.acquire();
    }

    @Override
    public void poserSurEvier() {
        Evier.getInstance().ajouterMateriel(this);
    }
}
