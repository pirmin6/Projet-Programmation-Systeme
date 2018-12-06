package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.repas.Plat;
import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;
import com.gabz.projetcuisine.model.common.repas.ComptoirPlatAttente;
import com.gabz.projetcuisine.model.cuisine.stockage.Stockage;

import java.util.List;

public class Commis implements IPersonnelBasique{

    private static int nbrInstance = 2;
    private static List<Stockage> stockages;
    private static List<ComptoirPlatAttente> comptoirPlats;

    public Commis(List<Stockage> stockage) {
        this.stockages = stockage;
    }

    public static int getNbrInstance() {
        return nbrInstance;
    }

    public static List<ComptoirPlatAttente> getComptoirPlats() {
        return comptoirPlats;
    }

    public static List<Stockage> getStockages() {
        return stockages;
    }

    @Override
    public void eplucherLegume(Ingredient ingredient) {

    }

    public void chercherIngredient(Ingredient ingredient) {

    }

    public void jeterIngredient() {

    }

    public void amenerPlatComptoir(Plat plat) {}
}
