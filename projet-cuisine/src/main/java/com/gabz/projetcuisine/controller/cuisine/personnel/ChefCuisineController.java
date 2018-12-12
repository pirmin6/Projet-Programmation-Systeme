package com.gabz.projetcuisine.controller.cuisine.personnel;

import com.gabz.projetcuisine.model.common.repas.Commande;
import com.gabz.projetcuisine.model.cuisine.personnel.ChefCuisine;
import com.gabz.projetcuisine.view.ChefCuisineView;

public class ChefCuisineController {

    private ChefCuisine chefCuisine;
    private ChefCuisineView chefCuisineView;

    public ChefCuisineController(ChefCuisine chefCuisine, ChefCuisineView chefCuisineView) {
        this.chefCuisine = chefCuisine;
        this.chefCuisineView = chefCuisineView;
    }

    public void onCommandeRecue(Commande commande) throws InterruptedException,
            IllegalAccessException, ClassNotFoundException, InstantiationException {
        chefCuisine.organiserCommande(commande);
    }
}
