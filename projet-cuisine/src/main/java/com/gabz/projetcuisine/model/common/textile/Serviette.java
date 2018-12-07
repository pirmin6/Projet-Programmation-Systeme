package com.gabz.projetcuisine.model.common.textile;

import java.util.concurrent.Semaphore;

public class Serviette extends Textile {

    private static Semaphore nbrInstance = new Semaphore(150);

    public Serviette() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }

}
