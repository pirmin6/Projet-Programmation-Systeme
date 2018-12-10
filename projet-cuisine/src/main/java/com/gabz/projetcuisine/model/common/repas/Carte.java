package com.gabz.projetcuisine.model.common.repas;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Carte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date jour;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Vin> vins;
    @OneToOne
    private Plat plats;

    public Carte(Date jour, List<Vin> vins, Plat plats) {
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

    public Plat getPlats() {
        return plats;
    }

    public void setPlats(Plat plats) {
        this.plats = plats;
    }
}
