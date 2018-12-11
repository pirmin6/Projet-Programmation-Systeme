package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.exception.InstanciationNotAllowedException;
import com.gabz.projetcuisine.model.common.repas.ComptoirPlatAttente;
import com.gabz.projetcuisine.model.common.repas.Plat;
import com.gabz.projetcuisine.model.cuisine.materiel.Materiel;
import com.gabz.projetcuisine.model.cuisine.materiel.MaterielFactory;
import com.gabz.projetcuisine.model.cuisine.repas.EtapeRecette;
import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecord;
import com.gabz.projetcuisine.model.cuisine.repas.Recette;

import java.util.ArrayList;
import java.util.List;

public class ChefPartie implements ICuisinier {

    private static int nbrInstances = 0;
    private List<Commis> commis;
    private Plongeur plongeur;
    private boolean available;
    private MaterielFactory materielFactory;

    public ChefPartie() throws InstanciationNotAllowedException {

        nbrInstances++;
        if (nbrInstances > 2 ) throw new InstanciationNotAllowedException();

        materielFactory = MaterielFactory.getMaterielFactory();

        available = true;
        plongeur = Plongeur.getInstance();
        commis = new ArrayList<>();
        commis.add(new Commis(new ArrayList<>()));
        commis.add(new Commis(new ArrayList<>()));
    }

    public List<Commis> getCommis() {
        return commis;
    }

    public void setCommis(List<Commis> commis) {
        this.commis = commis;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Plongeur getPlongeur() {
        return plongeur;
    }

    public void setPlongeur(Plongeur plongeur) {
        this.plongeur = plongeur;
    }

    public void faireRecette(Plat plat) throws InterruptedException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        Recette recette = plat.getRecette();
        this.available = false;
        List<EtapeRecette> etapes = recette.getEtapes();
        List<IngredientRecord> recipeIngredients = recette.getIngredients();

        // recup tout les ingredients pour la recette

        Commis choosenCommis = chooseAvailableCommis();

        choosenCommis.chercherIngredients(recipeIngredients);

        for (EtapeRecette etapeRecette: etapes) {

            if (etapeRecette.isFaisableParPersonnelBasique()) {
                    choosenCommis.faireEtapeRecette(etapeRecette);

            } else {
                if (etapeRecette.isFaisableEnSimultanée()) {

                    new Thread(() -> {
                        try {
                            faireEtapeRecette(etapeRecette);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }).start();
                } else {
                    faireEtapeRecette(etapeRecette);
                }
            }

        }
        choosenCommis.amenerPlatComptoir(plat);
        this.available = true;
    }

    public Commis chooseAvailableCommis() {

        while (true) {

            for (Commis commis : commis) {
                if (commis.isAvailable()) {
                    return commis;
                }
            }
        }
    }

    @Override
    public void faireEtapeRecette(EtapeRecette etapeRecette) throws InterruptedException, IllegalAccessException, InstantiationException, ClassNotFoundException {

        List<Materiel> materielEtape = new ArrayList<>();

        for (String s : etapeRecette.getMateriels()) {
            materielEtape.add(materielFactory.getMateriel(s));
        }

        Thread.sleep(etapeRecette.getTempsRealisation());

        for (Materiel materiel : materielEtape) {
            materiel.poserSurEvier();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        nbrInstances --;
    }
}
