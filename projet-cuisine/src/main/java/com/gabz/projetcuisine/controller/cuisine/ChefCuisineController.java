package com.gabz.projetcuisine.controller.cuisine;

import com.gabz.projetcuisine.model.common.repas.Commande;
import com.gabz.projetcuisine.model.cuisine.personnel.ChefCuisine;
import com.gabz.projetcuisine.view.ChefCuisineView;
import org.springframework.stereotype.Controller;

@Controller
public class ChefCuisineController {

    private ChefCuisine chefCuisine;
    private ChefCuisineView chefCuisineView;

    public void onCommandeRecue(Commande commande) throws InterruptedException {
        chefCuisine.organiserCommande(commande);
    }
}
