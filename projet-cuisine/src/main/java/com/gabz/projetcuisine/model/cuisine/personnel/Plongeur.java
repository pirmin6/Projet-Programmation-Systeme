package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.StockageVaisselleTextile;
import com.gabz.projetcuisine.model.cuisine.lavage.Evier;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveLinge;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveVaisselle;
import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;

public class Plongeur implements IPersonnelBasique {

    private static Plongeur instance = new Plongeur();
    private Evier evier;
    private LaveLinge laveLinge;
    private LaveVaisselle laveVaisselle;

    private Plongeur() {
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

    }

    public void laverTextile() {

    }

    public void laverVaisselle() {

    }

    public void chargerLaveVaisselle(StockageVaisselleTextile stock) {

    }

    public void chargerLaveLinge(StockageVaisselleTextile stock) {

    }
}
