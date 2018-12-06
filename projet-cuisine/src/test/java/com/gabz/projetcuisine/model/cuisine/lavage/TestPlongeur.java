package com.gabz.projetcuisine.model.cuisine.lavage;

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

    @Before
    public void setEnvironnement() throws InterruptedException {

        stockSale = StockageVaisselleTextile.getInstance();
        Nappe nappe = new Nappe();
        stockSale.addTextile(new Nappe());
        stockSale.addVaisselle(new AssietteEntree());
    }

    @Test
    public void testPlongeurConstructor() {

        this.plongeur = Plongeur.getInstance();
        Assert.assertNotNull(plongeur.getEvier());
        Assert.assertNotNull(plongeur.getLaveLinge());
        Assert.assertNotNull(plongeur.getLaveVaisselle());
    }

    @Test
    public void testPlongeurChargerMachine() {

        this.plongeur = Plongeur.getInstance();

        plongeur.chargerLaveLinge(stockSale);
        plongeur.chargerLaveVaisselle(stockSale);

        Assert.assertEquals(1, plongeur.getLaveLinge().getTextileList());
        Assert.assertEquals(1, plongeur.getLaveVaisselle().getAssiettes());
    }

    @Test
    public void testPlongeurLaver() {

        this.plongeur = Plongeur.getInstance();
        plongeur.chargerLaveLinge(stockSale);
        plongeur.chargerLaveVaisselle(stockSale);
    }

}
