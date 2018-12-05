package com.gabz.projetcuisine.model.cuisine.materiel;

import java.util.concurrent.Semaphore;

public class FrigoTravail extends Materiel {

    private static Semaphore nbrInstance = new Semaphore(1);

    FrigoTravail() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
        this.tempsLavage = 0;
    }

    @Override
    public void remettreEnService() {
        if (this.propre == true) {
            this.nbrInstance.release();
        }
    }
}
