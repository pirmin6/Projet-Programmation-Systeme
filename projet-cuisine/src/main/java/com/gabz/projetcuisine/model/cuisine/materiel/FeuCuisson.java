package com.gabz.projetcuisine.model.cuisine.materiel;

import java.util.concurrent.Semaphore;

public class FeuCuisson extends Materiel {

    private static Semaphore nbrInstance = new Semaphore(5);

    FeuCuisson() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
        this.tempsLavage = 0;
    }

    public void remettreEnService() {
        if (this.propre == true) {
            this.nbrInstance.release();
        }
    }

}
