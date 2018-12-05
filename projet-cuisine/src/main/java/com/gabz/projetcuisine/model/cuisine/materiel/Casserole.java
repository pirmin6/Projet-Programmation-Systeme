package com.gabz.projetcuisine.model.cuisine.materiel;

import java.util.concurrent.Semaphore;

public class Casserole  extends Materiel {

    private static Semaphore nbrInstance = new Semaphore(10);

    Casserole() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
        this.tempsLavage = 60;
    }

    public void remettreEnService() {
        if (this.propre == true) {
            this.nbrInstance.release();
        }
    }

}
