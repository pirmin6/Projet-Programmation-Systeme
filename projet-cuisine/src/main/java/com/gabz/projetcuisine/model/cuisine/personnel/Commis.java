package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.repas.Plat;
import com.gabz.projetcuisine.model.cuisine.repas.EtapeRecette;
import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;
import com.gabz.projetcuisine.model.common.repas.ComptoirPlatAttente;
import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecord;
import com.gabz.projetcuisine.model.cuisine.stockage.Stockage;

import java.util.List;

public class Commis implements ICuisinier {

    private static int nbrInstance = 2;
    private static List<Stockage> stockages;
    private static ComptoirPlatAttente comptoirPlats;
    private boolean isAvailable = true;

    public Commis(List<Stockage> stockage) {
        this.stockages = stockage;
    }

    public static int getNbrInstance() {
        return nbrInstance;
    }

    public static ComptoirPlatAttente getComptoirPlats() {
        return comptoirPlats;
    }

    public static List<Stockage> getStockages() {
        return stockages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public void chercherIngredients(List<IngredientRecord> ingredients) {

    }

    public void jeterIngredient(IngredientRecord ingredients) {

    }

    public void amenerPlatComptoir(Plat plat) {
        ComptoirPlatAttente.getComptoir().addPlat(plat);
    }

    @Override
    public void faireEtapeRecette(EtapeRecette etapeRecette) throws InterruptedException {

    }
}
