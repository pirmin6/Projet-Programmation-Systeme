package com.gabz.projetcuisine;

import com.gabz.projetcuisine.model.cuisine.stockage.ChambreFroide;
import com.gabz.projetcuisine.model.cuisine.stockage.Congelateur;
import com.gabz.projetcuisine.model.cuisine.stockage.ZoneDenrees;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStockage {

    private ChambreFroide chambreFroide;
    private Congelateur congelateur;
    private ZoneDenrees zone;

    @Before
    public void initTest() {

        chambreFroide = new ChambreFroide();
        congelateur = new Congelateur();
        zone = new ZoneDenrees();
    }

    @Test
    public void testTemperature() {

        Assert.assertTrue(chambreFroide.getTemperature() <= 4 && chambreFroide.getTemperature() >= 1);
        Assert.assertTrue(congelateur.getTemperature() < 0);
    }
}
