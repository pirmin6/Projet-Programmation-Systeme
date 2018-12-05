package com.gabz.projetcuisine.model.cuisine.personnel;

import java.util.List;

public class ChefPartie {

    private static int nbrInstances = 2;
    private List<Commis> commis;
    private Plongeur plongeurs;

    public ChefPartie() {
    }

    public List<Commis> getCommis() {
        return commis;
    }

    public void setCommis(List<Commis> commis) {
        this.commis = commis;
    }

    public Plongeur getPlongeurs() {
        return plongeurs;
    }

    public void setPlongeurs(Plongeur plongeurs) {
        this.plongeurs = plongeurs;
    }

    public void faireRecette() {

    }
}
