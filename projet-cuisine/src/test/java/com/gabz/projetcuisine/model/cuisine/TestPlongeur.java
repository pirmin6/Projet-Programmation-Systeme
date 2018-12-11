package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.common.StockageVaisselleTextile;
import com.gabz.projetcuisine.model.common.textile.Nappe;
import com.gabz.projetcuisine.model.common.textile.Textile;
import com.gabz.projetcuisine.model.common.vaisselle.Vaisselle;
import com.gabz.projetcuisine.model.common.vaisselle.assiette.AssietteEntree;
import com.gabz.projetcuisine.model.cuisine.materiel.Materiel;
import com.gabz.projetcuisine.model.cuisine.personnel.Plongeur;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestPlongeur {

    private Plongeur plongeur;
    private List<Textile> textiles;
    private List<Vaisselle> vaisselles;
    private List<Materiel> materiels;
    private StockageVaisselleTextile stockSale;
    private StockageVaisselleTextile stockPropre;

    @Before
    public void setEnvironnement() throws InterruptedException {

        stockSale = new StockageVaisselleTextile();
        stockSale.addTextile(new Nappe());
        stockSale.addVaisselle(new AssietteEntree());

        stockPropre = new StockageVaisselleTextile();
    }

    @Test
    public void testPlongeurConstructor() {

        plongeur = Plongeur.getInstance();
        Assert.assertNotNull(plongeur.getEvier());
        Assert.assertNotNull(plongeur.getLaveLinge());
        Assert.assertNotNull(plongeur.getLaveVaisselle());
    }

    @Test
    public void testPlongeurChargerMachine() throws InterruptedException, NoSuchFieldException, IllegalAccessException {

        plongeur = Plongeur.getInstance();

        plongeur.chargerLaveLinge(stockSale);
        plongeur.chargerLaveVaisselle(stockSale);

        Assert.assertEquals(1, plongeur.getLaveLinge().getTextileList().size());
        Assert.assertEquals(1, plongeur.getLaveVaisselle().getAssiettes().size());
    }

    @Test
    public void testPlongeurLaver() throws InterruptedException, NoSuchFieldException, IllegalAccessException {

        plongeur = Plongeur.getInstance();
        plongeur.chargerLaveLinge(stockSale);
        plongeur.chargerLaveVaisselle(stockSale);

        plongeur.laverTextile();
        plongeur.laverVaisselle();

        Assert.assertTrue(plongeur.getLaveLinge().getTextileList().get(0).isPropre());
        Assert.assertTrue(plongeur.getLaveVaisselle().getAssiettes().get(0).isPropre());
    }

    @Test
    public void testPlongeurVider() throws InterruptedException, NoSuchFieldException, IllegalAccessException {

        plongeur = Plongeur.getInstance();
        plongeur.chargerLaveLinge(stockSale);
        plongeur.chargerLaveVaisselle(stockSale);

        plongeur.laverTextile();
        plongeur.laverVaisselle();

        plongeur.viderLaveLinge(stockPropre);
        plongeur.viderLaveVaisselle(stockPropre);

        Assert.assertTrue(plongeur.getLaveVaisselle().viderLaveVaisselle().isEmpty());
        Assert.assertTrue(plongeur.getLaveLinge().viderLageLinge().isEmpty());
        Assert.assertTrue(stockPropre.getVaisselles().get(0).isPropre());
        Assert.assertTrue(stockPropre.getTextiles().get(0).isPropre());

    }

}
