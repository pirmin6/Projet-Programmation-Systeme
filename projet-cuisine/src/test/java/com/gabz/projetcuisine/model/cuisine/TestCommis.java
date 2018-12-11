package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.common.repas.Plat;
import com.gabz.projetcuisine.model.cuisine.personnel.Commis;
import com.gabz.projetcuisine.model.cuisine.repas.*;
import com.gabz.projetcuisine.model.cuisine.stockage.Stockage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCommis {
    private Commis commis;
    private Stockage stockage;
    private Recette recette;
    private Ingredient carotte;
/*

    @Test
    public void testAjouterPlat(){
        this.commis = new Commis(new ArrayList<>());

        commis.amenerPlatComptoir(new Plat(new Recette("roti de porc", new ArrayList<>(), false, TypeRecette.PLAT, 4), "roti de porc"));
        Assert.assertEquals(1, commis.getComptoirPlats().getPlats().size());
    }

    @Test
    public void testChercherIngredient(){
        this.commis = new Commis(new ArrayList<>());
        this.stockage = new Stockage();

        stockage.addIngredientRecordToStockage(new IngredientRecord(new Ingredient("carotte", TypeIngredient.LEGUME), 1, 50));

        commis.chercherIngredients(new ArrayList<>());
        Assert.assertEquals(0, stockage.getIngredients());

    }


    @Test
    public void testEpluchage() throws InterruptedException {
        this.carotte = new Ingredient("carotte", TypeIngredient.LEGUME);
        this.commis = new Commis(new ArrayList<>());
        this.recette = new Recette("carrotes rapées", new ArrayList<>(), false, TypeRecette.PLAT, 1);
        commis.faireEtapeRecette(recette.getEtapes().get(0));

        //A compléter
    }

    @Test
    public void testJeterIngredient(){
        this.carotte = new Ingredient("carotte", TypeIngredient.LEGUME);
        this.commis = new Commis(new ArrayList<>());
        commis.jeterIngredient(new IngredientRecord(carotte, 1, 1));
        Assert.assertEquals(null, carotte);
    } */
}


