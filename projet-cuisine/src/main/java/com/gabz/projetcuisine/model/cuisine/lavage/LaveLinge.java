package com.gabz.projetcuisine.model.cuisine.lavage;

import com.gabz.projetcuisine.model.common.textile.Textile;

import java.util.ArrayList;
import java.util.List;

public class LaveLinge extends java.util.Observable {

    private static LaveLinge instance = new LaveLinge();
    private List<Textile> textileList = new ArrayList<>();

    private LaveLinge() {}

    public static LaveLinge getInstance() {
        return instance;
    }

    public List<Textile> getTextileList() {
        return textileList;
    }

    public List<Textile> remplirEtViderLaveLinge(List<Textile> textiles) throws InterruptedException {

        Thread.sleep(1);
        List<Textile> textilesSortant = textileList;
        textileList = textiles;

        return textilesSortant;
    }

    public List<Textile> viderLageLinge() {

        List<Textile> textilesSortant = textileList;
        textileList = new ArrayList<>();

        return textilesSortant;
    }

    public void demarrerLavage() throws InterruptedException {

        Thread.sleep(15);
        textileList.forEach(textile -> {
            textile.setPropre(true);
        });
    }
}