package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.exception.InstanciationNotAllowedException;
import com.gabz.projetcuisine.model.common.repas.ComptoirPlatAttente;
import com.gabz.projetcuisine.model.cuisine.personnel.ChefPartie;
import org.junit.Assert;
import org.junit.Test;


public class TestSousChef {

    private ChefPartie chefPartie1 = new ChefPartie();
    private ChefPartie chefPartie2 = new ChefPartie();

    @Test(expected = InstanciationNotAllowedException.class)
    public void testnbrInstanceMax() {

        ChefPartie chefPartie = new ChefPartie();
    }

    @Test
    public void testCuisinerPlat() {

        //chefPartie1.faireRecette();
        Assert.assertEquals(1, ComptoirPlatAttente.getComptoir().getPlats().size());
    }
}
