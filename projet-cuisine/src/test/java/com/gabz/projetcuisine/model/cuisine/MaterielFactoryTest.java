package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.cuisine.materiel.CouteauCuisine;
import com.gabz.projetcuisine.model.cuisine.materiel.MaterielFactory;
import org.junit.Assert;
import org.junit.Test;

public class MaterielFactoryTest {

    private MaterielFactory materielFactory = MaterielFactory.getMaterielFactory();

    @Test
    public void testMaterielFactory() throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        Assert.assertTrue(materielFactory.getMateriel(CouteauCuisine.class.getName()) instanceof CouteauCuisine);
    }
}
