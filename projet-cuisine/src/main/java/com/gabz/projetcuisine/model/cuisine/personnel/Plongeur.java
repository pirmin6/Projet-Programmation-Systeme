package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.cuisine.lavage.Evier;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveLinge;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveVaisselle;
import com.gabz.projetcuisine.model.cuisine.lavage.StockALaver;
import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;

public class Plongeur implements IPersonnelBasique {

    private Evier evier;
    private LaveLinge laveLinge;
    private LaveVaisselle laveVaisselle;
    private StockALaver stockVaisselleEtTextileSale;

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
