package com.gabz.projetcuisine.model.common.vaisselle.verre;

import java.util.concurrent.Semaphore;

public class VerreVin extends Verre {

    private static Semaphore nbrInstance = new Semaphore(150);

    public VerreVin() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }

}
