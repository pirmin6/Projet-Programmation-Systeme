package com.gabz.projetcuisine.model.common.vaisselle.verre;

import java.util.concurrent.Semaphore;

public class FluteChampagne extends Verre {

    private static Semaphore nbrInstance = new Semaphore(150);

    public FluteChampagne() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }
}
