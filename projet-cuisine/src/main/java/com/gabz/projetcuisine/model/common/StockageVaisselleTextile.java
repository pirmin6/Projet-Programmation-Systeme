package com.gabz.projetcuisine.model.common;

import com.gabz.projetcuisine.model.common.textile.Textile;
import com.gabz.projetcuisine.model.common.vaisselle.Vaisselle;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Fourchette;

import java.util.List;

public class StockageVaisselleTextile {

    private static StockageVaisselleTextile instance = new StockageVaisselleTextile();
    private List<Textile> textiles;
    private List<Vaisselle> vaisselles;

    private StockageVaisselleTextile() {}

    public static StockageVaisselleTextile getInstance() {
        return instance;
    }

    public void addTextile(Textile textile) {
    }

    public void addVaisselle(Vaisselle vaisselle) {
    }

    public List<Vaisselle> prendreVaisselle() {

        List<Vaisselle> vaisselleTemp = vaisselles;
        vaisselles.clear();
        return vaisselleTemp;
    }
}
