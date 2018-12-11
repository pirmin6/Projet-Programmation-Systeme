package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.CocoCuisto;
import com.gabz.projetcuisine.exception.InstanciationNotAllowedException;
import com.gabz.projetcuisine.model.common.repas.ComptoirPlatAttente;
import com.gabz.projetcuisine.model.common.repas.Plat;
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
    public void testCuisinerPlat() throws InterruptedException, IllegalAccessException, InstantiationException, ClassNotFoundException {

        chefPartie1.faireRecette(new Plat(new CocoCuisto().poulet(), "Pate de sanglier"));
        Assert.assertEquals(1, ComptoirPlatAttente.getComptoir().getPlats().size());
    }
}