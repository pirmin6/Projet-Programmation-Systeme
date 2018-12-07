package com.gabz.projetcuisine.model.cuisine.materiel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Materiel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;
    protected double tempsLavage;
    protected boolean propre = true;

    public Materiel() {
        this.propre = false;
    }

    public int getId() {
        return id;
    }

    public double getTempsLavage() {
        return tempsLavage;
    }

    public boolean isPropre() {
        return propre;
    }

    public void setPropre(boolean propre) throws InterruptedException {
        this.propre = propre;
    }

    public abstract void remettreEnService();
}
