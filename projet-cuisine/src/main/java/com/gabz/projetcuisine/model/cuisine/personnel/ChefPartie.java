package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.exception.InstanciationNotAllowedException;
import com.gabz.projetcuisine.model.common.repas.Plat;
import com.gabz.projetcuisine.model.cuisine.repas.EtapeRecette;
import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecordEtapeRecette;
import com.gabz.projetcuisine.model.cuisine.repas.Recette;

import java.util.*;

public class ChefPartie extends Cuisinier {

    private static int nbrInstances = 0;
    private static List<Commis> commis;
    private Plongeur plongeur;
    private boolean available;

    public ChefPartie() throws InstanciationNotAllowedException {

        nbrInstances++;
        if (nbrInstances > 2) throw new InstanciationNotAllowedException();

        available = true;
        plongeur = Plongeur.getInstance();

        // Si une instance a déja été créée on a plus besoin d'initialiser les commis.
        if (commis == null) {

            commis = new ArrayList<>();
            commis.add(Commis.getFirstCommis(new ArrayList<>()));
            commis.add(Commis.getSecondCommis(new ArrayList<>()));
        }

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

    public Plat faireRecette(Plat plat) throws InterruptedException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        Recette recette = plat.getRecette();
        this.available = false;
        List<EtapeRecette> etapes = recette.getEtapes();
        List<IngredientRecordEtapeRecette> recipeIngredients = recette.getIngredients();

        // recup tout les ingredients pour la recette

        Commis choosenCommis = chooseAvailableCommis();

        choosenCommis.chercherIngredients(recipeIngredients);

        List<Thread> threadsEtapeRecette = new ArrayList<>();

        // trier les etape de la recette dans l'ordre
        etapes.sort(Comparator.comparingInt(EtapeRecette::getNbrEtape));

        for (EtapeRecette etapeRecette : etapes) {

            // Verification si etape peut etre faite en simultané
            if (etapeRecette.isFaisableEnSimultanée()) {

                // Creation du thread si possibilité de faire letape de recette en simultané
                threadsEtapeRecette.add(new Thread(() -> {
                    try {
                        // Verification si etape peut etre faite par commis
                        if (etapeRecette.isFaisableParPersonnelBasique()) {

                            choosenCommis.faireEtapeRecette(etapeRecette);
                        } else {

                            this.faireEtapeRecette(etapeRecette);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }));

                // On lance le dernier Thread ajouté
                threadsEtapeRecette.get(threadsEtapeRecette.size() - 1).start();

            } else {

                if (etapeRecette.isFaisableParPersonnelBasique()) {

                    choosenCommis.faireEtapeRecette(etapeRecette);
                } else {

                    this.faireEtapeRecette(etapeRecette);
                }
            }
        }

        //attendre la realisation de l'ensemble des etapes
        for (Thread thread : threadsEtapeRecette) {
            thread.join();
        }

        // remettre le chef de partie a disposition
        this.available = true;

        // On retourne le plat cuisiné
        return plat;
    }

    public static Commis chooseAvailableCommis() {

        while (true) {

            for (Commis commis : commis) {
                if (commis.isAvailable()) {
                    return commis;
                }
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        nbrInstances--;
    }
}
