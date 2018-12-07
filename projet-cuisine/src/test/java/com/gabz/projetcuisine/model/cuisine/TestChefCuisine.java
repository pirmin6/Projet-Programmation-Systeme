package com.gabz.projetcuisine.model.cuisine;

        import com.gabz.projetcuisine.model.common.repas.Carte;
        import com.gabz.projetcuisine.model.common.repas.Commande;
        import com.gabz.projetcuisine.model.common.repas.Plat;
        import com.gabz.projetcuisine.model.cuisine.personnel.ChefCuisine;
        import com.gabz.projetcuisine.model.cuisine.personnel.IOrganisationImpl1;
        import com.gabz.projetcuisine.model.cuisine.repas.Recette;
        import com.gabz.projetcuisine.model.cuisine.repas.TypeRecette;
        import org.junit.Assert;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.Date;

public class TestChefCuisine {

    private Carte carte = new Carte(new Date(), new ArrayList<>(), new ArrayList<>());

    private ChefCuisine chefCuisine = ChefCuisine.getInstance(carte, new IOrganisationImpl1());
    private Plat plat = new Plat(new Recette("oui", new ArrayList<>(), false, TypeRecette.PLAT, 1), "plat");

    @Test
    public void testConstructeur() {

        Assert.assertNotNull(chefCuisine.getChefParties());
    }

    @Test
    public void testChoixSousChef() {

        chefCuisine.getChefParties().get(0).setAvailable(false);
        chefCuisine.organiserCommande(new Commande(1, new ArrayList<>()));
        Assert.assertFalse(chefCuisine.getChefParties().get(1).isAvailable());
    }

    @Test
    public void testChangerCarte() {


        chefCuisine.ajouterPlatCarte(plat);
        Assert.assertTrue(carte.getPlats().size() > 0);

        chefCuisine.retirerPlatCarte(plat.getId());

    }

}
