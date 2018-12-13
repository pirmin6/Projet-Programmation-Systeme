package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.repas.Plat;
import com.gabz.projetcuisine.model.common.repas.ComptoirPlatAttente;
import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecordEtapeRecette;
import com.gabz.projetcuisine.model.cuisine.stockage.Stockage;
import com.gabz.projetcuisine.repository.StockRepository;

import java.util.ArrayList;
import java.util.List;

public class Commis extends Cuisinier {

    private static int nbrInstance = 2;
    private static Commis[] instancesCommis = new Commis[2];
    private static List<Stockage> stockages = new ArrayList<>();
    private static ComptoirPlatAttente comptoirPlats;
    private boolean isAvailable = true;
    private StockRepository stockRepository;

    private Commis(List<Stockage> stockage) {
        this.stockages = stockage;
        comptoirPlats = ComptoirPlatAttente.getComptoir();
    }

    // Ces deux méthodes ci dessous permettent l'accès au commis à partir du chef de cuisine
    // sans instancier de sous chef
    public static Commis getFirstCommis(List<Stockage> stockages) {

        if (instancesCommis[0] == null) {

            instancesCommis[0] = new Commis(stockages);
        }
            return instancesCommis[0];
    }

    public static Commis getSecondCommis(List<Stockage> stockages) {

        if (instancesCommis[1] == null) {

            instancesCommis[1] = new Commis(stockages);
        }
        return instancesCommis[1];
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


    public void chercherIngredients(List<IngredientRecordEtapeRecette> ingredients) {


    }

    public void jeterIngredient(IngredientRecordEtapeRecette ingredients) {

    }

    public synchronized void amenerPlatComptoir(Plat plat) {
        ComptoirPlatAttente.getComptoir().addPlat(plat);
    }
}
