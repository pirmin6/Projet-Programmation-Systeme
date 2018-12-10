package com.gabz.projetcuisine.model.common;
import com.gabz.projetcuisine.model.common.repas.Carte;
import com.gabz.projetcuisine.model.common.repas.Commande;
import com.gabz.projetcuisine.model.common.repas.Plat;
import com.gabz.projetcuisine.model.common.repas.Vin;
import com.gabz.projetcuisine.model.cuisine.repas.EtapeRecette;
import com.gabz.projetcuisine.model.cuisine.repas.Recette;
import com.gabz.projetcuisine.model.cuisine.repas.TypeRecette;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestRepas {

    private Carte carte;
    private Commande commande;
    private Plat plat;
    private Vin vin;

    @Test
    public void testCarte(){

        this.plat = new Plat(new Recette("roti de porc", new ArrayList<>(), false, TypeRecette.PLAT, 4), "roti de porc" );

        this.carte = new Carte(new Date(), new ArrayList<>(), plat);
        Assert.assertNotNull(carte.getJour());
        Assert.assertNotNull(carte.getPlats());
        Assert.assertNotNull(carte.getVins());

    }

    @Test
    public void testPlat(){
        this.plat = new Plat(new Recette("roti de porc", new ArrayList<>(), false, TypeRecette.PLAT, 4), "roti de porc" );
        Assert.assertNotNull(plat.getNom());
        Assert.assertNotNull(plat.getRecette());
    }

    @Test
    public void testCommande(){
        this.commande = new Commande(1, new ArrayList<>());
        Assert.assertNotNull(commande.getNumeroTable());
        Assert.assertNotNull(commande.getPlats());
    }

    @Test
    public void testVin(){
        this.vin = new Vin("rosé", Year.now());
        Assert.assertNotNull(vin.getName());
        Assert.assertNotNull(vin.getYear());

    }


}
