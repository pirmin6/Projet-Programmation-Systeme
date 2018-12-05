package com.gabz.projetcuisine.model.cuisine.materiel;

import java.util.concurrent.Semaphore;

public class CuillereBois extends Materiel{

    private static Semaphore nbrInstance = new Semaphore(10);

    CuillereBois() throws InterruptedException {
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
