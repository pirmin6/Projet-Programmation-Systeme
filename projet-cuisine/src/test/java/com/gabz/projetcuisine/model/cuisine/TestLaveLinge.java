package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.common.textile.Nappe;
import com.gabz.projetcuisine.model.common.textile.Serviette;
import com.gabz.projetcuisine.model.common.textile.Textile;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveLinge;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.List;

public class TestLaveLinge {

    private LaveLinge laveLinge = LaveLinge.getInstance();
    private List<Textile> textiles = new ArrayList<>();

    @Test
    public void testRemplirLaveLinge() throws InterruptedException {

        textiles.add(new Nappe());
        textiles.add(new Serviette());
        textiles.add(new Nappe());

        List<Textile> textilesSortant = laveLinge.remplirEtViderLaveLinge(textiles);
        Assert.assertEquals(0, textilesSortant.size());
        Assert.assertEquals(3, laveLinge.getTextileList().size());

        laveLinge.demarrerLavage();

        textilesSortant = laveLinge.viderLageLinge();

        Assert.assertEquals(3, textilesSortant.size());

        for (int i = 0; i < textilesSortant.size(); i++) {
            Assert.assertTrue(textilesSortant.get(i).isPropre());
        }
    }

}
