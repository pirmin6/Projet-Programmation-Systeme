package com.gabz.projetcuisine.model.common.vaisselle.couvert;

import java.util.concurrent.Semaphore;

public class CuillereCafe extends Couvert {

    private static Semaphore nbrInstance = new Semaphore(150);

    public CuillereCafe() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }
}
