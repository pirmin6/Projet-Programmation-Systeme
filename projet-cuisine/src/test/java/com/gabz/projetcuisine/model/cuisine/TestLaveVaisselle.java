package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.common.vaisselle.Vaisselle;
import com.gabz.projetcuisine.model.common.vaisselle.assiette.AssietteCreuse;
import com.gabz.projetcuisine.model.common.vaisselle.assiette.AssietteEntree;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Couteau;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Fourchette;
import com.gabz.projetcuisine.model.common.vaisselle.verre.VerreEau;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveVaisselle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestLaveVaisselle {

    private LaveVaisselle laveVaisselle = LaveVaisselle.getInstance();
    private List<Vaisselle> vaisselles = new ArrayList<>();

    @Test
    public void  testRemplirLaveVaisselle() throws InterruptedException, NoSuchFieldException, IllegalAccessException {

        vaisselles.add(new Fourchette());
        vaisselles.add(new VerreEau());

        laveVaisselle.remplirLaveVaisselle(vaisselles);

        Assert.assertNotNull(laveVaisselle.getFourchettes().get(0));
        Assert.assertEquals(1, laveVaisselle.getFourchettes().size());
        Assert.assertNotNull(laveVaisselle.getVerres().get(0));
        Assert.assertEquals(1, laveVaisselle.getVerres().size());
    }

    @Test
    public void testLavage() throws InterruptedException, NoSuchFieldException, IllegalAccessException {

        vaisselles.add(new Fourchette());
        vaisselles.add(new Couteau());
        vaisselles.add(new AssietteEntree());
        vaisselles.add(new AssietteCreuse());

        laveVaisselle.remplirLaveVaisselle(vaisselles);

        laveVaisselle.demarrerLavage();

        for (Vaisselle v: laveVaisselle.getAssiettes()
             ) {
            Assert.assertTrue(v.isPropre());
        }

        for (Vaisselle v: laveVaisselle.getCouteaux()
                ) {
            Assert.assertTrue(v.isPropre());
        }

        for (Vaisselle v: laveVaisselle.getFourchettes()
                ) {
            Assert.assertTrue(v.isPropre());
        }

    }

    @Test
    public void viderLaveVaisselle() throws InterruptedException, NoSuchFieldException, IllegalAccessException {

        laveVaisselle.viderLaveVaisselle();

        vaisselles.add(new Fourchette());
        vaisselles.add(new Couteau());
        vaisselles.add(new AssietteEntree());
        vaisselles.add(new AssietteCreuse());

        laveVaisselle.remplirLaveVaisselle(vaisselles);

        laveVaisselle.demarrerLavage();

        List<Vaisselle> vaisselle = laveVaisselle.viderLaveVaisselle();

        Assert.assertEquals(4, vaisselle.size());
    }

}