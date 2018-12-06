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
}
