package com.gabz.projetcuisine.model.cuisine.materiel;

import com.gabz.projetcuisine.model.cuisine.Ingredient;

import java.util.List;
import java.util.concurrent.Semaphore;

public class CuillereBois extends Materiel{

    private static Semaphore nbrInstance = new Semaphore(10);

    CuillereBois() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
        this.tempsLavage = 30;
    }

    public void remettreEnService() {
        if (this.propre == true) {
            this.nbrInstance.release();
        }
    }
}
