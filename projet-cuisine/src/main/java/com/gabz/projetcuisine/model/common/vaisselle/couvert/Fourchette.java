package com.gabz.projetcuisine.model.common.vaisselle.couvert;

import java.util.concurrent.Semaphore;

public class Fourchette extends Couvert{

    private static Semaphore nbrInstance = new Semaphore(150);

    public Fourchette() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }

}
