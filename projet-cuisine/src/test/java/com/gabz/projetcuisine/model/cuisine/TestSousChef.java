package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.exception.InstanciationNotAllowedException;
import com.gabz.projetcuisine.model.common.repas.ComptoirPlatAttente;
import com.gabz.projetcuisine.model.cuisine.personnel.ChefPartie;
import com.gabz.projetcuisine.model.cuisine.repas.Recette;
import com.gabz.projetcuisine.model.cuisine.repas.TypeRecette;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestSousChef {

    private ChefPartie chefPartie1 = new ChefPartie();
    private ChefPartie chefPartie2 = new ChefPartie();

    @Test(expected = InstanciationNotAllowedException.class)
    public void testnbrInstanceMax() {

        ChefPartie chefPartie = new ChefPartie();
    }

    @Test
    public void testCuisinerPlat() {

        chefPartie1.faireRecette(new Recette("oui", new ArrayList<>(), false, TypeRecette.PLAT, 1));
        Assert.assertEquals(1, ComptoirPlatAttente.getComptoir().getPlats().size());
    }
}
