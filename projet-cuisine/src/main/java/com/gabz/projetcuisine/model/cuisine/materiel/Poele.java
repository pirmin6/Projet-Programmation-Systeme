package com.gabz.projetcuisine.model.cuisine.materiel;

import java.util.concurrent.Semaphore;

public class Poele extends Materiel {

    private static Semaphore nbrInstance = new Semaphore(10);

    Poele() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
        this.tempsLavage = 1;
    }

    public void remettreEnService() {
        if (this.propre == true) {
            this.nbrInstance.release();
        }
    }
}
