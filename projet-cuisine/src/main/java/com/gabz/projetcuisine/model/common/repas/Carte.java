package com.gabz.projetcuisine.model.common.repas;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

public class Carte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date jour;
    private List<Vin> vins;
    private List<Plat> plats;

    public Carte(Date jour, List<Vin> vins, List<Plat> plats) {
        this.jour = jour;
        this.vins = vins;
        this.plats = plats;
    }

    public int getId() {
        return id;
    }

    public Date getJour() {
        return jour;
    }

    public List<Vin> getVins() {
        return vins;
    }

    public List<Plat> getPlats() {
        return plats;
    }
}
