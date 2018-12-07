package com.gabz.projetcuisine.model.common.repas;

import javax.persistence.*;
import java.util.List;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int numeroTable;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Plat> plats;

    public Commande(int numeroTable, List<Plat> plats) {
        this.numeroTable = numeroTable;
        this.plats = plats;
    }

    public int getId() {
        return id;
    }

    public int getNumeroTable() {
        return numeroTable;
    }

    public List<Plat> getPlats() {
        return plats;
    }
}
