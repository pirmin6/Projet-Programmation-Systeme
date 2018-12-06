package com.gabz.projetcuisine.model.cuisine.lavage;

import com.gabz.projetcuisine.model.common.textile.Textile;

import java.util.List;

public class LaveLinge {

    private static LaveLinge instance = new LaveLinge();
    private List<Textile> textileList;

    private LaveLinge() {}

    public void ajouterLinge(Textile textile) {

    }

    public void demarrerLavage() {

    }

    public static LaveLinge getInstance() {
        return instance;
    }

    public List<Textile> getTextileList() {
        return textileList;
    }
}
