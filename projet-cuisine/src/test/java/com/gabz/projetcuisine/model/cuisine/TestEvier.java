package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.cuisine.lavage.Evier;
import com.gabz.projetcuisine.model.cuisine.materiel.CuillereBois;
import com.gabz.projetcuisine.model.cuisine.materiel.Poele;
import org.junit.Assert;
import org.junit.Test;

public class TestEvier {

    private Evier evier = Evier.getInstance();

    @Test
    public void ajouterMaterielEvier() throws InterruptedException {

        evier.ajouterMateriel(new CuillereBois());

        Assert.assertEquals(1, evier.getMateriels().size());
    }

    @Test
    public void laverMateriel() throws InterruptedException {

        Poele poele = new Poele();

        evier.ajouterMateriel(poele);

        evier.demarrerLavage();

        Assert.assertTrue(poele.isPropre());
    }
}
