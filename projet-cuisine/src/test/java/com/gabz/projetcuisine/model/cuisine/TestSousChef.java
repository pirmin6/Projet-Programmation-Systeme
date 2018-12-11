package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.exception.InstanciationNotAllowedException;
import com.gabz.projetcuisine.model.common.repas.ComptoirPlatAttente;
import com.gabz.projetcuisine.model.cuisine.personnel.ChefCuisine;
import com.gabz.projetcuisine.model.cuisine.personnel.ChefPartie;
import org.junit.Assert;
import org.junit.Test;


public class TestSousChef {

    private ChefPartie chefPartie1 = ChefCuisine.getInstance().getChefParties().get(0);
    private ChefPartie chefPartie2 = ChefCuisine.getInstance().getChefParties().get(1);

    public TestSousChef() throws InstanciationNotAllowedException {
    }

    @Test(expected = InstanciationNotAllowedException.class)
    public void testnbrInstanceMax() throws InstanciationNotAllowedException {

        ChefPartie chefPartie = new ChefPartie();
    }

    @Test
    public void testCuisinerPlat() {

        chefPartie1.faireRecette();
        Assert.assertEquals(1, ComptoirPlatAttente.getComptoir().getPlats().size());
    }
}
