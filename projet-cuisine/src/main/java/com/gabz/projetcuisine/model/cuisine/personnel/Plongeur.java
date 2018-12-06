package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.StockageVaisselleTextile;
import com.gabz.projetcuisine.model.cuisine.lavage.Evier;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveLinge;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveVaisselle;
import com.gabz.projetcuisine.model.cuisine.lavage.StockALaver;
import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;

public class Plongeur implements IPersonnelBasique {

    private static Plongeur instance = new Plongeur();
    private Evier evier;
    private LaveLinge laveLinge;
    private LaveVaisselle laveVaisselle;
    private StockALaver stockVaisselleEtTextileSale;
    private StockageVaisselleTextile stockageVaisselleTextile;

    private Plongeur() {
    }

    public Evier getEvier() {
        return evier;
    }

    public void setEvier(Evier evier) {
        this.evier = evier;
    }

    public LaveLinge getLaveLinge() {
        return laveLinge;
    }

    public void setLaveLinge(LaveLinge laveLinge) {
        this.laveLinge = laveLinge;
    }

    public LaveVaisselle getLaveVaisselle() {
        return laveVaisselle;
    }

    public void setLaveVaisselle(LaveVaisselle laveVaisselle) {
        this.laveVaisselle = laveVaisselle;
    }

    public StockALaver getStockVaisselleEtTextileSale() {
        return stockVaisselleEtTextileSale;
    }

    public void setStockVaisselleEtTextileSale(StockALaver stockVaisselleEtTextileSale) {
        this.stockVaisselleEtTextileSale = stockVaisselleEtTextileSale;
    }

    public StockageVaisselleTextile getStockageVaisselleTextile() {
        return stockageVaisselleTextile;
    }

    public void setStockageVaisselleTextile(StockageVaisselleTextile stockageVaisselleTextile) {
        this.stockageVaisselleTextile = stockageVaisselleTextile;
    }

    public Plongeur getInstace() {
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

    public void chargerLaveVaisseele() {

    }

    public void chargerLaveLinge() {

    }
}
