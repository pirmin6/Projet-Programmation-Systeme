package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.repas.Plat;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Couteau;
import com.gabz.projetcuisine.model.cuisine.materiel.CouteauCuisine;
import com.gabz.projetcuisine.model.cuisine.materiel.Materiel;
import com.gabz.projetcuisine.model.cuisine.materiel.Poele;
import com.gabz.projetcuisine.model.cuisine.personnel.Commis;
import com.gabz.projetcuisine.model.cuisine.repas.*;
import com.gabz.projetcuisine.model.cuisine.stockage.Stockage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCommis {
    private Commis commis;
    private Stockage stockage;
    private Recette recette;
    private Ingredient carotte;

    @Before
    public void initTest() throws InterruptedException {

        Stockage zoneDenree = new Stockage();
        zoneDenree.addIngredientRecordToStockage(new IngredientRecord(
                new Ingredient("poisson", TypeIngredient.VIANDE), 3, 3));
        List<Stockage> stockages = new ArrayList<>();

        commis = new Commis(stockages);
        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecord> ingredientRecords = new ArrayList<>();

        ingredientRecords.add(new IngredientRecord(
                new Ingredient("Poulet", TypeIngredient.VIANDE),1,1));
        ingredientRecords.add(new IngredientRecord(
                new Ingredient("huile OLIVE", TypeIngredient.AUTRE), 1, 1));

        List<String> materielEtape1 = new ArrayList<>();

        materielEtape1.add(Couteau.class.toString());
        EtapeRecette etape1 = new EtapeRecette("Couper le poulet en lamelles", true, 60, 1,
                materielEtape1, false);

        List<String> materielEtape2 = new ArrayList<>();
        materielEtape2.add(Poele.class.toString());
        EtapeRecette etape2 = new EtapeRecette("Cuire le poulet à la poele", false,
                240, 2
                , materielEtape2, true);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);

        recette = new Recette("Poulet à la poele", listeEtapesRecette, ingredientRecords, false, TypeRecette.PLAT);
    }

    @Test
    public void testAjouterPlat(){

        commis.amenerPlatComptoir(new Plat(recette, "test"));
        Assert.assertEquals(1, commis.getComptoirPlats().getPlats().size());
    }

    @Test
    public void testChercherIngredient(){
        this.stockage = new Stockage();
        
        commis.chercherIngredients(new ArrayList<>());
        Assert.assertEquals(0, stockage.getIngredients());

    }


    @Test
    public void testEpluchage() throws InterruptedException {
        this.carotte = new Ingredient("carotte", TypeIngredient.LEGUME);
        this.commis = new Commis(new ArrayList<>());
        commis.faireEtapeRecette(recette.getEtapes().get(0));

        //A compléter
    }

    @Test
    public void testJeterIngredient(){
        this.carotte = new Ingredient("carotte", TypeIngredient.LEGUME);
        this.commis = new Commis(new ArrayList<>());
        commis.jeterIngredient(new IngredientRecord(carotte, 1, 1));
        Assert.assertEquals(null, carotte);
    }
}


