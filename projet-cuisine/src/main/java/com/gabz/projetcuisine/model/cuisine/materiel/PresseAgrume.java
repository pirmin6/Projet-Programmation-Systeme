package com.gabz.projetcuisine.model.cuisine.materiel;

import java.util.concurrent.Semaphore;

public class PresseAgrume extends Materiel {

    private static Semaphore nbrInstance = new Semaphore(1);

    PresseAgrume() throws InterruptedException {
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
}
