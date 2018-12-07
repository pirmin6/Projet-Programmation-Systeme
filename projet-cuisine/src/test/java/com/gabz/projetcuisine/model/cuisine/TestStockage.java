package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;
import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecord;
import com.gabz.projetcuisine.model.cuisine.repas.TypeIngredient;
import com.gabz.projetcuisine.model.cuisine.stockage.Stockage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestStockage {

    private Stockage stockage;

    @Test
    public void testAddIngredientRecordToStockage(){

        stockage = new Stockage();
        stockage.addIngredientRecordToStockage(new IngredientRecord(new Ingredient("string ", TypeIngredient.LEGUME), 4, 20));
        Assert.assertEquals(4, stockage.getIngredients().size());

    }

    @Test
    public void testGetIngredients(){

        stockage = new Stockage();
        Assert.assertNotNull(stockage.getIngredients());
    }

    @Test
    public void testGetTempsStockage(){

        stockage = new Stockage();
        Assert.assertNotNull(stockage.getTempsStockage());
    }


}
