package com.gabz.projetcuisine.model.cuisine.lavage;

import com.gabz.projetcuisine.model.common.vaisselle.assiette.Assiette;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Couteau;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.CuillereCafe;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.CuillereSoupe;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Fourchette;
import com.gabz.projetcuisine.model.common.vaisselle.verre.Verre;

import java.util.List;

public class LaveVaisselle {

    private static LaveVaisselle instance = new LaveVaisselle();
    private List<Assiette> assiettes;
    private List<Verre> verres;
    private List<Fourchette> fourchettes;
    private List<Couteau> couteaux;
    private List<CuillereSoupe> cuillereSoupes;
    private List<CuillereCafe> cuillereCafes;


    private LaveVaisselle() {}

    public static LaveVaisselle getInstance() {
        return instance;
    }

    public List<Assiette> getAssiettes() {
        return assiettes;
    }

    public List<Verre> getVerres() {
        return verres;
    }

    public List<Fourchette> getFourchettes() {
        return fourchettes;
    }

    public List<Couteau> getCouteaux() {
        return couteaux;
    }

    public List<CuillereSoupe> getCuillereSoupes() {
        return cuillereSoupes;
    }

    public List<CuillereCafe> getCuillereCafes() {
        return cuillereCafes;
    }
}
