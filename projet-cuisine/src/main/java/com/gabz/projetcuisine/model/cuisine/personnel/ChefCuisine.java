package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.repas.Carte;
import com.gabz.projetcuisine.model.common.repas.Commande;

import java.util.List;

public class ChefCuisine {

    private static ChefCuisine instance = new ChefCuisine();
    private List<ChefPartie> chefParties;
    private List<Commande> commandes;
    private Carte carte;
    private IOrganisation organisation;

    private ChefCuisine() {

    }

    public static ChefCuisine getChefCuisineInstace() {
        return instance;
    }

    public static ChefCuisine getInstance() {
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

    public IOrganisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(IOrganisation organisation) {
        this.organisation = organisation;
    }

    private void organiserCommande(Commande commande) {
        this.organisation.organiserCommande(commande);
    }

    private void changerCarte() {

    }

    private void choisirChefPartie() {

    }
}
