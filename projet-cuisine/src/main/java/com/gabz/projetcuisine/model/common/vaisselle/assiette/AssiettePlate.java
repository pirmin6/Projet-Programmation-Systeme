package com.gabz.projetcuisine.model.common.vaisselle.assiette;

import java.util.concurrent.Semaphore;

public class AssiettePlate extends Assiette {

    private static Semaphore nbrInstance = new Semaphore(150);

    public AssiettePlate() throws InterruptedException {
        super();
        this.nbrInstance.acquire();
    }
}