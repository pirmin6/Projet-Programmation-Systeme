package com.gabz.projetcuisine.model.cuisine.materiel;

import java.util.concurrent.Semaphore;

public class Entonoir extends Materiel {

    private static Semaphore nbrInstance = new Semaphore(1);

    Entonoir() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
        this.tempsLavage = 30;
    }

    @Override
    public void remettreEnService() {
        if (this.propre == true) {
            this.nbrInstance.release();
        }
    }
}
