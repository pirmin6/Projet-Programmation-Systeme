package com.gabz.projetcuisine.model.common.vaisselle.couvert;

import java.util.concurrent.Semaphore;

public class CuillereSoupe extends Couvert {

    private static Semaphore nbrInstance = new Semaphore(150);

    public CuillereSoupe() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }

}
