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
    private IOrganisation organisation;

    private ChefCuisine() {

    }

    public static ChefCuisine getInstance(Carte carte, IOrganisation organisation) {
        instance.setCarte(carte);
        instance.setOrganisation(organisation);
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

    public void organiserCommande(Commande commande) {
        this.organisation.organiserCommande(commande);
    }

    public void ajouterPlatCarte(Plat plat) {

    }

    public void retirerPlatCarte(int idPlat) {

    }

    public void choisirChefPartie() {

    }
}
