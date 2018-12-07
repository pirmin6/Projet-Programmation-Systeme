package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.common.repas.Plat;
import com.gabz.projetcuisine.model.cuisine.personnel.Commis;
import com.gabz.projetcuisine.model.cuisine.repas.Recette;
import com.gabz.projetcuisine.model.cuisine.repas.TypeRecette;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCommis {
    private Commis mathieu;


    @Test
    public void testAjouterPlat(){
        this.mathieu = new Commis(new ArrayList<>());

        mathieu.amenerPlatComptoir(new Plat(new Recette("roti de porc", new ArrayList<>(), false, TypeRecette.PLAT, 4), "roti de porc"));
        Assert.assertEquals(1, mathieu.getComptoirPlats().getPlats().size());
    }
}
