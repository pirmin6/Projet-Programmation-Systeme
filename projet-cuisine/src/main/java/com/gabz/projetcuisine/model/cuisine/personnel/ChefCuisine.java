package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.exception.InstanciationNotAllowedException;
import com.gabz.projetcuisine.model.common.repas.Carte;
import com.gabz.projetcuisine.model.common.repas.Commande;
import com.gabz.projetcuisine.model.common.repas.Plat;

import java.util.ArrayList;
import java.util.List;

public class ChefCuisine {

    private static int nbrInstance = 0;
    private static ChefCuisine instance;
    private List<ChefPartie> chefParties;
    private List<Commande> commandes;
    private Carte carte;

    private ChefCuisine() throws InstanciationNotAllowedException {

        chefParties = new ArrayList<>();
        chefParties.add(new ChefPartie());
        chefParties.add(new ChefPartie());
    }

    public static ChefCuisine getInstance(Carte carte) throws InstanciationNotAllowedException {

        if (nbrInstance > 0)  {
            return instance;
        }
        instance = new ChefCuisine();
        instance.setCarte(carte);
        return instance;
    }

    public static ChefCuisine getInstance() throws InstanciationNotAllowedException {

        if (nbrInstance > 0)  {
            return instance;
        }
        nbrInstance++;
        instance = new ChefCuisine();
        return instance;
    }

    public List<ChefPartie> getChefParties() {
        return chefParties;
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

    public void organiserCommande(Commande commande) throws InterruptedException, IllegalAccessException,
            InstantiationException, ClassNotFoundException {

        List<Thread> threadsPreparationRecette = new ArrayList<>();
        List<Plat> plats = new ArrayList<>();
        // preparation de plusieurs plats en simultané
        for (Plat plat : commande.getPlats()) {

            threadsPreparationRecette.add(new Thread(() -> {
                try {
                    plats.add(choisirChefPartie().faireRecette(plat));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }));
            // Lancer le dernier Thread ajouté
            threadsPreparationRecette.get(threadsPreparationRecette.size() - 1).start();
        }

        // attendre la realisation de l'ensemble des plats de la commande
        for (Thread thread : threadsPreparationRecette) {
            thread.join();
        }

        // ajouter les plats au comptoir d'attente
        for (Plat plat : plats) {
            // on doit passer par la classe chef de partie pour recuperer un commis.
            ChefPartie.chooseAvailableCommis().amenerPlatComptoir(plat);
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
