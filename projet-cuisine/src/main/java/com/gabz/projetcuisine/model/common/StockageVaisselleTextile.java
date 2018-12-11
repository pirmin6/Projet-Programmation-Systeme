package com.gabz.projetcuisine.model.common;

import com.gabz.projetcuisine.model.common.textile.Textile;
import com.gabz.projetcuisine.model.common.vaisselle.Vaisselle;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Fourchette;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class StockageVaisselleTextile {

    private List<Textile> textiles;
    private List<Vaisselle> vaisselles;

    public StockageVaisselleTextile() {
        textiles = new ArrayList<>();
        vaisselles = new ArrayList<>();
    }

    public void addTextile(Textile textile) {
        this.textiles.add(textile);
    }

    public void addTextile(List<Textile> textile) {
        this.textiles.addAll(textile);
    }

    public void addVaisselle(Vaisselle vaisselle) {
        this.vaisselles.add(vaisselle);
    }

    public void addVaisselle(List<Vaisselle> vaisselle) {
        this.vaisselles.addAll(vaisselle);
    }

    public List<Vaisselle> prendreVaisselle() {

        List<Vaisselle> vaisselleTemp = new ArrayList<>();
        vaisselleTemp.addAll(vaisselles);
        vaisselles.clear();
        return vaisselleTemp;
    }

    public List<Textile> prendreTextile() {

        List<Textile> textileTemp = new ArrayList<>();
        textileTemp.addAll(textiles);
        textiles.clear();
        return textileTemp;
    }
}
