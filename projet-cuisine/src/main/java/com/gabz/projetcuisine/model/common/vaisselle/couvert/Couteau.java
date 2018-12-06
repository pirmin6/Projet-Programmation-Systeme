package com.gabz.projetcuisine.model.common.vaisselle.couvert;

import java.util.concurrent.Semaphore;

public class Couteau extends Couvert {

    private static Semaphore nbrInstance = new Semaphore(150);

    public Couteau() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }
}
