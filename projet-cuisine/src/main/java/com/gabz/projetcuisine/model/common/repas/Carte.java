package com.gabz.projetcuisine.model.common.repas;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class Carte {

    private Date jour;
    private List<Vin> vins;
    private Plat plats;

    public Carte(Date jour, List<Vin> vins, Plat plats) {
        this.jour = jour;
        this.vins = vins;
        this.plats = plats;
    }

    public Date getJour() {
        return jour;
    }

    public List<Vin> getVins() {
        return vins;
    }

    public Plat getPlats() {
        return plats;
    }

    public void setPlats(Plat plats) {
        this.plats = plats;
    }
}
