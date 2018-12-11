package com.gabz.projetcuisine.model.cuisine;

import com.gabz.projetcuisine.model.common.repas.Plat;
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

        commis = new Commis(new ArrayList<>());
        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecord> ingredientRecords = new ArrayList<>();

        ingredientRecords.add(new IngredientRecord(new Ingredient("Poulet", TypeIngredient.VIANDE),1,1));
        ingredientRecords.add(new IngredientRecord(new Ingredient("huile OLIVE", TypeIngredient.AUTRE), 1, 1));

        List<Materiel> materielEtape1 = new ArrayList<>();

        materielEtape1.add(new CouteauCuisine());
        EtapeRecette etape1 = new EtapeRecette("Couper le poulet en lamelles", true, 60, 1,
                materielEtape1, false);

        List<Materiel> materielEtape2 = new ArrayList<>();
        materielEtape1.add(new Poele());
        EtapeRecette etape2 = new EtapeRecette("Cuire le poulet à la poele", false, 240, 2
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
        this.commis = new Commis(new ArrayList<>());
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


