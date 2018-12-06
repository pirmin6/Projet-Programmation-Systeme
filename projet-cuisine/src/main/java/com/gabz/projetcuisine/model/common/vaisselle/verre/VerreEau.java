package com.gabz.projetcuisine.model.common.vaisselle.verre;

import java.util.concurrent.Semaphore;

public class VerreEau extends Verre {

    private static Semaphore nbrInstance = new Semaphore(150);

    public VerreEau() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }
}
