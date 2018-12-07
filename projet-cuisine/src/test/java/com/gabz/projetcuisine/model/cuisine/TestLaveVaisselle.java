package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.common.vaisselle.Vaisselle;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Fourchette;
import com.gabz.projetcuisine.model.common.vaisselle.verre.VerreEau;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveVaisselle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestLaveVaisselle {

    private LaveVaisselle laveVaisselle = LaveVaisselle.getInstance();
    private List<Vaisselle> vaisselles = new ArrayList<>();

    @Test
    public void  testRemplirLaveVaisselle() throws InterruptedException, NoSuchFieldException, IllegalAccessException {

        Fourchette fourchette = new Fourchette();
        VerreEau verreEau = new VerreEau();

        vaisselles.add(fourchette);

        laveVaisselle.remplirLaveVaisselle(vaisselles);


        Assert.assertNotNull(laveVaisselle.getFourchettes()[0]);
        Assert.assertNull(laveVaisselle.getFourchettes()[1]);
    }
}
