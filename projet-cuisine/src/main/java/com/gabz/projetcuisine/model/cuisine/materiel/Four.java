package com.gabz.projetcuisine.model.cuisine.materiel;

import java.util.concurrent.Semaphore;

public class Four extends Materiel {

    private static Semaphore nbrInstance = new Semaphore(1);

    Four() throws InterruptedException {
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
