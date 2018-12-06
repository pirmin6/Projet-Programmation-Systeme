package com.gabz.projetcuisine.model.common.vaisselle;

import java.util.concurrent.Semaphore;

public class TasseCafe extends Vaisselle{

    private static Semaphore nbrInstance = new Semaphore(50);

    public TasseCafe() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }

}
