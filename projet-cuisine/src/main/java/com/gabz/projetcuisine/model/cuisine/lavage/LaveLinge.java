package com.gabz.projetcuisine.model.cuisine.lavage;

import com.gabz.projetcuisine.model.common.textile.Textile;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class LaveLinge extends Observable {

    private static LaveLinge instance = new LaveLinge();
    private List<Textile> textileList = new ArrayList<>();

    private LaveLinge() {
    }

    public static LaveLinge getInstance() {
        return instance;
    }

    public synchronized List<Textile> getTextileList() {
        return textileList;
    }

    public synchronized List<Textile> remplirEtViderLaveLinge(List<Textile> textiles) throws InterruptedException {

        Thread.sleep(1);
        List<Textile> textilesSortant = textileList;

        textileList = textiles;

        if (textiles.size() > 9) {

            // Si il y a 10 textiles dans la machine, alors le plongeur doit mettre la machine en route
            new Thread(() -> notifyObservers()).start();
        }

        return textilesSortant;
    }

    public synchronized List<Textile> viderLageLinge() {

        List<Textile> textilesSortant = textileList;
        textileList = new ArrayList<>();

        return textilesSortant;
    }

    public synchronized void demarrerLavage() throws InterruptedException {

        Thread.sleep(15 * 60000);
        textileList.forEach(textile -> {
            textile.setPropre(true);
        });
    }
}
