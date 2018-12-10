package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.repas.Carte;
import com.gabz.projetcuisine.model.common.repas.Commande;
import com.gabz.projetcuisine.model.common.repas.Plat;

import java.util.List;

public class ChefCuisine {

    private static ChefCuisine instance = new ChefCuisine();
    private List<ChefPartie> chefParties;
    private List<Commande> commandes;
    private Carte carte;

    private ChefCuisine() {

    }

    public static ChefCuisine getInstance(Carte carte) {
        instance.setCarte(carte);
        return instance;
    }

    public static void setInstance(ChefCuisine instance) {
        ChefCuisine.instance = instance;
    }

    public List<ChefPartie> getChefParties() {
        return chefParties;
    }

    public void setChefParties(List<ChefPartie> chefParties) {
        this.chefParties = chefParties;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    public void organiserCommande(Commande commande) throws InterruptedException {

        for (Plat plat : commande.getPlats()) {
            choisirChefPartie().faireRecette(plat);
        }
    }

    public void ajouterPlatCarte(Plat plat) {
        carte.setPlats(plat);
    }

    public void retirerPlatCarte() {
        carte.setPlats(null);
    }

    public ChefPartie choisirChefPartie() {

        while (true) {
            for (ChefPartie chefParty : chefParties) {

                if (chefParty.isAvailable()) {
                    chefParty.setAvailable(false);
                    return chefParty;
                }
            }
        }
    }
}
