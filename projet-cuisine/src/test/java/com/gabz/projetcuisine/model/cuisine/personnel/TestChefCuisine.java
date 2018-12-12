package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.CocoCuisto;
import com.gabz.projetcuisine.exception.InstanciationNotAllowedException;
import com.gabz.projetcuisine.model.common.repas.Carte;
import com.gabz.projetcuisine.model.common.repas.Commande;
import com.gabz.projetcuisine.model.common.repas.ComptoirPlatAttente;
import com.gabz.projetcuisine.model.common.repas.Plat;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestChefCuisine {

    private Plat plat = new Plat(null, "test");
    private Carte carte = new Carte(new Date(), new ArrayList<>(), plat);
    private ChefCuisine chefCuisine = ChefCuisine.getInstance(carte);

    public TestChefCuisine() throws InstanciationNotAllowedException {
    }

    @Test
    public void testConstructeur() {

        Assert.assertNotNull(chefCuisine.getChefParties());
    }

    @Test
    public void testChoixSousChef() throws InterruptedException {

        chefCuisine.getChefParties().get(0).setAvailable(false);
        chefCuisine.getChefParties().get(1).setAvailable(true);
        Assert.assertEquals(chefCuisine.getChefParties().get(1), chefCuisine.choisirChefPartie());
        Assert.assertFalse(chefCuisine.getChefParties().get(1).isAvailable());
    }

    @Test
    public void testChangerCarte() {

        chefCuisine.retirerPlatCarte();
        Assert.assertNull(carte.getPlats());

        chefCuisine.ajouterPlatCarte(plat);
        Assert.assertNotNull(carte.getPlats());

    }

    @Test
    public void commandeRecue() throws InterruptedException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        List<Plat> listePlat = new ArrayList<>();
        listePlat.add(new Plat(CocoCuisto.poulet(), "test1"));
        listePlat.add(new Plat(CocoCuisto.feuilletecrabe(), "test2"));
        listePlat.add(new Plat(CocoCuisto.oeufscocotte(), "test3"));
        Commande commande = new Commande(1, listePlat);

        chefCuisine.organiserCommande(commande);
        Assert.assertEquals(2, ComptoirPlatAttente.getComptoir().getPlats().size());
    }

}
