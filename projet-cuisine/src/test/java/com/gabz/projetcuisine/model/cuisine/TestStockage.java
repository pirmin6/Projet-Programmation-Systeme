package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.cuisine.repas.Ingredient;
import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecord;
import com.gabz.projetcuisine.model.cuisine.repas.TypeIngredient;
import com.gabz.projetcuisine.model.cuisine.stockage.Stockage;
import com.gabz.projetcuisine.repository.StockRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
@AutoConfigureTestDatabase
public class TestStockage {

    private Stockage stockage;

    @Autowired
    private StockRepository stockRepository;

/*
    @Test
    public void testAddIngredientRecordToStockage(){

        stockage = new Stockage();
        stockage.addIngredientRecordToStockage(new IngredientRecord(new Ingredient("carotte", TypeIngredient.LEGUME), 4, 20), stockRepository);
        Assert.assertEquals(4, stockage.getIngredients().size());

    }

    @Test
    public void testGetIngredients(){

        stockage = new Stockage();
        stockage.addIngredientRecordToStockage(new IngredientRecord(new Ingredient("carotte", TypeIngredient.LEGUME), 4, 20), stockRepository);
        Assert.assertNotNull(stockage.getIngredients());
    }
*/
    @Test
    public void testGetTempsStockage(){

        stockage = new Stockage();
        Assert.assertNotNull(stockage.getTempsStockage());
    }

    @Test
    public void testBDD(){
    }


}
