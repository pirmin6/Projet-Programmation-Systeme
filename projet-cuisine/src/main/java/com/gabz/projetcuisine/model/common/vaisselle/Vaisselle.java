package com.gabz.projetcuisine.model.common.vaisselle;

public abstract class Vaisselle {

    protected boolean propre = true;

    public Vaisselle() {
        this.propre = false;
    }

    public boolean isPropre() {
        return propre;
    }

    public void setPropre(boolean propre) {
        this.propre = propre;
    }
}