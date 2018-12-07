package com.gabz.projetcuisine.model.common.repas;

import com.gabz.projetcuisine.model.common.repas.Plat;

import java.util.ArrayList;
import java.util.List;

public class ComptoirPlatAttente {

    private static ComptoirPlatAttente comptoir = new ComptoirPlatAttente();
    List<Plat> plats;

    private ComptoirPlatAttente() {
        this.plats = new ArrayList<Plat>();
    }

    public static ComptoirPlatAttente getComptoir() {
        return comptoir;
    }

    public List<Plat> getPlats() {
        return plats;
    }

    public void addPlat(Plat plat) {

    }
}
