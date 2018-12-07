package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.StockageVaisselleTextile;
import com.gabz.projetcuisine.model.common.textile.Textile;
import com.gabz.projetcuisine.model.common.vaisselle.Vaisselle;
import com.gabz.projetcuisine.model.cuisine.lavage.Evier;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveLinge;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveVaisselle;
import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Plongeur implements IPersonnelBasique {

    private static Plongeur instance = new Plongeur();
    private Evier evier;
    private LaveLinge laveLinge;
    private LaveVaisselle laveVaisselle;

    private Plongeur() {

        evier = Evier.getInstance();
        laveLinge = LaveLinge.getInstance();
        laveVaisselle = LaveVaisselle.getInstance();
    }

    public Evier getEvier() {
        return evier;
    }

    public LaveLinge getLaveLinge() {
        return laveLinge;
    }

    public LaveVaisselle getLaveVaisselle() {
        return laveVaisselle;
    }

    public static Plongeur getInstance() {
        return instance;
    }

    @Override
    public void eplucherLegume(Ingredient ingredient) {

    }

    public void laverMateriel() {

        evier.demarrerLavage();
    }

    public void laverTextile() {

        laveLinge.demarrerLavage();
    }

    public void laverVaisselle() {

        laveVaisselle.demarrerLavage();
    }

    public void chargerLaveVaisselle(StockageVaisselleTextile stock) {

        stock.prendreVaisselle();
    }

    public void viderLaveVaisselle() {

    }

    public void chargerLaveLinge(StockageVaisselleTextile stock) {

    }

    public void viderLaveLinge() {

    }
}
