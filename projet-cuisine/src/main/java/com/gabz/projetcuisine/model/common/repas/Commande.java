package com.gabz.projetcuisine.model.common.repas;

import javax.persistence.*;
import java.util.List;

public class Commande {

    private int numeroTable;
    private List<Plat> plats;

    public Commande(int numeroTable, List<Plat> plats) {
        this.numeroTable = numeroTable;
        this.plats = plats;
    }

    public int getNumeroTable() {
        return numeroTable;
    }

    public List<Plat> getPlats() {
        return plats;
    }
}
