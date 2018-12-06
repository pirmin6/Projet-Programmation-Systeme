package com.gabz.projetcuisine.model.common.textile;

import java.util.concurrent.Semaphore;

public class Nappe extends Textile {

    private static Semaphore nbrInstance = new Semaphore(40);

    Nappe() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }
}
