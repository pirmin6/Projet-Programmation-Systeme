package com.gabz.projetcuisine.model.cuisine;

        import com.gabz.projetcuisine.model.common.repas.Carte;
        import com.gabz.projetcuisine.model.common.repas.Plat;
        import com.gabz.projetcuisine.model.cuisine.personnel.ChefCuisine;
        import com.gabz.projetcuisine.model.cuisine.personnel.ChefPartie;
        import com.gabz.projetcuisine.model.cuisine.repas.Recette;
        import com.gabz.projetcuisine.model.cuisine.repas.TypeRecette;
        import org.junit.Assert;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.Date;
        import java.util.List;

public class TestChefCuisine {

    private Plat plat = new Plat(new Recette("oui", new ArrayList<>(), false, TypeRecette.PLAT, 1), "plat");

    private Carte carte = new Carte(new Date(), new ArrayList<>(), plat);
    private ChefCuisine chefCuisine = ChefCuisine.getInstance(carte);

    @Test
    public void testConstructeur() {

        Assert.assertNotNull(chefCuisine.getChefParties());
    }

    @Test
    public void testChoixSousChef() throws InterruptedException {

        List<ChefPartie> chefsPartie = new ArrayList<>();
        chefsPartie.add(new ChefPartie());
        chefsPartie.add(new ChefPartie());
        chefCuisine.setChefParties(chefsPartie);

        chefCuisine.getChefParties().get(0).setAvailable(false);
        chefCuisine.getChefParties().get(1).setAvailable(true);
        chefCuisine.choisirChefPartie();
        Assert.assertFalse(chefCuisine.getChefParties().get(1).isAvailable());
    }

    @Test
    public void testChangerCarte() {

        chefCuisine.ajouterPlatCarte(plat);
        Assert.assertNotNull(carte.getPlats());

        chefCuisine.retirerPlatCarte();
        Assert.assertNull(carte.getPlats());
    }


}
